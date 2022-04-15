 class Reverse{
     public static void main (String args []){
         int n=45566778;
         System.out.println("orignal number is: "+n);
         int rev=0;
         while(n!=0)
         {
             int rem=n%10;
             rev=rev*10+rem;
             n=n/10;
         }
         System.out.println("reverse number is: "+rev);

     }
    
}
