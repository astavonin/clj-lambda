(ns clj-lambda.lambda
  (:require [uswitch.lambada.core :refer [deflambdafn]]
            [clojure.data.json :as json]
            [clojure.java.io :as io]))

(defn handle-event
  [event]
  (println "Got the following event: " (pr-str event))
  {:status "ok"})

(deflambdafn clj-lambda.lambda.LambdaFn
             [in out ctx]
             (let [event (json/read (io/reader in))
                   res (handle-event event)]
               (with-open [w (io/writer out)]
                 (json/write res w))))
