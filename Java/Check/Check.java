//Sum of First Number 

package Java.Check;
import java.util.Scanner;
class Check {
    public static void main (String[]arg){
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter a number");

        if(sc.hasNext()){

            
            int a = sc.nextInt();
            int sum = 0;

            for (int i = 0 ; i<=a ;i++){
                sum = sum+ i ;
            }
            System.out.println("Your Out put is " + sum + "");
        }
        sc.close();
    }
}