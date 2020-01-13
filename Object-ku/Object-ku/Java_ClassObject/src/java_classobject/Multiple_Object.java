/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_classobject;

/**
 *
 * @author windows
 */
public class Multiple_Object {
  int x = 5;

  public static void main(String[] args) {
    Multiple_Object myObj1 = new Multiple_Object();  // Object 1
    Multiple_Object myObj2 = new Multiple_Object();  // Object 2
    System.out.println(myObj1.x);
    System.out.println(myObj2.x);
  }
}
