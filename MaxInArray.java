 class MaxInArray {
     public static void main(String args[]){
         int []arr={3,6,8,5,9,5};
         int max=arr[0];
         for( int i=0; i<=arr.length-1; i++)
         if(arr[i]>max)
         {
             max=arr[i];
         }
         System.out.println("max element in array is:"+max);
         
     }
    
}
