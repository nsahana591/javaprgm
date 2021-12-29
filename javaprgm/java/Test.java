class Test{
    public static void main(String[] args){
        String ename1=new String ("Rahul");
        String ename2=new String ("Rahul");
        System.out.println(ename1 == ename2);//false
 System.out.println(ename1.equals(ename2));//true
    }
}