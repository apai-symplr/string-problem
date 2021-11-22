(ns string-task.core
(:require [clojure.string :as str])
  )

(defn count-white-space
  [data]
  (def cnt (atom 0))
  (doseq [character data]
    ;(if (= 72 (int character)) (println "H found"))
    ;(reduce (fn [x col] (when (= (int x)) (swap! cnt inc))) [character ])
    (filter #((when (= % (int character))(swap! cnt inc))) [33 34 35 36 37])
    )
  @cnt)

(defn foo
  "I don't do a whole lot."
  [x]
  (println (count-white-space "Hello World")))

(defn string-problem
  [sentence words]
  (def sentence-to-char (seq sentence))
  (println sentence-to-char)
  ;(def sentence-char-count (- (count sentence-to-char) (reduce (count-white-space sentence-to-char))) )
  )

