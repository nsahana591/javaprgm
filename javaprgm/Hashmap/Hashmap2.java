import java.util.*;
public class Hashmap2{
    public static void main(String args[]){
        HashMap <Integer,String> hm =new HashMap <Integer,String>();
        hm.put(100,"Ravi");
        hm.put(101,"Raju");
        hm.put(102,"Ranu");
        hm.put(103,"Ramu");
        System.out.println("initial list of elements:" +hm);
        for(Map.Entry m : hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:" );
        hm.replace(102,"Ragu");
        for(Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replace(103,"manu","Rani");
        for(Map.Entry m : hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
        System.out.println("Updated list of elements:");
        hm.replaceAll((k,v)->"Robbo");
        for(Map.Entry m:hm.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }

    }
}