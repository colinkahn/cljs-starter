(ns app.core
  (:require [app.ui :refer [ui]]
            [reagent.core :as r]))

(defn mount-root []
  (r/render [ui] (.getElementById js/document "root")))

(defn run []
  (mount-root))

(defonce root (run))
