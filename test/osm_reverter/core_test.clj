(ns osm-reverter.core-test
  (:require [clojure.test :refer :all]
            [osm-reverter.core :refer :all]
            [osm-reverter.osmapi :refer :all]
))

(deftest get-test
  (testing "GET request"
    (let [result (geturl "http://www.openstreetmap.org")]
    (println result)
    (is (not (empty? result)))
   )))

(deftest config-test
  (testing "read the config"
    (let [result (readconfig)]
    (println result)
    (is (not (empty? result)))
;    (is (= "zool" (get result :username)))
   )))

