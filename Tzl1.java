public class Tzl1{
	public static void main(String[] args){
		 int a=50;
		 int b=9000;
		 int c=2+a+b;
		System.out.println(c);
	}
}
class BUG{
	public static void main(String[] args){
	int a=100;
	int b=90;
	System.out.println(a);
	System.out.println(b);
		}
	}
class Add{
		public static void main(String[] args){
			System.out.println(100+98);
			System.out.println("100"+98);
			System.out.println(100+3+"hello");
			System.out.println("hello"+100+3);
		}
	}
class tzl{
	public static void main(String[] args){
		byte n1=126;//分配了1 个字节的空间来存储 10
		short n2=11;//分配了 2 个字节的空间来存储 11
		System.out.println(1+n1);
		System.out.println(1+n2);
	}
}
class TZL{
	public static void main(String[] args){
		 float num1=1.1f;//java的浮点型常量默认为 double 型，声明 float 型常量，须后加'f'或'F'
		 double num2=1.1f;//小放大是绝对没有问题的
		 double num3=.123;//等价于0.123
		 double num4=2.1234567851;
		 float num5=2.1234567851F;
		 System.out.println(5.12e2);//512.0
		 System.out.println(5.12E-2);//0.0512
		 double num6=2.7;
		 double num7=8.1/3;//接近 2.7 的一个小数，而非 2.7
		 System.out.println(num7);
		 System.out.println(num6);
		 if(num6==num7){
		 	System.out.println("相等");
		 }
		 if(Math.abs(num6-num7)<0.00001){
		 	System.out.println("差值非常小，到我的规定精度，认为相等.......");
		 }
		 System.out.println(Math.abs(num6-num7));
		 // System.out.println(num4);
		 // System.out.println(num5);
	}
}