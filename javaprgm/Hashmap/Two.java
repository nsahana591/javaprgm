import java.util.*;
public class Two{
    public static void main(String args[]){
        HashMap<Integer,String> gmt = new HashMap<Integer,String>();
        System.out.println("initial list of elements: "+gmt);
        gmt.put(1,"Ravi");
        gmt.put(2,"Vinay");
        gmt.put(3,"Kiran");
        gmt.put(4,"Ramu");
        System.out.println("After invoking put() method");
        for(Map.Entry m : gmt.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
        }
        gmt.putIfAbsent(5,"Rahul");
        System.out.println("After invoking putifabsent() method");
        for(Map.Entry m : gmt.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
            }
        HashMap <Integer,String> dum = new HashMap <Integer,String>();
        dum.put(6,"balu");
        dum.putAll(gmt);
        System.out.println("After invoking putall() method");
        for(Map.Entry m : dum.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }    
    }
}