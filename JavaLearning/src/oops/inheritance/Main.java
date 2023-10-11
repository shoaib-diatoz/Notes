package oops.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat();
		cat.eyes();
		cat.feet();
		cat.voice();
		
		Dog dog = new Dog();
		dog.eyes();
		dog.feet();
//		dog.voice();
		
		
		//Types of Inheritance : -->
		// There are five types of inheritance 
		/*
		 * Single-level inheritance.  --> e.g Dog class is child Animal Class
		 * Multi-level Inheritance. --> e.g punny class is child of Dog, Dog is child of Animal,
		 * Hierarchical Inheritance.
		 * Multiple Inheritance. Hybrid Inheritance.
		 */
		
		
		//2. Multi-Level Inheritance Example
	    Puppy puppy = new Puppy();
		
		// Below 2 method belong to Animal Class
		puppy.eyes();
		puppy.feet();
		// Below 2 method belong to Dog class
		puppy.handshake();
		puppy.voice();
		// Below method belong to Puppy class
		puppy.puppu();
		
		
	}

}
