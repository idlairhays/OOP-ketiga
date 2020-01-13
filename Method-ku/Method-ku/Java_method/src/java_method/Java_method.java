/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_method;

/**
 *
 * @author windows
 */
public class Java_method {

    
  // Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method

    Java_method myObj = new Java_method(); // Create an object of MyClass
    myObj.myPublicMethod(); // Call the public method
  }
}
    
