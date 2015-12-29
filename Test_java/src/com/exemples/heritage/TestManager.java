package com.exemples.heritage;

public class TestManager {

	public static void main (String[] args)
    {
        Computer pc = new SuperComputer();
        int sum = SuperComputer.add (9, 5);
        System.out.println (sum);
    }
}

 class Computer
{
    public static int add (int a, int b)
    {
        return a + b;
    }
}
 class SuperComputer extends Computer
{
    public static int add (int a, int b)
    {
        return 0;
    }
}
