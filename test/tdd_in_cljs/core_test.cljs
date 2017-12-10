(ns tdd-in-cljs.core-test
  (:require [cljs.test :refer-macros [is testing async]]
            [devcards.core :refer-macros [deftest]]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))

(deftest b-test
         (testing "FIXME asynchronously, I fail."
           (async done
             (js/setTimeout (fn []
                              (throw (js/Error. "Oops!")))
                            100))))