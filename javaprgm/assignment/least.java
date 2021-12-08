import java.util.*;
class Smaller
{
    public static void main(String[] args)
    {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers");
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1<n2)
        {
            System.out.println(n1);
        }
        else if(n2<n1)
        {
            System.out.println(n2);
        }
    }
}