public class SecMinInArray {
    public static void main (String args[]){
        int temp=0;
        int []arr={2,6,8,9,3,5,7};
        for(int i=0; i<arr.length; i++)
        {
            for( int j=i+1; j< arr.length ; j++){
                if(arr[i] > arr[j] ) 
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
             
        }
        System.out.println("second min in areay is: "+arr[1]);
    }
}
