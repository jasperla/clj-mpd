;  Copyright (c) 2011 Jasper Lievisse Adriaanse <jasper@humppa.nl>
;  The use and distribution terms for this software are covered by the
;  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;  which can be found in the file epl-v10.html at the root of this distribution.
;  By using this software in any fashion, you are agreeing to be bound by
;  the terms of this license.
;  You must not remove this notice, or any other, from this software.

(ns ^{:author "Jasper Lievisse Adriaanse"
      :doc "clj-mpd core"}
  clj-mpd.core
  (:import (org.bff.javampd/MPD)))

(def create-mpd
  (fn [hostname port]
    (org.bff.javampd.MPD. hostname (Integer/parseInt port))))

(defn ^{:doc "Setup a connection to MPD (defaults to localhost:6600)" }
  init-mpd [& {:keys [hostname port], :or {hostname "localhost", port "6600"}}]
  (create-mpd hostname port))
