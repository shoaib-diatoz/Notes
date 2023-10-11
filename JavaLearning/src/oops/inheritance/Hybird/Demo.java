package oops.inheritance.Hybird;

public class Demo {

	public static void main(String[] args) {
		A demo = new A();
		demo.printName();
		demo.printNumber();
		Dog dog = new Dog();
		dog.handShake();
		dog.voice();
		dog.iAmSuper();
		
		// TO understand multiple inheritance consider Interfaces Animal , Animal2 and Dog class.  
		
		// TO understand hybird inheriatnce consider Interfaces Ani (super), Animal(child of ani) , 
		//Animal2(child of ani) and Dog class(child of Animal and Animal 2).
	}
}
