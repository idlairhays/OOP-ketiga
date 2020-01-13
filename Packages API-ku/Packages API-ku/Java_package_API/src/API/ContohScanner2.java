/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import java.util.Scanner;

/**
 *
 * @author windows
 */
public class ContohScanner2 {
     public static void main(String [] args){
        
        System.out.println("Scanner");
            Scanner input= new Scanner(System.in);
                int satu,duwa,hasil;
                 System.out.print("Masukkan Angka ke-1 : ");
                satu =input.nextInt();
                 System.out.print("Masukkan Angka ke-2 : ");
                duwa =input.nextInt();
                hasil=satu+duwa;
                 System.out.println("hasil "+satu+" ditambah "+duwa+" adalah : "+hasil);
     }
                
}
