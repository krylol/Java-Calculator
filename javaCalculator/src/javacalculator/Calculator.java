/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javacalculator;

/**
 *
 * @author pedri
 */
public class Calculator{
//we create a constructor
    public Calculator(){
  }
  //we define a method to add numbers
  public int add(int a, int b){
    return a + b;
  }
  //we define a method to substract numbers
  public int substract(int a, int b){
    return a -b;
  }
  //we define a method to multiply numbers
  public int multiply(int a, int b){
    return a * b;
  }

  //we define a method to divide numbers
  public int divide(int a, int b){
    return a / b;
  }
  //method to accept int parameters

  public int modulo(int a, int b){
    return a % b;
  }
  //we use this to print the results of using our calculator
  public static void main(String[] args){
    //here we define the object
    Calculator myCalculator = new Calculator();
    //and here we use that defined object to print results on our console
    System.out.println(myCalculator.add(5,7));
    int substract = myCalculator.substract(45,11);
    System.out.println(substract);
    System.out.println(myCalculator.multiply(292,110));
    int divide = myCalculator.divide(99,2);
    System.out.println(divide);
    int modulo = myCalculator.modulo(78,5);
    System.out.println(modulo);


  }



}
