(defproject clj-lambda "0.1.0-SNAPSHOT"
  :description "Clojure AWS lambda + Terraform test project"
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/data.json "0.2.6"]
                 [uswitch/lambada "0.1.2"]]
  :profiles {
             :uberjar {:aot :all}}
  :uberjar-name "clj-lambda.jar")