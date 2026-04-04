package Java.Day2;
import java.util.Scanner;

public class java3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
            int a = sc.nextInt();
            int fact = 1;

            for (int i=1 ; i<=a ; i++){
                fact = fact * i;

            }System.out.println(fact);
            sc.close();
        }else{
            System.out.println("Invalid Input");
        }
    }
}
