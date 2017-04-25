(ns kamituel.ngm-toc.react-compat
  (:require [cljsjs.material-ui]
            [reagent.core :as r]))

;; Material UI.
(def mui-theme-provider (r/adapt-react-class (aget js/window "MaterialUI" "MuiThemeProvider")))
(def paper              (r/adapt-react-class (aget js/window "MaterialUI" "Paper")))
(def auto-complete      (r/adapt-react-class (aget js/window "MaterialUI" "AutoComplete")))
(def divider            (r/adapt-react-class (aget js/window "MaterialUI" "Divider")))
(def font-icon          (r/adapt-react-class (aget js/window "MaterialUI" "FontIcon")))
(def list-              (r/adapt-react-class (aget js/window "MaterialUI" "List")))
(def list-item          (r/adapt-react-class (aget js/window "MaterialUI" "ListItem")))
(def card               (r/adapt-react-class (aget js/window "MaterialUI" "Card")))
(def card-header        (r/adapt-react-class (aget js/window "MaterialUI" "CardHeader")))
(def card-text          (r/adapt-react-class (aget js/window "MaterialUI" "CardText")))
(def avatar             (r/adapt-react-class (aget js/window "MaterialUI" "Avatar")))
(def text-field         (r/adapt-react-class (aget js/window "MaterialUI" "TextField")))
(def checkbox           (r/adapt-react-class (aget js/window "MaterialUI" "Checkbox")))
