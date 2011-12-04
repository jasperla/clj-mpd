# clj-mpd

Clojure library wrapping the javampd [1] library along with several
extra helper functions and other functionality.

1: http://www.thejavashop.net/javampd/

## ToDo

Evertying, which includes:
* Implement "useful" methods from javampd.
* Fix NULL derefs when MPD isn't running/playing.
* Proper way to setup a connection and use it throughout
  clj-mpd.test_app, instead re-creating MPD/MPDPlayer all the time.

### To implement:

<pre>
MPDAudioInfo
MPDItem
	MPDAlbum
	MPDArtist
	MPDGenre
	MPDSavedPlaylist
	MPDSong
</pre>

Implemented in:
<pre>
MPD	 	- clj-mpd.core
MPDAdmin	- clj-mpd.admin
MPDCommand
MPDDatabase	- clj-mpd.database
MPDFile		- clj-mpd.file
MPDOutput
MPDPlayer	- clj-mpd.player
MPDPlaylist	- clj-mpd.playlist
</pre>

## Usage

Don't use it yet (partly because there is nothing to use..)

If you do, use 'lein run':
gurthang:clj-mpd {1570} lein run
Current song: Deadmau5 - Dance Department
From the album: Dance Department (21-05-2011)
Time played: 20:41 / 57:37
gurthang:clj-mpd {1571} 

## License

Copyright (C) 2011 Jasper Lievisse Adriaanse <jasper@humppa.nl>

Licensed under the EPL (see the file COPYING).
