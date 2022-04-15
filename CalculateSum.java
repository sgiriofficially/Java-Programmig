import java.util.*;
public class CalculateSum {
public static int calculateSum ( int a,int b){
int sum=a+b;
return sum;
}
public static void main(String args[]){
    System.out.println("Enter two num:");
    try (Scanner obj = new Scanner(System.in)) {
        int a=obj.nextInt();
        int b=obj.nextInt();
        int sum=calculateSum (a,b);
        System.out.println("sum of 2 num:"+sum);
    }
}
}
