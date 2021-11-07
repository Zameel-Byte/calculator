import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("which operation should be performed :");
        char c = sc.next().charAt(0);
        System.out.println("enter a first number :");
        int i1 = sc.nextInt();
        System.out.println("enter a second number :");
        int i2 = sc.nextInt();
        switch(c){
            case '+' : System.out.println("addition is :" );
            int a = i1+i2;
            System.out.println(a);
            break;
            case '-' : System.out.println("substraction is :" );
            int b = i1-i2;
            System.out.println(b);
            break;
            case '*' : System.out.println("multiplication is :" );
            int d = i1*i2;
            System.out.println(d);
            break;
            case '/' : System.out.println("division is :" );
            double f= i1/i2;
            System.out.println(f);
            break;
            default : System.out.println("enter a valid expression");
            
            

        }

    }
}