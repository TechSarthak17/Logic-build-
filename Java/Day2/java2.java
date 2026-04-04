package Java.Day2;
import java.util.Scanner;

import javax.annotation.processing.SupportedOptions;

public class java2 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number ");
        if(sc.hasNextInt()){
            int a = sc.nextInt();
            int sum = 0;
            for(int i=1 ; i<=a ; i++){
                
                sum = sum + i;

            }
            System.out.print("Your output is :- "); 
            System.out.println(sum);
            sc.close();
        }else {
            System.out.println("Invalid Input");
        }
    }    
}
