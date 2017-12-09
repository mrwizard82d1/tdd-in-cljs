(defproject tdd-in-cljs "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/mrwizard82d1/tdd-in-cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[lein-doo "0.1.8"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.946"]]
  :plugins [[lein-cljsbuild "1.1.7" :exclusions [[org.clojure/clojure]]]
            [lein-doo "0.1.8"]
            [lein-figwheel "0.5.14"]]
  :clean-targets ^{:protect false} [:target-path "out" "resources/public/cljs"]
  :figwheel {:css-dirs "resources/public/css"}
  :cljsbuild 
  {:test-commands {"test" ["lein" "doo" "phantom" "test" "once"]}
   :builds [{:id "dev" ; development configuration
             :source-paths ["src"] ; paths to monitor for build
             :figwheel true ; Enable Figwheel
             :compiler {:main tdd-in-cljs.core ; your main namespace
                        :asset-path "cljs/out" ; relative path for load-dependent files 
                        :output-to "resources/public/cljs/main.js" ; location of main build file
                        :output-dir "resources/public/cljs/out" ; directory for temporary files
                        :source-map-timestamp true}} ; source maps - hurray!
            {:id "test"
             :source-paths ["src" "test"]
             :compiler {:main runners.doo
                        :optimizations :none
                        :output-to "resources/public/cljs/tests/all-tests.js"}}]})

