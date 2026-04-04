package Java.Day2;
import java.util.Scanner;

public class java1 {
       public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your starting Number");

        if(sc.hasNextInt()){
            
            int a = sc.nextInt();
            System.out.println("Your Output is");
            for (int i=0 ; i<=a ;i++){
                
                System.out.println(i);
            }sc.close();

        }else {
            System.out.println("Invalid Input");
        }
    }
}
