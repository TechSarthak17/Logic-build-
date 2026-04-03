package Java;
import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class java3 {
    public static void main (String[]args){
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter Number ");
        int a = Sc.nextInt();

        if (a%2 == 0 ){
            System.out.println("Its a even Number");
        }else {
            System.out.println("Its not Even Number ");
        }
    }   
}
