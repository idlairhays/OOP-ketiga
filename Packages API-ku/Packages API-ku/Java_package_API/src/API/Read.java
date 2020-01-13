/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author windows
 */
public class Read {
    public static void main(String []args){
        //BufferedReader tidak bisa menggunakan type data selain String
        BufferedReader input1= new BufferedReader(new InputStreamReader(System.in));
        long NIM;
               int THN;
        String nim, nama, alamat, gender, jurusan, thn;
                try{
                       
        System.out.print("Masukkan NIM : ");
               nim =input1.readLine();
                
        System.out.print("Masukkan Nama : ");
                nama =input1.readLine();
                
        System.out.print("Masukkan Alamat : ");
                alamat =input1.readLine();
                
        System.out.print("Masukkan Jurusan : ");
                jurusan =input1.readLine();
                
        System.out.print("Masukkan Jenis Kelamin (Perempuan/Laki-Laki : ");
                gender =input1.readLine();
                
        System.out.print("Masukkan Thun Masuk : ");
                thn =input1.readLine();
              
        System.out.println("\nBio data: \n NIM : "+nim+"\nNAMA : "+nama+"\nALAMAT : "+alamat+"\nJURUSAN : "+jurusan+"TAHUN AJARAN : "+thn+"\nJENIS KELAMIN : "+gender);
        
                }catch(IOException ex){
                    
        System.out.println("Terjadi kesalahan");
                }
    }
}
