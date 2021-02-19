(ns wilfred.core
  (:require react-dom
            [reagent.dom :as dom]
            cljsjs.codemirror
            [wilfred.app :as app]))

;; -- VIEW --------------------------------------------------------------------

(defn app-component
  []
  [:div
   [app/component]])

(dom/render [app-component]
            (. js/document (getElementById "app")))

;;(.render js/ReactDOM
;;  (.createElement js/React "h2" nil "Wilfred")
;;  (.getElementById js/document "app"))
