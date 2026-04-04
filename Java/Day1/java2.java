package Java.Day1;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class java2 {

    public static void main (String[]arg){
        Scanner Ok = new Scanner(System.in);
        System.out.print("Enter Your First Number ");
        int a = Ok.nextInt();
        System.out.print("Enter Your 2nd Number ");
        int b = Ok.nextInt();

        int sum = a + b ;
        System.out.print("Your sum is there ");
        System.out.println(sum);
    
    }
}