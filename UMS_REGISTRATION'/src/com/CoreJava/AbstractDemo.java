package com.CoreJava;

public class AbstractDemo extends absDemo {

	
	@Override
	public void m() {
		System.out.println("m method");
	}

	@Override
	public void k() {
		System.out.println("k method");
	}

	@Override
	public void mi() {
		System.out.println("mi method");
	}
	
	public static void main(String... args)
	{
		AbstractDemo abd=new AbstractDemo();
		abd.m();
		abd.mi();
		abd.k();
		abd.mii();
	}
}

interface A
{
	public void m();
	public void k();
}

abstract class absDemo implements A
{
	public abstract void mi();
	public void mii()
	{
		System.out.println("Hello");
	}
}