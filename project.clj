(defproject Wilfred "0.0.1"
  :description "Web LIsp Front EnD, a Swank client for web browsers."
  :license {:name "MIT License"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [binaryage/devtools "0.9.4"]
                 [org.clojure/clojurescript "1.10.238" :scope "provided"]
                 [reagent "0.7.0"]]

  :source-paths ["src/cljs"]

  :plugins [[lein-figwheel "0.5.16"]
            [lein-cljsbuild "1.1.7" :exclusions [[org.clojure/clojure]]]]

  :cljsbuild {:builds
              [{:id "dev"
                :source-paths ["src/cljs"]
                :figwheel {:on-jsload "wilfred.core/on-js-reload"
                           ;; :open-urls ["http://localhost:3449/index.html"]
                           }

                :compiler {:main wilfred.core
                           :asset-path "js/compiled/out"
                           :output-to "resources/public/js/compiled/wilfred.js"
                           :output-dir "resources/public/js/compiled/out"
                           :source-map-timestamp true}}]}

  :figwheel {:css-dirs ["resources/public/css"]}

  :profiles {:dev {:dependencies [[binaryage/devtools "0.9.9"]
                                  [figwheel-sidecar "0.5.16"]
                                  [cider/piggieback "0.3.1"]]
                   :source-paths ["dev"]
                   :clean-targets ^{:protect false} ["resources/public/js/compiled"]}})
