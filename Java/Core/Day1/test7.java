package Java.Core.Day1;

public class test7 {

    
    public static int multiply(int a, int b) {
        return a * b;
    }

    
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

   
    public static int subtract(int a, int b) {
        return a - b;
    }

    
    public static int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public static void main(String[] args) {

        //Discrbe bla bla bla

        System.out.println("Multiply two numbers: " + multiply(5, 4));
        System.out.println("Multiply three numbers: " + multiply(5, 4, 2));

        System.out.println("Subtract two numbers: " + subtract(10, 3));
        System.out.println("Subtract three numbers: " + subtract(20, 5, 3));
    }
}