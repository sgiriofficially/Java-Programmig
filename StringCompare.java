public class StringCompare {
    public static void main(String args[]){
        String name1="sunny";
        String name2="bunny";
        //CompareTo comand value:
        // s1>s2:+ve
        // s1<s2:-ve
        // s1==s2:0
        if(name1.compareTo(name2)==0){
            System.out.println("String is Equal:");
        }else
        {
            System.out.println("String is not Equal:");
        }

    }
    
}
