package StepDefinition;

public class Parent {
	int a;
	String k;
	
	Parent(){
		this.a=12;
		System.out.println("inside");
	}
	
	Parent(String b){
		this.k=b;
		System.out.println("Overload");
	}
	
	public static void method1(int s) {
		System.out.println("inside parent");
	}
	

public static void method1(String a) {
	System.out.println("inside sub");
}
}


class sub extends Parent{
	private static void method1(String a) {
		System.out.println("inside sub");
	}
	}
