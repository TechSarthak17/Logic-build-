//Check Leap Year 
package Java.Day1;
import java.util.Scanner;
public class java7 {    
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){

            int a  = sc.nextInt();

            if (a%4==0){
                System.out.println("Its a Leap Year ");
            }else {
                System.out.println("Its not Leap Year");
            }sc.close();
        }else {
            System.out.println("Invalid Input ");
        }
    }
}
