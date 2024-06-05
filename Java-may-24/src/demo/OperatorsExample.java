package demo;

public class OperatorsExample {

	public static void main(String[] args) {

		int a;
		a=10;
		
		System.out.println("a:"+a);
		a += 10;
				
				System.out.println("a:"+a);
				
				a-=5;
				System.out.println("a:"+a);
				a*=2;
				System.out.println("a:"+a);
				
				a/=3;
				System.out.println("a:"+a);
				
				a++;
				System.out.println("a:"+a);
				a--;
				System.out.println("a:"+a);
	System.out.println("a:"+--a);
	//System.out.println("a:"+--a);
	
	a+=1;
	System.out.println("a: "+a);
	
	int b=20;
	System.out.println("b: "+b);
	
	boolean bool1 = a==b;
	
	System.out.println(bool1);
	System.out.println(a<=b);
	System.out.println(a>=b);
	System.out.println(a!=b);
	
	int c=30;
	System.out.println(c);
	
	System.out.println(a==c||a==b);
	System.out.println(a!=c&&a==b);
	System.out.println(a!=c||a==b);
	System.out.println(a!=c&&a!=b);
	
	System.out.println(a<b ? a:b);
	System.out.println(a<b ? "A is small" : "B is big");
	
	if(a<c) {
		System.out.println("A value with if condition:" +a);
	}
	
	if(a<b) {
		System.out.println("B value with if condition:" +b);
	}else {
		System.out.println("A value with if condition:" +a);
	}
	if(a>b) {
		System.out.println("B value with if condition:" +b);
	}else if(a>c){
		System.out.println("A value with if condition:" +a);
	}else {
		System.out.println("Not staisfing any condition...");
	  }
					
	}

}
