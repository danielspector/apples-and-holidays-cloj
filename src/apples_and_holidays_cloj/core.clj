(ns apples-and-holidays-cloj.core
  (:gen-class))

(def fruit [:apple :orange :apple])

(def target :apple)

(defn apple-picker
  [fruit-arr]
  (filter #(= target %) fruit-arr)
  )

(def holiday-supplies 
  {:winter {
            :christmas ["Lights" "Wreath"]
            :new-years ["Party Hats"]}
   :summer {
            :fourth-of-july ["Fireworks" "BBQ"]}
   :fall {
          :thanksgiving ["Turkey"]}
   :spring {
            :memorial-day ["BBQ"]}
   }
  )

(defn first-memorial-day-supply []
  (last ((holiday-supplies :summer) :fourth-of-july)))

(defn add-supplyto-winter []
 (update-in holiday-supplies [:winter :new-years] #(conj % "Lattes")))

(defn add-supply-to-memorial []
  (update-in holiday-supplies [:spring :memorial-day] #(conj % "Coconuts")))

(defn winter-supplies-from-holidays []
 (flatten (vals (holiday-supplies :winter))))

(defn all-bbq-holidays []
  )

(defn -main
  [& args]
  (println "Hello, World!"))
