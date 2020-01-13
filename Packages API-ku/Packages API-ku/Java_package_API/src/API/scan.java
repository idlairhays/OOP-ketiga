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
public class scan {
    public static void main(String [] args){
        
        System.out.println("Scanner");
                
                Scanner input= new Scanner(System.in);
                Long nim;
                String nama,alamat,gender, jurusan;
                int thn;
                
        System.out.print("Masukkan Nama : ");
                nama =input.nextLine();
                
        System.out.print("Masukkan Alamat : ");
                alamat =input.nextLine();
                
        System.out.print("Masukkan Jurusan : ");
                jurusan =input.nextLine();
                
        System.out.print("Masukkan Jenis Kelamin (Perempuan/Laki-Laki : ");
                gender =input.nextLine();
                
        System.out.print("Masukkan NIM : ");
               nim =input.nextLong();
                
        System.out.print("Masukkan Thun Masuk : ");
                thn =input.nextInt();
              
        System.out.println("\nBio data: \n NIM : "+nim+"\nNAMA : "+nama+"\nALAMAT : "+alamat+"\nJURUSAN : "+jurusan+"\nTAHUN AJARAN : "+thn+"\nJENIS KELAMIN : "+gender);
        
    }
}
