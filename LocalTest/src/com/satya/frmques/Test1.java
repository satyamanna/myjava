package com.satya.frmques;

/* it will print 15 1 20 because it will modify the value of same instance of  value class */ 

class Value
{
    public int i = 15;
}
public class Test1
{
    public static void main(String argv[])
    {
        Test1 t = new Test1();
        t.first();
    }
    public void first()
    {
        int i = 5;
        Value v = new Value();
        v.i = 25;
        second(v, i);
        System.out.println(v.i);
    }
    public void second(Value v, int i)
    {
        i = 0;
        v.i = 20;
        Value val = new Value();
        v =  val;
        System.out.println(v.i + " " + i);
    }
}