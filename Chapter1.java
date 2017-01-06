/*
 * Written by Norton Pengra. No Copyright.
 * CS141 @ EDCC
 */
package javaapplication1;

public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PopulationEstimate();
        // polynomialTable(3, 4);
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
    // Assignment 1.5
    public static void weirdProblem() {
        double result = (9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5);
        System.out.println(result);
    }
    
    // Assignment 1.6
    public static void weirdProblem2() {
        int result = 0;
        for (int toAdd=1; toAdd < 10; toAdd++) {
            result += toAdd;
        }
        System.out.println(result);
    }
    
    // Assignment 1.7
    public static void approxPi() {
        double pi = 1;
        double denominatorStart = 3;
        double denominatorMax = 11;
        boolean positive = false;
        for (double denominator = denominatorStart; denominator <= denominatorMax; denominator++) {
            if (positive) {
                pi += (1.0 / denominator);
            } else {
                pi -= (1.0 / denominator);
            }
            positive = !positive;
        }
        pi *= 4;
        // emphasis on "approx"
        System.out.println(pi);
    }
    
    // Assignment 1.8
    public static void CircleAreaAndPerim() {
        double radius = 5.5;
        double perimeter = Math.PI * 2.0 * radius;
        double area = Math.PI * radius * radius;
        System.out.println(perimeter);
        System.out.println(area);
    }
    
    // Assignment 1.9
    public static void RectangleArea() {
        double height = 7.9;
        double width = 4.5;
        double area = height * width;
        double perimeter = height + height + width + width;
        System.out.println(area);
        System.out.println(perimeter);
    }
    
    // Assignment 1.10
    public static void AvgSpeed() {
        double distanceRan = 14.0 * 1.6;
        double mph = distanceRan / (45.5 / 60.0);
        System.out.println(mph);
        
    }
    
    // Assignment 1.11
    public static void PopulationEstimate() {
        int birthsPerSecond = 7;
        int deathsPerSecond = 13;
        int immigrantsPerSecond = 45;
        long currentPopulation = 312032486;
        int yearLength = 365;
        int simulationLengthYears = 5;
        
        long secondsInYear = yearLength * 24 * 60 * 60;
        long futureBirths = (simulationLengthYears * secondsInYear) / birthsPerSecond;
        long futureDeaths = (simulationLengthYears * secondsInYear) / deathsPerSecond;
        long futureImmigrants = (simulationLengthYears * secondsInYear) / immigrantsPerSecond;
        long futurePopulation = currentPopulation + futureBirths + futureImmigrants - futureDeaths;
        System.out.println(futurePopulation);
        
    }
    
    // Assignment 1.12
    public static void AvgSpeed2() {
        double distanceRan = 24;
        double timeRan = 100. + (35. / 60.);
        double kiloPerMile = 1.6;
        
        distanceRan *= kiloPerMile;
        double kmPerMin = distanceRan / timeRan;
        double kmPerHr = kmPerMin / 60.0;
        System.out.println(kmPerHr);
    }
    
    
    
    // Assignment 1.13 w/ helper
    public static void AlgebraInJava() {
        // 3.4x + 50.2y = 44.5
        // 2.1x + .55y = 5.9
        // solve for x and y
        double x, y;
        double[] answer = CramersRule(3.4, 50.2, 44.5, 2.1, .55, 5.9);
        x = answer[0];
        y = answer[1];
        System.out.println(x);
        System.out.println(y);
    }
    
    private static double[] CramersRule(double constA, double constB, double resultE, double constC, double constD, double resultF) {
        // x = ed - bf / ad - bc
        // y = af - ec / ad - bc
        double[] answer = new double[2];
        answer[0] = ((resultE * constD) - (constB * resultF)) / ((constA * constD) - (constB * constC)); // x
        answer[1] = ((constA * resultF) - (resultE * constC)) / ((constA * constD) - (constB * constC)); // y
        return answer;
    }
}
