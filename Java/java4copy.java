package Java;
import java.util.Scanner;
public class java4copy {
    public static void main (String[]arg){
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()){
            int a = sc.nextInt();

            if ( a > 0 ){
                System.out.println("+");

            }else {
                System.out.println("-");
            }
        }else {
            System.out.println("Invalid ");
        }
        sc.close();
    }
}
