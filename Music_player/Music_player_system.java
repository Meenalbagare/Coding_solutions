import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        String artist = sc.nextLine();     
        int duration = sc.nextInt();
        Media userSong = new Media(title, artist, duration);
        Player musicplayer = new Player(new Media[]{userSong});

        musicplayer.play();
    }

    public static class Media {
        private String title;
        private String artist;
        private int duration;

        public Media(String title, String artist, int duration) {
            this.title = title;
            this.artist = artist;
            this.duration = duration;
        }

        public String getTitle() {
            return title;
        }

        public String getArtist() {
            return artist;
        }

        public int getDuration() {
            return duration;
        }
    }

    public static class Player {
        private Media[] playlist;
        private int currentSongIndex;

        public Player(Media[] playlist) {
            this.playlist = playlist;
            this.currentSongIndex = 0;
        }

        public void play() {
            Media currentSong = playlist[currentSongIndex];
            System.out.println("Now playing: " + currentSong.getTitle() + " by " + currentSong.getArtist());
            System.out.println("Duration: " + currentSong.getDuration() + " seconds");
        }
    }
}