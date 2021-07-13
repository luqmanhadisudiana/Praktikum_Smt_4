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
public class DriverAlbum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("LUQMAN HADI SUDIANA");
        System.out.println("1302190016");
        System.out.println("SE4301");
        System.out.println();
        System.out.println("=====================");
        System.out.println();
        Song arrsong[] = new Song[2];    
        Song song1 = new Song("Melukis Senja", "Budi Doremi", 240);      
        Song song2 = new Song("Photograph", "Ed Sheeran", 274);           
        arrsong[0] = song1;
        arrsong[1] = song2;
        
        for(int j = 0; j<2; j++) {
        System.out.println(""+arrsong[j].getTitle()+" ("+arrsong[j].getArtist()+") ("+arrsong[j].getDuration()+")");        //mencetak hasil constructor pada prodi
        }
    }
    
}
