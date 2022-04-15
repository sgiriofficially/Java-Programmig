public class MinInArray {
    public static void main(String args[]){
        int []arr={3,6,8,1,5,9,5};
        int min=arr[0];
        for( int i=arr.length-1; i>=0; i--)
        if(arr[i]<min)
        {
            min=arr[i];
        }
        System.out.println("max element in array is:"+min);
    }
    
}
