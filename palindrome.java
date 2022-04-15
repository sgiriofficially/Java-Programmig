class palindrome {
    public static void main (String args[]){
       int n=787;
       int sum=0;
       int temp=n;
       while(n!=0)
       {
           int rem=n%10;
           sum=sum*10+rem;
           n=n/10;
       } 
       if (temp==sum)
       {
        System.out.println("this is palindrome no: "+temp);
       }else
       {
           System.out.println("this is not palindrome no:"+temp);
       }
    }
    
}
