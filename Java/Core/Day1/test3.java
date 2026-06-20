package Java.Core.Day1;

public class test3 {

    // Instance Variables (Non-Static)
    int rollNumber;
    String name;

    // Static Variable (Class Variable)
    static int totalStudents = 0;

    // Constructor
    public test3() {
        totalStudents++;
    }

    // Method demonstrating Local Variables
    public void example() {
        int age = 25;          // Local variable
        String studentName = "John";  // Local variable
        System.out.println("Age: " + age);
        System.out.println("Name: " + studentName);
    }

    // Method to display instance variables
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        test3 student1 = new test3();

        student1.rollNumber = 101;
        student1.name = "Sarthak";

        student1.example();
        student1.display();
        //According to me esa nhi hona chahaiye tha me yaha aagya acha hai ab ache se sikh ke jaunga 
        //sikh toh sakta hu me kyuki abhi toh thoda bahut toh aata hai lekin aage or ache se dyan dena 
        //padega varna phir baad ka sab mere dimmag se upper jayega 
        System.out.println("Total Students: " + totalStudents);
    }
}