package oops.polymorphism;

public class PolyMorphismClass {
	
	// Polymorphism is basically the way of representing the same method with the different arguments
	// basically we can achive polymorphism by creating the method with same name and addin different argument parameters.
	public void abc() {
		
	}
	
	public void abc(long a) {
		
	}
	
	public void abc(String a) {
		
	}
		
	public void abc(String[] a) {
		
	}
	
	public void abc(int[] a) {
		
	}
	
	public void abc(long a,int b) {
		System.out.println("line 28");
		System.out.println(a+" : "+b);
	}
//	public void abc(int a,long b) {
//		System.out.println("line 32");
//		System.out.println(a+" : "+b);
//	}
	public void abc(int a,char b) {
		
	}
	
	public void abc(int a,String b) {
		
	}
	public static void main(String[] args) {
		PolyMorphismClass p = new PolyMorphismClass();
		p.abc(0, 0);
		// Live example of polymorphism
		System.out.println(1);      // printing Integer
		System.out.println("nagaraj");   // printing String
		System.out.println((char)'h');   // char
		
		// In polymorphism 
		// By using same name for a method we can show the different behavuiour of the method as we see in above example
		// we are printing different different values 
		
		// Advantage of polymorphism
//		Programmers code can be reused via Polymorphism.
//		Supports a single variable name for multiple data types.
//		Reduces coupling between different functionalities.
		
//		There are two types of polymorphism
//		1. Dynamic polymorphism( runtime polymorphism ) : --> we achive this by Overriding 
//		2. Static polymorphism (compile time polymorphism ) : --> we achieve this by Overloading.
		
		// Static Overloading we do with in a class. example the PrintStream.class (java library) and this class it self.
		// Dynamic overriding we do with the other class and interface in which we override the methods of other classes or interfaces.
		
	}
}

