;  Copyright (c) 2011 Jasper Lievisse Adriaanse <jasper@humppa.nl>
;  The use and distribution terms for this software are covered by the
;  Eclipse Public License 1.0 (http://opensource.org/licenses/eclipse-1.0.php)
;  which can be found in the file epl-v10.html at the root of this distribution.
;  By using this software in any fashion, you are agreeing to be bound by
;  the terms of this license.
;  You must not remove this notice, or any other, from this software.

(ns ^{:author "Jasper Lievisse Adriaanse"
      :doc "Playlist related functions for clj-mpd"}
  clj-mpd.player)

(defn create-player
  "Instantiate a MPDPlayer object"
  [mpd]
  (.getMPDPlayer mpd))

(defn get-current-song
  "Get current song as MPDSong"
  [player]
  (.getCurrentSong player))

(defn get-elapsed-time
  "Get the elapsed time in seconds."
  [player]
  (.getElapsedTime player))

(defn mute
  "Mutes the volume."
  [player]
  (.mute player))

(defn pause
  "Pause the current song"
  [player]
  (.pause player))

(defn play
  "Play the current song."
  [player]
  (.play player))

(defn play-next
  "Play the next song."
  [player]
  (.playNext player))

(defn play-prev
  "Play the previous song."
  [player]
  (.playPrev player))

(defn set-random
  "Turn random playing on/off."
  [player random]
  (.setRandom player random))

(defn set-repeat
  "Turn repeated playing on/off."
  [player repeat]
  (.setRepeat player repeat))

(defn stop
  "Stop the current song."
  [player]
  (.stop player))

(defn unmute
  "Unmutes the player."
  [player]
  (.unMute player))
