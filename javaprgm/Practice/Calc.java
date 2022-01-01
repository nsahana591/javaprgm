class Calc{
    int a = 100;
    int b = 200;
    static int c = 10;
    public static void main(String[] args){
Calc c1 = new Calc();
Calc c2 = new Calc();
c1.c = 200;
c1.b = 300;
System.out.println(c1.a + c1.b+c1.c);
System.out.println(c2.a + c2.b+c2.c);
    }
}