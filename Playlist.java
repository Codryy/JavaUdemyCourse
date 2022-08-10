import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Album> albums = new ArrayList<>();

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24
    }
}

public class Album {

    private String name; // create new variable "name" of type String
    private String artist; // create new variable "artist" of type String
    private ArrayList<Song> songs; // create new variable "songs" of type ArrayList<Song>

    public Album(String name, String artist) {
        this.name = name; // initialize "name" field
        this.artist = artist; // initialize "artist" field
        this.songs = new ArrayList<Song>(); // initialize "songs" field
    }

    // Function to add a song to the "songs" ArrayList
    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) { // check to see if the song is already added
            this.songs.add(new Song(title, duration)); // if it's not added, then add the song to the "songs" Array
            return true;
        }
        return false;
    }


    // Function to check if the song was already added
    private Song findSong(String title) {
        for ( int i = 0; i < this.songs.size(); i++) {
            if ( this.songs.get(i).getTitle().equals(title)) { //verifying if there is a song in the "songs" Array that corresponds with the title passed as a parameter
                return this.songs.get(i); // if we have a match then return the position
            }
        }
        return null;
    }

    // We overload the function addToPlayList

    // Function to add a song in the "playlist" object of type LinkedList<Song> by the trackNumber of the song
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1; // we create a new variable named index which takes the value of "trackNumber - 1" so we can iterate through the Array starting from index 0 in case "trackNumber" is 1 -> "trackNumber" won't be 0
        if ( (index >= 0 ) && (trackNumber <=this.songs.size()) ) { // we check if the index ( or trackNumber - 1 ) exists in the Array
            playlist.add(this.songs.get(index)); // if it exists then we add the song to the playlist LinkedList
            return true;
        }
        return false;
    }

    // Function to add a song in the "playlist" object of type LinkedList<Song> by the name of the song
    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song song = findSong(title); // we create a new object, so we can store the object returned from the "findSong()" function
        if (song != null) { // we check if the returned object has a song
            playlist.add(song); // if the returned object has a song we then add it to the playlist
            return true;
        }
        return false;
    }
}

public class Song {

    private String title; // create new variable "title" of type String
    private double duration; // create new variable "duration" of type double

    public Song(String title, double duration) {
        this.title = title; // initialize "title" field
        this.duration = duration; // initialize "duration" field
    }

    // Getter for the title
    public String getTitle() {
        return title;
    }

    // We override the function toString() of class Object in order to output our title and duration of song in a playlist later on
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
