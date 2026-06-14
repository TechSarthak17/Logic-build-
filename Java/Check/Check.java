package Java.Check;
import java.util.Scanner;

class Check {
    public static void main (String[]arg){
        Scanner sc = new Scanner(System.in);

        

       if (sc.hasNext()){
        int a = sc.nextInt();

        if ( a%2 == 0 ){
            System.out.println("This is even number");
        }if (a%2 != 0 ){
            System.out.println("This is odd numbber");
        }
       }else {
        System.out.println("Invalid input");
       }

       sc.close();
    }
}