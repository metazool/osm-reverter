(ns osm-reverter.core-test
  (:require [clojure.test :refer :all]
            [osm-reverter.core :refer :all]
            [osm-reverter.osmapi :refer :all]
))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest get-test
  (testing "GET request"
    (let [result (geturl "http://www.openstreetmap.org")]
    (println result)
    (is (not (empty? result)))
   )))
