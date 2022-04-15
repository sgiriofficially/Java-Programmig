 class Armstrong {
     public static void main(String args[]){
         int n=370;
         int total=0;
         int temp=n;
         while(n!=0)
         {
             int rem= n%10;
             total=total+rem*rem*rem;
             n=n/10;
         }
         if(temp==total)
         {
             System.out.println("this is Artmstrong no: "+temp);
         }else
         {
            System.out.println("this is not Artmstrong no: "+temp);
         }

     }
    
}
