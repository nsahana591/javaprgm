
   
import java.util.Scanner;
class Div
{
    public static void main(String[] args)
    {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.println("enter any num");
        n=s.nextInt();
        if(n%7==0)
        {
            System.out.println(n+ "is div by7");
            }
            else
            {
                System.out.println(n+"is not div by 7");
            }        
    }
}