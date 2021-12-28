import java.util.Scanner;
public class MainClass
{
public static void main(String[] args)
{
Sysytem.out.println("How many rows you want in this pattern?");
Scanner sc=new Scanner(Sytem.in);
int noOfRows = sc.nextInt();
int value = 1;
system.out.println("Here is your pattern:");
for (inti = 1; i<=noOfRows; i++)
{
for (intj =1; j<=i; j++)
{
System.out.print(value+"\t");
value++;
}
System.out.println();
}
}
}