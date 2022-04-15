 class prime {
    public static void main(String args[]){
        int num=243;
        int temp=0;
         for (int i=2; i<=num-1; i++)
         if(num%2==0)
         {
             temp=temp+1;
         }
         if(temp==0)
         {
             System.out.println("number is prime:"+num);
 
         }else
         {
             System.out.println("number is not prime:"+num);
         }
    }
}
