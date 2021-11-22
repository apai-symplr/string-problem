(ns string-task.debugmacro)
(defmacro dbg [body] `(let [x# ~body] (println "dbg:" '~body "=" x#) x#))

