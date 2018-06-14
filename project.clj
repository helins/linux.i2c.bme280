(defproject dvlopt/linux.i2c.bme280
            "1.0.0-beta0"

  :description  "Talk to BME280 sensors via I2C"
  :url          "https://github.com/dvlopt/linux.i2c.bme280"
  :license      {:name "Eclipse Public License"
                 :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[dvlopt/linux.i2c "1.1.0"]
                 [dvlopt/void      "0.0.0"]]
  :profiles     {:dev {:source-paths ["dev"]
                       :main         user
                       :dependencies [[criterium                   "0.4.4"]
                                      [org.clojure/clojure         "1.9.0-alpha20"]
                                      [org.clojure/spec.alpha      "0.1.123"]
                                      [org.clojure/tools.namespace "0.2.11"]
                                      [org.clojure/test.check      "0.9.0"]]
                       :plugins      [[lein-codox      "0.10.3"]
                                      [venantius/ultra "0.5.2"]]
                       :codox        {:output-path  "doc/auto"
                                      :source-paths ["src"]}
                       :repl-options {:timeout 180000}}})
