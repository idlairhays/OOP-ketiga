/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;
import java.io.Console;
/**
 *
 * @author windows
 */
public class ContohConsole {
    public static void main(String[]args){
         String nama;
                 int usia;
        Console con = System.console();
         System.out.print("Masukkan Nama : ");
                nama =con.readLine();
                System.out.print("Masukkan Umur : ");
                usia =Integer.parseInt(con.readLine());
               System.out.print("Nama saya adalah : "+nama);
                          System.out.print("Umur saya adalah : "+usia);
     
     
    }
}
