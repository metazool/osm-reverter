(ns osm-reverter.core-test
  (:require [clojure.test :refer :all]
            [osm-reverter.core :refer :all]
            [osm-reverter.osmapi :as api]
))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

(deftest get-test
  (testing "GET request"
    (let [result (osm-reverter.osmapi.geturl "http://www.openstreetmap.org")]
    (is (not empty? result))
   )))
