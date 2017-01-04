/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author norton
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        polynomialTable(3, 4);
    }
    
    // Assignment 1.1
    public static void helloWorld() {
        System.out.println("Welcome to Java");
        System.out.println("Welcome to Computer Science");
        System.out.println("Programming is fun");
    }
    
    // Assignment 1.2
    public static void forLoop() {
        for (int i=0; i < 5; i++) {
            System.out.println("Welcome to Java");
        }
    }
    
    // Assignment 1.3
    public static void prettyJavaAsciiArt() {
        System.out.println("    J     A     V     V     A");
        System.out.println("    J    A A     V   V     A A");
        System.out.println("J   J   AAAAA     V V     AAAAA");
        System.out.println(" J J   A     A     V     A     A");
    }
    
    // Assignment 1.4 w/ helper
    // public static void polynomialTable() { polynomialTable(3, 4); }
    private static void polynomialTable(int powerMax, int tableSize) {
        // Present Header
        if (powerMax > 0 && tableSize > 0) {
            System.out.print("a\t");
            for (int headerPower=2; headerPower <= powerMax; headerPower++) {
                System.out.format("a^%d\t", headerPower);
            }
            System.out.print("\n");
            // Present Table
            for (int currentTableNumber=1; currentTableNumber <= tableSize; currentTableNumber++) {
                for (int power=1; power <= powerMax; power++) {
                    double powerResult = Math.pow(currentTableNumber, power);
                    System.out.format("%.0f\t", powerResult);
                }
                System.out.print("\n");
            }
    
        }
    }
}
