public class StringBulider {
    public static void main(String args[]){
        StringBuilder sb =new StringBuilder("Tonny");
        System.out.println(sb);
        System.out.println(sb.charAt(0));
        //Set exchange p:
        sb.setCharAt(0,'p');
        System.out.println(sb);
        //Insert function:
        sb.insert(0,"d");
        System.out.println(sb);
       // Delete extra d:
       sb.delete(0,1);
       System.out.println(sb);
       
        
        
        
    }
    
}
