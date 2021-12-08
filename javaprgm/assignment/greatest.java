import java.util.Scanner;
public class greatest
{
    public static void main(String[] args)
    {
        int a,b,big;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two nmbers");
        a=sc.nextInt();
        b=sc.nextInt();
        big=(a>b)?a:b;
        System.out.println("\n largest="+big);
    }
}