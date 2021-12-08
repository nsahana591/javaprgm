import java.util.*;
class Three
{
    public static void main(String[] args)
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numb");
        num=sc.nextInt();
        if(num>99&&num<1000)
        {
            System.out.println("three dig numb");
        }
        else
        {
            System.out.println("not a three digit numb");
        }
    }
}