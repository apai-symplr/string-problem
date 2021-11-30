(ns string-task.core-test
  (:require [clojure.test :refer :all]
            [string-task.core :refer :all]))


(deftest count-sentence-chars-test
  (testing "Test count-sentence-char method"
    (is (= 9 (count-sentence-chars ["I" "am" "Aditya"])))
    )
  )
(deftest count-char-instances-test
  (testing "Test char Count function"
    (are [x y] (= x y)
               2 (count-char-instances \a (seq (char-array "Aditya")))
               2 (count-char-instances \a (seq (char-array "aditya"))))
    ))