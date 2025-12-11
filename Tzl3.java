public class Tzl3{
	public static void main(String[] args){
		// int n1=100;
		// float f1=1.1F;
		// double d1=4.6;
		// boolean b1=true;
		// String s1=n1+"";
		// String s2=f1+"";
		// String s3=d1+"";
		// String s4=b1+"";
		// System.out.println(s1+" "+s2+" "+s3+" "+s4+"");
		String s1="123";
		byte b1=Byte.parseByte(s1);
		int n4=Integer.parseInt(s1);
		short s2=Short.parseShort(s1);
		long n1=Long.parseLong(s1);
		boolean b2=Boolean.parseBoolean(s1);
		float n2=Float.parseFloat(s1);
		double n3=Double.parseDouble(s1);
		System.out.println("=======================================");	
		System.out.println(b1+1);
		System.out.println(n4+1);
		System.out.println(s2);
		System.out.println(n1);
		System.out.println(b2);
		System.out.println(n2);
		System.out.println(n3);
		System.out.println(s1.charAt(2));//从数组取字符
		}
}
class homework1{
	public static void main(String[] args){
		char c1='\n';//换行
		char c2='\t';//制表符
		char c3='\r';//回车
		char c4='\\';
		char n1='1';
		char n2='2';
		char b1='3';
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(b1);
	}
}
class homework2{
	public static void main(String[] args){
		String book_name1="红楼梦";
		String book_name2="西游记";
		char g1='男';
		char g2='女'	;
		int p1=20;
		int p2=23;
		System.out.println(book_name1+" "+book_name2);
		System.out.println(g1+" "+g2);
		System.out.println(p1+" "+p2);
	}
}
class homework3{
	public static void main(String[] args){
		String Name="姓名";
		String Age="年龄";
		String Score="成绩";
		String Gender="性别";
		String Hobby="爱好";
		String name="汤梓亮";
		int age=22;
		double score=369.22;
		char gender='男';
		String hobby="打篮球和游泳";
		System.out.println("姓名\t年龄\t成绩\t性别\t爱好\n"+name+"\t"+age+"\t"+score+"\t"+gender+"\t"+hobby);
	}
}