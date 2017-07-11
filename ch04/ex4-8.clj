;; 예제 4-8 클로저에서의 메모이제이션

(ns name-hash.core)
(use '[clojure.string :only (join split)])

(let [alpha (into #{} (concat (map char (range (int \a) (inc (int \z))))
                              (map char (range (int \A) (inc (int \Z))))))
      rot13-map (zipmap alpha (take 52 (drop 26 (cycle alpha))))]
  (defn rot13
    "Given an input string, produce the rot 13 version of
  the String. \"hello\" -> \"uryyb\""
    [s]
    (apply str (map #(get rot13-map % %) s))))

(defn name-hash [name]
  (apply str (map #(rot13 %) (split name #"\d"))))

(def name-hash-m (memoize name-hash))
