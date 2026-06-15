package Java.Day3;

import java.util.Scanner;

class java4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = a;
        int digit = 0;
        int reverse = 0;
        while (a != 0 ) {
            digit = a%10;
            a = a/10;

        reverse = reverse *10 +digit;
        
            
        }System.out.println(reverse);

        if (b == reverse ){
            System.out.println("It is Palindrome");
        }else {
            System.out.println("This is not palindrome");
        }
    }    
}
