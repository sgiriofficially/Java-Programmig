import java.util.*;
public class ArrayInput {
    public static void main(String args []){
        Scanner sc=new Scanner(System.in);
        System.out.println("give array size:");
        int size=sc.nextInt();
        int arr []=new int[size];
        System.out.println("enter array element:");
        for(int i=0; i<size; i++){
             arr [i]=sc.nextInt();
        }
        
        System.out.println("array is: ");
        
        for(int i=0; i<=size; i++){
            System.out.print(arr[i]);
        }
    

    }
    
}
