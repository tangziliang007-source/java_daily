public class Tzl2{
	public static void main(String[] args){
		char c1='a';
		char c2='\t';
		char c3='韩';
		char c4=97+1;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);

	} 
}
class Detail{
	public static void main(String[] args){
		// char c1='a';
		// System.out.println((int)c1); 
		// int c2=97;
		// System.out.println((char)c2);
		// char c3='汤';
		// char c4='梓';
		// char c5='亮';
		// int num1=27748;
		// int num2=26771;
		// int num3=20142;
		// int num4=20143;
		// System.out.println((char)num1);
		// System.out.println((char)num2);
		// System.out.println((char)num4);
		Boolean pass=false;//布尔类型在java里面只能用true 和 false 来表达
		if(pass!=false){
			System.out.println("你无敌了");
		}else {
			System.out.println("你真的弱爆了");
		}
	}
}
class AutoConvert{
	public static void main(String[] args){
		int n1=10;
		double d1=n1+1.1;//系统自动转换成容量大的
		float d2=n1+1.1F;
		int n2=10;//byte，short和char之间不会相互自动转换
		System.out.println(d1);
		System.out.println(d2);

	}
}
class AAA{
	public static void main(String[] args){
		byte b1=1;
		short s1=1;
		int s2=b1+s1;//short\byte\char三者可以计算，在计算是要转换成int类型
		System.out.println(s2+b1);//float和int都是4字节但是float的精度比int高
	}
}