
package executionsteps;
import java.util .Scanner;
public class UserInput {
    public static void main(String[]args){
        int a;
        int b;
        int c;
        System.out.println("Enter a Number:");
    Scanner input = new Scanner(System.in);
    a = input.nextInt();
    b = input.nextInt();
    c = a+b;
        System.out.println("The sum of two number is="+c);
    }
   
}
