import java.util.*;
public class FactorialNum {
    public static void Factorial (int n){
    if(n<0)
    {
        System.out.println("Invailid Number:");
        return;
    }
    int fact=1;
    for(int i=n; i>=1; i--)
    {
        fact=fact*i;
    }
    System.out.println(fact);
    }
    public static void main(String args []){
    System.out.println("Enter num:");
    try (Scanner obj = new Scanner(System.in)) {
        {
            int n=obj.nextInt();
           Factorial(n);
        }
    }
    }
}
