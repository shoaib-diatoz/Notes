package oops.inheritance.Hybird;

public class  A extends AbstractClassDemo{

	
	// This is the abstract method of AbstractClassDemo (abstract class) as A is extending that class , 
	//so now it's  A class responsibility to override that abstract method and provide implementation or body
	// other wise we again have to define A class as abstract class (if we don't want to override the abstract method
	// then the child of A class will have the resposibility to override the abstract method of AbstractClassDemo class
	@Override
	public void abc() {
		// TODO Auto-generated method stub
		
	}
	
	//The abstract method abd in class A can only be defined by an abstract class
	//public abstract void abd();

}
