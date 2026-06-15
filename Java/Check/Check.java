package Java.Check;

import java.util.Scanner;

class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNext()){

            int a = sc.nextInt();
            int digit ;

            while (a != 0) {
                digit = a %10;
                System.out.println(digit);
                a = a/10;
            }
        }
    }
}