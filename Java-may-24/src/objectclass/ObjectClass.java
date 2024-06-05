package objectclass;

public class ObjectClass {


	void display(Object obj) {
		System.out.println(obj);
	}
	
	ObjectClass currentObj(){
		return this;
	}
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	//	List =
		
		Object objCls1 = new ObjectClass();
		
		Object bool1 = true;
		byte b1 = 100;
		Object byte1 = b1;
		short s1 = 200;
		Object short1 = s1;
		Object char1 = 'A';
		int i1 = 1000;
		Object int1 = i1;
		long l1 = 10000L;
		Object long1 = l1;
		float f1 = 100.5F;
		Object float1 = f1;
		double d1 = 100.4637E25D;
		Object double1 = d1;
		Object string1 = "Hello";
		Object ae = new ArithmeticException();
		Object e = new Exception();
		
		Object a = 100;
		
		System.out.println(a);
		int i2 = (int)a;
		
		System.out.println(i2*5);
		
		
        Object[] objArr = {true,100,200,'A',1000,10000L,100.5F,100.4637E25D,"Hello", new ObjectClass()};
		
        ObjectClass objCls2 = (ObjectClass)objCls1;
		
		objCls2.display(100);
		objCls2.display("Hello");
		objCls2.display('A');
		objCls2.display(true);
		objCls2.display(100.5F);
		
		
		var v1 = 100;
		var v2 = 200;
		var v3 = 'A';
		var v4 = "Hello";
		var v5 = true;
		var v6 = new ObjectClass();
		 
		v6.display(100);
		
		var currObj = objCls2.currentObj();
		currObj.display("Hello this is current class object");

	}

}
