package Java.Check;
import java.util.Scanner;

class check {

    public static void main (String[]arg){

        Scanner sc = new Scanner(System.in);

        if(sc.hasNext()){

            int a = sc.nextInt();

            for(int i=0 ;i<=5 ;i++ ){

                System.out.println(i);

            }

        }else {
            System.out.println("Invalid input");
        }sc.close();
    
    }

}
