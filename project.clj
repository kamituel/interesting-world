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
                 #_[cljsjs/google-map-react "0.22.0-0" :exclusions [cljsjs/react cljsjs/react-dom]]]
  :hooks [leiningen.cljsbuild]
  :clean-targets ^{:protect false} ["resources/public/js"]
  :plugins [[lein-cljsbuild "1.1.5" :exclusions [org.clojure/clojure]]
            [lein-figwheel "0.5.10" :exclusions [org.clojure/clojure]]]
  :figwheel {:server-port 3451
             :css-dirs ["resources/public/css"]}
  :profiles {:dev {:dependencies [[figwheel "0.5.9"]]
                   :cljsbuild {:builds {:frontend {:figwheel true
                                                   :compiler {:optimizations :none
                                                              :asset-path "js"
                                                              :source-map true}}}}}
             :prod {:cljsbuild {:builds {:frontend {:figwheel false
                                                    :compiler {:optimizations :advanced
                                                               :pretty-print false
                                                               :source-map "resources/public/js/app.js.map"}}}}}}
  :cljsbuild {:builds {:frontend {:source-paths ["src/clojure"]
                                  :compiler {:main "kamituel.ngm-toc.core"
                                             :output-dir "resources/public/js"
                                             :output-to "resources/public/js/app.js"}}} })
