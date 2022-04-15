public class ArraySearch {
    public static void main (String args[]){
        int arr[]={1,6,7,5,9,3,4};
        int x=3;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==x){
            System.out.print("x found at index:"+i);
            } 
        }
    }
}
