/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_user_input;

/**
 *
 * @author windows
 */
 import java.util.Scanner;
public class Input_Type {

  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter NAMA, UMUR, NIM:");

    // String input
    String name = myObj.nextLine();

    // Numerical input
    int umur = myObj.nextInt();
    long nim = myObj.nextLong();

    // Output input by user
    System.out.println("NAMA: " + name);
    System.out.println("UMUR: " + umur);
    System.out.println("NIM: " + nim);
  }
}
   

