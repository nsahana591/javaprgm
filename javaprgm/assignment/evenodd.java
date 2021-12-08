import java.util.Scanner;
public class evenodd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a numb:");
        int num=sc.nextInt();
        String evenodd=(num%2==0)?"even":"odd";
        System.out.println(num+"is"+evenodd);
    }
}