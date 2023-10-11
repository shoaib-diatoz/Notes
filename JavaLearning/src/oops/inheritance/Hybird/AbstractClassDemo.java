package oops.inheritance.Hybird;

public abstract class AbstractClassDemo {

	int val =10;
	String  name = "nagaraj";
	
	public void printName() {
		System.out.println("Name:"+this.name);
	}
	// constructed method ... access modifier (public/private/protected/default , static ) + return type(void/string/int) + method name( printName) + method body( {...};
	public void printNumber() {
		System.out.println("Number: "+this.val);
	}
	
	
	// Un-constructed method ... without body only access modifier (public/private/protected/default , static ) + return type(void/string/int) + method name( printName);
	public abstract void abc();
	
}
