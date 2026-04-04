package Java.Day2;
import java.util.Scanner;

public class java2copy {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
            int a = sc.nextInt();
            int sum = 0;

            for (int i=0 ; i<=a ; i++){
                sum = sum + i ;
                
            }System.out.println(sum);
            sc.close();
        }else {
            System.out.println("Invalid Inout");
        }
    }
}