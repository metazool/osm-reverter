(ns osm-reverter.core
  (:gen-class))

;(def home (System/getenv "HOME"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

; replicates the config in the BEGIN block

(defn parseconfig
; should return a map of the config
  [contents]
  contents
)

(defn readconfig 
  []
  (let [home (System/getenv "HOME")]
    (parseconfig (slurp (str home "/.osmtoolsrc")))
  )
)

