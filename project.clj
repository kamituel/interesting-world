(defproject ngm-toc "0.1.0-SNAPSHOT"
  :description "A website listing all articles from a polish edition of National Geographic, on a map. And more."
  :url "..."
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0-alpha15"]
                 [org.clojure/clojurescript "1.9.518"]
                 [org.clojure/core.async "0.3.442"]
                 [reagent  "0.6.1" :exclusions [cljsjs/react cljsjs/react-dom]]
                 [re-frame "0.9.2" :exclusions [cljsjs/react cljsjs/react-dom]]
                 [cljsjs/material-ui "0.17.4-0"]
                 [org.clojars.stumitchell/clairvoyant "0.2.1"]
                 [day8/re-frame-tracer "0.1.1-SNAPSHOT"]]
  :hooks [leiningen.cljsbuild]
  :clean-targets ^{:protect false} ["resources/public/js"]
  :plugins [[lein-cljsbuild "1.1.5" :exclusions [org.clojure/clojure]]
            [lein-figwheel "0.5.10" :exclusions [org.clojure/clojure]]]
  :figwheel {:server-port 3451
             :css-dirs ["resources/public/css"]}
  :profiles {:dev {:dependencies [[figwheel "0.5.9"]
                                  [binaryage/devtools "0.9.4"]
                                  [devcards "0.2.3" :exclusions [cljsjs/react cljsjs/react-dom org.clojure/clojure org.clojure/clojurescript]]]
                   :cljsbuild {:builds {:frontend {:figwheel true
                                                   :source-paths ["src/clojure" "dev/clojure"]
                                                   :compiler {:optimizations :none
                                                              :asset-path "js"
                                                              :source-map true
                                                              :preloads [devtools.preload
                                                                         kamituel.ngm-toc.dev]
                                                              :external-config {:devtools/config {:features-to-install [:formatters :hints]}}
                                                              :closure-defines {"clairvoyant.core.devmode" true}}}
                                        :devcards {:figwheel {:devcards true}
                                                   :source-paths ["src/clojure" "dev/clojure"]
                                                   :compiler {:main "kamituel.ngm-toc.devcards"
                                                              :output-dir "resources/public/js/devcards"
                                                              :output-to "resources/public/js/devcards/app.js"
                                                              :asset-path "js/devcards"
                                                              :source-map true
                                                              :preloads [devtools.preload
                                                                         kamituel.ngm-toc.dev]}}}}}
             :prod {:cljsbuild {:builds {:frontend {:figwheel false
                                                    :compiler {:optimizations :advanced
                                                               :pretty-print false
                                                               :source-map "resources/public/js/app.js.map"}}}}}}
  :cljsbuild {:builds {:frontend {:source-paths ["src/clojure"]
                                  :compiler {:main "kamituel.ngm-toc.core"
                                             :output-dir "resources/public/js"
                                             :output-to "resources/public/js/app.js"}}} })
