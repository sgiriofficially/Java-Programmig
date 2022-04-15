 class swap2No {
     public static void main (String args[]){
         int a=20;
         System.out.println("before swap a:"+a);
         int b=30;
         System.out.println("before swap b:"+b);
         int t=a;
         {
             a=b;
             b=t;
         }
         System.out.println("after swap a:"+a);
         System.out.println("after swap b:"+b);
     }
    
}
