interface demo
{
    int a=25;
    public void fun1();
    public void fun2();
    public static void fun3(){
        System.out.println("I am fun3");
    }
}
class interfacedemo{
    public static void main(String args[]){
        System.out.println("A:"+demo.a);
        demo.fun3();
    }
}