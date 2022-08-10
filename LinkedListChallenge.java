import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    private static final ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

        Album album = new Album("Stormbringer" , "Deep Purple");
        album.addSongToAlbum("Stormbringer", 4.6);
        album.addSongToAlbum("Love don't mean a thing", 4.22);
        album.addSongToAlbum("Holy man", 4.3);
        album.addSongToAlbum("Hold on", 5.6);
        album.addSongToAlbum("Lady double dealer", 3.21);
        album.addSongToAlbum("You can't do it right", 6.23);
        album.addSongToAlbum("High ball shooter", 4.27);
        album.addSongToAlbum("The gypsy", 4.2);
        album.addSongToAlbum("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSongToAlbum("For those about to rock", 5.44);
        album.addSongToAlbum("I put the finger on you", 3.25);
        album.addSongToAlbum("Let's go", 3.45);
        album.addSongToAlbum("Inject the venom", 3.33);
        album.addSongToAlbum("Snowballed", 4.51);
        album.addSongToAlbum("Evil wanks", 3.45);
        album.addSongToAlbum("C.O.D", 5.25);
        album.addSongToAlbum("Breaking the rules", 5.32);
        album.addSongToAlbum("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playlist = new LinkedList<>();
        albums.get(0).addToPlaylist("You can't do it right", playlist);
        albums.get(0).addToPlaylist("Holy man", playlist);
        albums.get(0).addToPlaylist("Speed king", playlist); // Does not exist
        albums.get(0).addToPlaylist(9, playlist);
        albums.get(1).addToPlaylist(8, playlist);
        albums.get(1).addToPlaylist(3, playlist);
        albums.get(1).addToPlaylist(2, playlist);
        albums.get(1).addToPlaylist(24, playlist); // There is no track 24

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size() == 0) {
            System.out.println("No songs in playlist");
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine(); // takes care of input ( enter key )

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        if ( listIterator.hasNext() ) {
                            listIterator.next();
                        }
                        goingForward = true;
                    }

                    if(listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("End of playlist");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        if ( listIterator.hasPrevious() ) {
                            listIterator.previous();
                        }
                        goingForward = false;
                    }

                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Start of playlist");
                        goingForward = true;
                    }
                    break;
                case 3:
                    if ( goingForward ) {
                        if ( listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            goingForward = false;
                        } else {
                            System.out.println("We are at the start of the list");
                        }
                    } else {
                        if ( listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            goingForward = true;
                        } else {
                            System.out.println("We are at the end of the list");
                        }
                    }
                    break;
                case 4:
                   printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if ( playlist.size() >0 ) {
                        listIterator.remove();
                        if ( listIterator.hasNext() ) {
                            System.out.println("Now playing " + listIterator.next());
                        } else if ( listIterator.hasPrevious() ) {
                            System.out.println("Now playing " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

        private static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - Quit\n" +
                "1 - Play next song\n" +
                "2 - Play previous song\n" +
                "3 - Replay current song\n" +
                "4 - List songs in the playlist\n" +
                "5 - Print available actions\n" +
                "6 - Delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("*****************");
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("*****************");
    }
}

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSongToAlbum(String nameOfSong, double durationOfSong) {
        if( findSong(nameOfSong) == null ) {
            this.songs.add(new Song(nameOfSong, durationOfSong));
            return true;
        }
        return false;
    }

    private Song findSong(String nameOfSong) {
        for(Song checkedSong: this.songs) {
            if ( checkedSong.getTitle().equals(nameOfSong) ) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if ( (index >= 0) && ( index <= this.songs.size()) ) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String nameOfSong, LinkedList<Song> playList) {
        Song checkedSong = findSong(nameOfSong);
        if ( checkedSong != null ) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + nameOfSong + " is not in this album");
        return false;
    }

}

public class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
