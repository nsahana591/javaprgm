imprt java.util.scanner;
class year
{
public static void main(string[] args){
int y;
system.out.print("enter any year");
scanner r=new scanner(system.in);
y=r.nextint();
if(y%100==0 && y%100==0 || y%100!=0 && y%4==0)
{
system.out.print("leap year");
}
else
{
system.out.print("not leap year");
}
}