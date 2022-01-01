import java.util.*;
public class Hashmap{
    public static void main(String args[]){
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(101,"sanju");
        map.put(102,"baby");
        map.put(103,"doll");
        map.put(104,"ganga");
        System.out.println("initial list of elements:" +map);
        map.remove(101);
        System.out.println("Updated list of elements:" +map);
        map.remove(102);
        System.out.println("Updated list of elements:" +map);
        map.remove(103,"doll");
        System.out.println("Updated list of elements:" +map);
    }
}