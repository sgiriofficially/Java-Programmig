 class dupliArray {
    public static void main(String args[]){
     int []arr={1,4,4,5,6,7,8,6,7,2};
     for(int i=0; i<arr.length; i++){
     
         for(int j=i+1; j<arr.length; j++){
         
            if(arr[i]==arr[j])
            System.out.print(arr[j]);
         }
       }
     }
    
}
