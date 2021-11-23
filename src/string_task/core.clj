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

(defn count-chars
  [string-vector]
  (def cnt (atom 0))
  (doseq [character string-vector]
    (reset! cnt (+ @cnt (count character)))
    )
  @cnt)

(defn foo
  "I don't do a whole lot."
  [x]
 )

(defn string-problem
  [sentence words]
  (def sentence-split (str/split sentence #" "))
  ;Count the number of characters
  (count-chars sentence-split)
  )

