import java.util.Scanner;
import java.util.Arrays;
class demo{
    public static void main(String[] args)
    {
        int[] arr=new int[3];
        System.out.println("ent 3 num: ");
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<3; i++)
        arr[i]=sc.nextInt();
        Arrays.sort(arr);
        System.out.println("asce order: ");
        for(int i=0; i<3; i++)
        System.out.println(arr[i]+ "");
    }
}