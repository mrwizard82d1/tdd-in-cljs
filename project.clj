(defproject tdd-in-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/mrwizard82d1/tdd-in-cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.946"]]
  :plugins [[lein-cljsbuild "1.1.7"]
            [lein-figwheel "0.5.14"]]
  :cljsbuild 
  {:builds [{:id "dev" ; development configuration
             :source-paths ["src"] ; paths to monitor for build
             :figwheel true ; Enable Figwheel
             :compiler {:main tdd-in-cljs.core ; your main namespace
                        :asset-path "cljs/out" ; relative path for load-dependent files 
                        :output-to "resources/public/cljs/main.js" ; location of main build file
                        :output-dir "resources/public/cljs/out" ; directory for temporary files
                        :source-map-timestamp true} ; source maps - hurray!
             }]})
