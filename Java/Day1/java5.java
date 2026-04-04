package Java.Day1;
import java.util.Scanner;


public class java5 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if( a > b && a > c){
                System.out.println("A is largest ");
            }else if (b > a || b > c) {
                System.out.println("B is largest");
            }else {
                System.out.println("C is LArgest ");
            } sc.close();
        } else {
            System.out.println("Invalid dinput");
        }

    }   
}
