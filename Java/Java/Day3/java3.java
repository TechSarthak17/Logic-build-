

package Java.Day3;

import java.util.Scanner;

class java3 {
    public static void main (String[]arg){
        System.out.println("Enter  a number");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int digit = 0;
        int sum = 0;
        while ( a != 0) {
            digit = a%10;
            a = a/10;
            sum = digit + sum;
        }System.out.println("Your output is this  "+ sum);
    }    
}
