(ns osm-reverter.core
  (:require [clojure.string :as str])
  (:gen-class))

;(def home (System/getenv "HOME"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

; replicates the config in the BEGIN block

; create a map we can assoc to 

(def config {})

(defn parseconfig
; should return a map of the config
  [contents]
  (into (sorted-map) (map #(str/split % #"=") (str/split contents #"\n")))
)

(defn readconfig 
  []
  (let [home (System/getenv "HOME")]
    (parseconfig (slurp (str home "/.osmtoolsrc")))
  )
)

