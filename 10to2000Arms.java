class Arms{
    public static void main(String args[]){
        int n=10;
        int total=0;
        int temp=n;
        for(int i=n; i<=100; i++)
        {
                while(i!=0){
                    int rem=i%10;
                    total=total+rem*rem;
                    i=i/10;
                }
                if(temp==total){
                System.out.println(total);
                }
        }
    }
}