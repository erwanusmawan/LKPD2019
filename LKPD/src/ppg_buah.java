/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CodeX212
 */
import java.util.Scanner;
public class ppg_buah {
    public static void main(String[] args) {
        // membuat array buah-buahan
        String[] buah = new String[5];
        // membuat scanner
        Scanner scan = new Scanner(System.in);
        // mengisi data ke array
        for( int i = 0; i < buah.length; i++ ){
            System.out.print("Buah ke-" + i + ": ");
            buah[i] = scan.nextLine();
        }
        System.out.println("---------------------------");
        // menampilkan semua isi array
        for( String b : buah ){
            System.out.println(b);
        }
    }   
}
