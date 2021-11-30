(ns string-task.core
(:require [clojure.string :as str])
  )
(defn count-char-instances
  [key-for-char-count sentence-to-seq]
  (def cnt (atom 0))
  (def count-char-vector [])
  (doseq [i sentence-to-seq]
   (if (= key-for-char-count i) (swap! cnt inc))
   (if (= (.charAt (str/upper-case key-for-char-count) 0)  i) (swap! cnt inc))
   )
  (println @cnt)
  )
(defn count-chars
  [data]
  ;(mapcat)
  )

(defn count-sentence-chars
  [string-vector]
  (def cnt (atom 0))
  (doseq [character string-vector]
    (reset! cnt (+ @cnt (count character)))
    )
  @cnt)



(defn string-problem
  [sentence words]
  (def sentence-split (str/split sentence #" "))
  (def sentence-to-seq (seq (char-array sentence)))
  (def key-for-char-count (set (char-array (str/lower-case sentence))))
  ;Count the Total number of characters
  (count-sentence-chars sentence-split)

  )


