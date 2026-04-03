package Java;
import java.util.Scanner;
public class java4 {
    public static void main (String[]arg){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a >=0 ){
            System.out.println("Number is positive ");
        }else if (a <=0 ){
            System.out.println("Number is Negative");
        }else{
            System.out.println("Invaid Output");

        }

    catch (Exception e){
        System.out.println("Bha Try karte raho ");
    }

        sc.close();
    }
}
