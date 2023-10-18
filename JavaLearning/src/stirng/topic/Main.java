package stirng.topic;

public class Main {

	public static void main(String[] args) {
		String str="abc";
		String str2= new String("heelo"); // Defining the string in using the concept of Object creation.
//		System.out.println(str);
//		System.out.println(str2);
		
		// let create to string.
		String a="hello";
		String b=a;
		String c="hello";
		String d= new String("hello");
		System.out.println(a==b); // true   --> in this case a and b is referning to same string
		System.out.println(a==c); //true   --> in this case we define to different string
		System.out.println(a==d); //false --> here String a is created using "" and d is creating using new keyword.
		System.out.println(c==d); //false --> here String a is created using "" and d is creating using new keyword.
		
		
		// When we are comparing the String a with d and c with d we are getting the false on using compare operator.
		// reason in java compare operator is use to compare the address of the to value not the content.
		
		// String 
//		String is a imutable type in java.

//		Why string is immmutable in java
//		As in java most of the important operation we do is using string like class loading , and also use string for storing important data in java
//		if string is mutable in that case any one can change the string content which leads to leak or ulter of sensitive data , or lead to failure of class loading process.
		
		//Conversion of String to primitive data types.
		String h="10";
		int num = Integer.parseInt(h);
		System.out.println(num);
		long numLo=Long.parseLong(h);
		System.out.println(numLo);
		String bo ="true";
		boolean co=Boolean.parseBoolean(bo);
		System.out.println(co);
		
		
		// Object 
//		we create Object by using new key word
		System.out.println("###########################");
		
		Dog dog = new Dog(); // Creating object of dog using Dog class name.
			dog.whatIsTheAge();
			dog.voice();
			dog.feet();
			dog.nameOfDog();
			
		System.out.println("###########################");
		
		SeniorDog seniorDog = new SeniorDog();  // Creating object of seniorDog using SeniorDog class name.
			seniorDog.whatIsTheAge();
	//		seniorDog.voice(); // doesnot implemet Animal Interface
	//		seniorDog.feet();   // doesnot implemet Animal Interface
			seniorDog.nameOfDog();
		
		System.out.println("###########################");
		
		SeniorDog dog2= new Dog();  
			dog2.whatIsTheAge();
//			dog2.voice();
//			dog2.feet();
			dog2.nameOfDog();
			
		// in this case we Creating object of Dog using the SeniorDog class in LHS and Dog class name in RHS but the method is available with this object common to both class only.
		System.out.println("###########################");
		
		Animal dog3= new Dog();  // Creating object of Dog using the Animal Interface  in LHS and Dog class name in RHS
//			dog3.whatIsTheAge();
			dog3.voice();
			dog3.feet();
//			dog3.nameOfDog();
			
			// in this case we Creating object of Dog using the Animal class in LHS and Dog class name in RHS but the method is available with this object common to both class only.
		
	}
	
}
