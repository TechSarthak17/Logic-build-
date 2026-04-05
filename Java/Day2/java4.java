// Extracting Digits from a Number
package Java.Day2;
import java.util.Scanner;

public class java4 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
            int a =  sc.nextInt();

            while( a != 0 ){
                int digit;
                digit = a%10 ;
                System.out.println(digit);
                a = a/10;
            }sc.close();
        }else {
            System.out.println("Invalid input");
        }
    }
}