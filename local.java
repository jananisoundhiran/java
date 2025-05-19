class Local
{
	String name;
	int id;
		public static void main (String[]args)
		{
			Local ob1=new Local();
			ob1.name="Janani";
			ob1.id=304;
			Local ob2=new Local();
			ob2.name="Logu";
			ob2.id=55;
			Local ob3=new Local();
			ob3.name="Barani";
			ob3.id=304;
			String bloodgroup1="o+ve";
			String bloodgroup2="b+ve";
			String bloodgroup3="a+ve";
			System.out.println(ob1.name+" "+ob1.id+" "+bloodgroup1);
			System.out.println(ob2.name+" "+ob2.id+" "+bloodgroup2);
			System.out.println(ob3.name+" "+ob3.id+" "+bloodgroup3);
			
		}
}