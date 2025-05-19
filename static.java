class Static
{
	String name;
	int id;
	static String Schoolname="Raajam Matric Higher Secondary School";
		public static void main (String[]args)
		{
			Static ob1=new Static();
			ob1.name="Janani";
			ob1.id=304;
			Static ob2=new Static();
			ob2.name="Logu";
			ob2.id=055;
			Static ob3=new Static();
			ob3.name="Barani";
			ob3.id=304;
			System.out.println(ob1.name+" "+ob1.id+" "+Schoolname);
			System.out.println(ob2.name+" "+ob2.id+" "+Schoolname);
			System.out.println(ob3.name+" "+ob3.id+" "+Schoolname);
			
		}
}