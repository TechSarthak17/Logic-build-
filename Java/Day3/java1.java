package Java.Day3;
import java.util.Scanner;

class java1 {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number for reverse");

        if (sc.hasNext()){

            

            int a = sc.nextInt();

            int digit;
            int reverse = 0;
            while (a != 0 ){
                digit = a%10;
                //System.out.println(digit);
                a = a/10;
                reverse = reverse *10 +digit;
                
            }System.out.println("Output is "+reverse);
        }
    }
}
