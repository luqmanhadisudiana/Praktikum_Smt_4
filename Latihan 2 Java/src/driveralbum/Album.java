/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driveralbum;
import java.util.Scanner;

/**
 *
 * @author Hadi
 */
public class Album {
    private String title;
    private int year, track;
    private Song songs;
    Scanner scan = new Scanner(System.in);

    public Album () {}
    public Album (String a) {
        title = a;
    }
    public Album (String a, int b) {
        title = a;
        year = b;
    }
    public Album (String a, int b, int c) {
        title = a;
        year = b;
        track = c;
    }
    public Album (String a, int b, int c, Song d) {
        title = a;
        year = b;
        track = c;
        songs = d;

    }
    public String setTitle (String a) {
        return a;
    }
    public int setYear (int a) {
        return a;
    }
    public int setTotalSongs (int a) {
        return a;
    }

    public String getTitle () {
        return title;
    }
    public int getYear () {
        return year;
    }
    public Song addSong () {
        return songs;
    }
}
