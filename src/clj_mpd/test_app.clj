(ns clj-mpd.test_app
  (:require [clj-mpd.core]
            [clj-mpd.playlist :as plist]
            [clj-mpd.player :as player]
            [clj-mpd.item.song :as song]
            [clj-mpd.utils :as utils]))

(defn setup-mpd []
  (clj-mpd.core/init-mpd :hostname "localhost" :port "6600"))

(defn setup-player [mpd]
  (player/create-player mpd))

(defn ^{:doc "Not much here, just some test code."}
  -main [& args]
  (do
    (print "Current song: ")
    (-> (setup-mpd) player/create-player player/get-current-song song/get-artist (print "- "))
    (-> (setup-mpd) player/create-player player/get-current-song song/get-title println)
    (print "From the album: ")
    (-> (setup-mpd) player/create-player player/get-current-song song/get-album println)
    (print "Time played: ")
    (-> (setup-mpd) player/create-player player/get-elapsed-time utils/format-seconds (print "/ "))
    (-> (setup-mpd) player/create-player player/get-current-song song/get-length utils/format-seconds println)))
