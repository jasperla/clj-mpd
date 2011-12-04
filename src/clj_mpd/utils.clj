;  Copyright (c) 2011 Jasper Lievisse Adriaanse <jasper@humppa.nl>
;  The use and distribution terms for this software are covered by the
;  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;  which can be found in the file epl-v10.html at the root of this distribution.
;  By using this software in any fashion, you are agreeing to be bound by
;  the terms of this license.
;  You must not remove this notice, or any other, from this software.

(ns ^{:author "Jasper Lievisse Adriaanse"
      :doc "Various helper functions for use with clj-mpd"}
  clj-mpd.utils)

(defn format-seconds
  "Takes a number of seconds, returns a String like \"1:40\"."
  [s]
  (format "%d:%02d" (quot s 60) (mod s 60)))
