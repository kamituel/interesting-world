(ns kamituel.ngm-toc.ui.react-compat
  (:require [cljsjs.material-ui]
            [reagent.core :as r]))

(defn adapt
  [& args]
  (r/adapt-react-class (apply aget js/window args)))

;; Material UI.
(def mui-theme-provider (adapt "MaterialUI" "MuiThemeProvider"))
(def paper              (adapt "MaterialUI" "Paper"))
(def auto-complete      (adapt "MaterialUI" "AutoComplete"))
(def divider            (adapt "MaterialUI" "Divider"))
(def font-icon          (adapt "MaterialUI" "FontIcon"))
(def list-              (adapt "MaterialUI" "List"))
(def list-item          (adapt "MaterialUI" "ListItem"))
(def card               (adapt "MaterialUI" "Card"))
(def card-header        (adapt "MaterialUI" "CardHeader"))
(def card-text          (adapt "MaterialUI" "CardText"))
(def avatar             (adapt "MaterialUI" "Avatar"))
(def text-field         (adapt "MaterialUI" "TextField"))
(def checkbox           (adapt "MaterialUI" "Checkbox"))
