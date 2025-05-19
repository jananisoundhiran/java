class A
{
	public static void main(String[]args)
	{
		//Arithmetic Operator//
		int a = 5;
	    int b = 15;
	System.out.println(a+b);//20
	System.out.println(a-b);//-10
	System.out.println(a*b);//75
	System.out.println(a/b);//0
	System.out.println(a%b);//5
	}
}
class B
{
	public static void main(String[]args)
	{
		// Unary Operator //
		int a = 15;
		System.out.println(++a);//16
		System.out.println(a++);//16
		int b = 10;
		System.out.println(++b);//11
		System.out.println(a--);//7
	}
}
class C
{
	public static void main(String[]args)
	{
		//Relational Operator//
		int a = 20;
		int b = 10;
		System.out.println(a==b); //a->20 = b->10 ->False
		System.out.println(a!=b); //a->20!= b->10 ->True
	}
}
class D 
{
	public static void main(String[]args)
	{
		int a = 20;
		int b = 10;
		int c = 5;
		System.out.println((a==b)&&(++b>c));//False
		System.out.println((a==b)||(++b>c));//True
	}
}
class E
{
	public static void main(String[]args)
	{
		int a = 20;
		int b = 10;
		int c = 5;
		System.out.println((a==b)&(++b>c));//False
		System.out.println(b);//11
		System.out.println((a!=b)&(++b>c));//True
	    System.out.println((a==b)^(b>c));//True
		System.out.println(20&11);//0
		
	}

}