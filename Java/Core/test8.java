package Java.Core;

public class test8 {
    String name;
    String address;
    int age;
    float weight;
    float Hight;
    int moblie;
    String HarirColour;
    String Gender;

    int eye;
    int ear;
    int ok;

    public void eat() {

    }

    public void sleep() {

    }

    public void run() {

    }

    public void hear() {

    }

    public void see() {

        if (this.eye == 2) {
            System.out.println("I can see clearly");
        }

        if (this.eye == 1) {
            System.out.println("See thoda thoda");
        }
        //hoga bhai likh kuch bhi jo likhwa rahe hai tujhe bas likhne mein focus karna hai okay 
        //dhuan rakh dono baato ka sir bhi aarahe hai or me bhi aaraha hu 
        //bhai dekh mujhhhe pura bharosa hai ki nhi hoga ese nhi hota hai but sir keh rahe hote hai to
        //hota he hoga na sir galat thodi na bolenge hena sarthak bhai 
        if (this.eye == 0) {
            System.out.println("Can't see anything");
        }
    }

    public static void main(String[] args) {

        // Creating object
        test8 person1 = new test8();

        // Assigning values
        person1.name = "Sarthak";
        person1.age = 19;
        person1.weight = 64.5f;
        person1.eye = 2;

        // Calling method
        person1.see();

        // Printing data
        System.out.println("Name: " + person1.name);
        System.out.println("Age: " + person1.age);
        System.out.println("Weight: " + person1.weight);
    }
}