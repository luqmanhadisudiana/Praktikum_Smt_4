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
public class Song {
   private String title, artist;
   private int duration;
   public Song () { } ;
   public Song  (String a) { 
        title = a;
        System.out.println("Masukan Jumlah Lagu : ");
        Scanner scan = new Scanner(System.in);
    }
   public Song (String a, String b, int c) { //constructor ketiga
        title = a;
        artist = b;
        duration = c;
   }
   public String setTitle (String a) {
        return a;
   }
   public String setArtist (String b) {
       return b;
   }
    public int setDuration (int c) {
       return c;
   }
     public String getTitle () {
        return title;
   }
   public String getArtist () {
        return artist;
   } 

    public int getDuration () {
        return duration;
   } 
   public void Play (int c) {
       if (c > 2) {
           System.out.println("Short");
       }
        if (c <= 4) {

           System.out.println("Intermadate");
       }
       if (c > 4) {

           System.out.println("long");
       }
   }
}
