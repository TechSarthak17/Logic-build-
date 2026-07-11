//Number is + 0r - 

package Java.Day1;
import java.util.Scanner;

public class java4 {

    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number ");
        if (sc.hasNextInt()){
            
            int a = sc.nextInt();

            if ( a > 0){
                System.out.println("It a +"); 
            }else {
                System.out.println("its a -");
            }
        }else{
            System.out.println("Invalllid Okay ");
        }sc.close();
    } 
}