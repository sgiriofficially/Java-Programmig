 class StringReverse {
     public static void main(String args[]){
         String name="sunny";
         System.out.println("Original String : "+name);
         int leng=name.length();
         String rev="";
         for( int i=leng-1; i>=0; i--)
         {
             rev=rev+name.charAt(i);
         }
         System.out.println("Reverse String is: "+rev);

     }
    
}
