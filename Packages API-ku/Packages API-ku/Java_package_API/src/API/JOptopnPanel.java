/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;
import javax.swing.JOptionPane;
/**
 *
 * @author windows
 */
public class JOptopnPanel {
    public static void main(String[]args){
        long nim;
                String nama,alamat,gender, jurusan;
                int thn;
               String NIM=JOptionPane.showInputDialog("Masukkan NIM");
                nim= Long.parseLong(NIM);
                nama=JOptionPane.showInputDialog("Masukkan NAMA");
                jurusan=JOptionPane.showInputDialog("Masukkan JURUSAN");
                gender=JOptionPane.showInputDialog("Masukkan JENIS KELAMIN");
                alamat=JOptionPane.showInputDialog("Masukkan ALAMAT");
                String Tahun=JOptionPane.showInputDialog("Masukkan TAHUN MASUK");
                thn= Integer.parseInt(Tahun);
                System.out.println("\nBio data saya: \n NIM : "+nim+"\nNAMA : "+nama+"\nALAMAT : "+alamat+"\nJURUSAN : "+jurusan+"\nTAHUN AJARAN : "+thn+"\nJENIS KELAMIN : "+gender);
    }
    
}
