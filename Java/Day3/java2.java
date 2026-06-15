//Count Digits Program
package Java.Day3;

import java.util.Scanner;

class java2 {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        int Count = 0;
        while (a !=0) {
            
            a=a/10;
            Count = Count+1;
        }System.out.println("your output is "+Count);
        sc.close();
    }
}
