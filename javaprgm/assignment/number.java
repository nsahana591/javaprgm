import java.util.*;
class number
{
    public static void main(String[] args)
    {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numb:");
        int n=sc.nextInt();
        System.out.println("even numbers are:"+n);
        for(int i=0;i<=n;i=i+2)
        {
            
                System.out.println(i+"");
            
        }
      
    }
}