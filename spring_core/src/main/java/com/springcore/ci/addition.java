package com.springcore.ci;

public class addition {
	
	private int a;
	private int b;
	
	
	public addition(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("int int");
	}
	
	public addition(double a,double b)
	{
		this.a=(int)a;
		this.b=(int)b;
		System.out.println("double double");
	}
	
	public addition(String a,String b)
	{
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("String String");
	}

	public void sum()
	{
		System.out.println("a value is:"+this.a+"\n"+"b value is:"+this.b);
		System.out.println("Sum is "+(this.a+this.b));
	}
}
