import java.util.*;
public class CalculateMult {
public static int calculateMult ( int a,int b){
return a*b;
}
public static void main(String args[]){
    System.out.println("Enter two num:");
    try (Scanner obj = new Scanner(System.in)) {
        int a=obj.nextInt();
        int b=obj.nextInt();
        int Mult=calculateMult (a,b);
        System.out.println("sum of 2 num:"+Mult);
    }
}
}