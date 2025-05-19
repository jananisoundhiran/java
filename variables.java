class Instance
{
	String name; 
	int id;
		public static void main (String[]args)
		{
			Instance ob1=new Instance();
			ob1.name="janu";
			ob1.id=304;
			Instance ob2=new Instance();
			ob2.name="logu";
			ob2.id=304;
			Instance ob3=new Instance();
			ob3.name="barani";
			ob3.id=304;
			System.out.println(ob1.name+" "+ob1.id);
			System.out.println(ob2.name+" "+ob2.id);
			System.out.println(ob3.name+" "+ob3.id);
		}
}