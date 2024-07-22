// // Question 10: Music Streaming Service
// // Problem Statement:
// // Create a subclass Playlist with additional data members playlistName,
// numberOfSongs, and totalDuration that inherits Song.
// // Create a class Song with data members songID, title, artist, and duration.

// // a. Override the method displaySongDetails() to include playlist-specific
// details.
// // b. Create a method addSongToPlaylist(Song song) in Playlist that updates
// the playlist details accordingly.

// import java.util.Scanner;

// class Song {
// int songID, duration;
// String title, artist;

// Scanner sc = new Scanner(System.in);

// Song() {
// System.out.println("Enter song details : ");
// System.out.println("Enter song ID : ");
// songID = sc.nextInt();
// System.out.println("Enter song duration : ");
// songID = sc.nextInt();
// sc.nextLine();
// System.out.println("Enter song title : ");
// title = sc.nextLine();
// System.out.println("Enter song artist : ");
// artist = sc.nextLine();
// }

// void displaySongDetails() {
// System.out.println("The song details are: ");
// System.out.println("Song ID: " + songID);
// System.out.println("Song Duration: " + duration);
// System.out.println("Song Title: " + title);
// System.out.println("Song Artist: " + artist);
// }
// }

// class Playlist extends Song {
// String playlistName;
// int numberOfSongs, totalDuration;
// Song songs[];

// Playlist() {
// super();
// System.out.println("Enter playlist details : ");
// System.out.println("Enter playlist name : ");
// playlistName = sc.nextLine();
// numberOfSongs = 1;
// totalDuration = super.duration;
// }

// @Override
// void displaySongDetails() {
// super.displaySongDetails();
// System.out.println("The Playlist Details are: ");
// System.out.println("Playlist Name: " + playlistName);
// System.out.println("Number of songs: " + numberOfSongs);
// System.out.println("Total Duration: " + totalDuration);
// }

// void addSongToPlaylist(Song song) {
// numberOfSongs++;
// totalDuration += song.duration;
// }

// public static void main(String[] args) {

// }
// }