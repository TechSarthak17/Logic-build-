package Java;
import java.util.Scanner;

import javax.xml.transform.Source;
public class java6 {
    public static void main (String[]args){

        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){

            int a = sc.nextInt();

            if(a%5==0 && a%11==0 ){
                System.out.println("this is divide by 55");
            }else {
                System.out.println("No its not");
            } sc.close();
        }else {
            System.out.println("Invalid Input");
        }

    }

}
