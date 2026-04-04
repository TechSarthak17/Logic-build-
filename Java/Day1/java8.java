package Java.Day1;
import java.util.Scanner;

public class java8 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Envet Your lettar");
        char b = sc.next().charAt(0);

        if (b == 'a' || b == 'e'||b == 'i' || b == 'o' || b == 'u'||b == 'A' || b == 'E'||b == 'I' || b == 'O' || b == 'U'){
            System.out.println("Its a Vovel");
        }else {
            System.out.println("Its not Vowel");
        }sc.close();

        
    }
}
