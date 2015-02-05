(ns osm-reverter.osmapi
(:require [clj-http.client :as client])
)

(defn geturl
  [url]
  (client/get url)
  )

(defn get_with_credentials
  [url user passwd]
  )

(defn add_to_discussion
  [changeset comment]
  )

(defn put
  [url body]
  (client/put {:body body})
  )

(defn post
  [url body]
  (client/post {:body body})
  )

(defn delete
  [url body]
  )

(defn debuglog
  [request response]
  )



