(defproject tdd-in-cljs "0.1.0-SNAPSHOT"
  :description "TDD in ClojureScript - Code from the Blog"
  :url "https://github.com/mrwizard82d1/tdd-in-cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.946"]]
  :plugins [[lein-cljsbuild "1.1.7" :exclusions [[org.clojure/clojure]]]
            [lein-figwheel "0.5.14"]]
  :clean-targets ^{:protect false} [:target-path "out" "resources/public/cljs"]
  :figwheel {:css-dirs ["resources/public/css"]} ;; automated reload of CSS files
  :cljsbuild {:builds [{:id "dev" ; development configuration
                        :source-paths ["src"] ; paths to monitor for changes
                        :figwheel true ; enable Figwheel
                        :compiler {:main tdd-in-cljs.core ; the main namespace
                                   :asset-path "cljs/out" ; relative location of load-dependent files
                                   :output-to "resources/public/cljs/main.js" ; where main file will be built
                                   :output-dir "resources/public/cljs/out" ; directory for temporary files
                                   :source-map-timestamp true}}]}) ; Source maps - hurray!


