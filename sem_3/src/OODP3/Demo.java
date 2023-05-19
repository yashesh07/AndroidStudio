package OODP3;

class Demo
{
    public int myMethod(int num1, int num2)
    {
        System.out.println("First myMethod of class Demo");
        return num1+num2;
    }
    public float myMethod(float var1, float var2)
    {
        System.out.println("Second myMethod of class Demo");
        return var1-var2;
    }
}
class Test
{
    public static void main(String args[])
    {
        Demo obj= new Demo();

        obj.myMethod(10,10);
        obj.myMethod(20f,12f);
    }
}
