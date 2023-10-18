package stirng.topic;

public class Dog extends SeniorDog implements Animal{

	
	@Override // Override the SeniorClass method.
	public void nameOfDog() {
		System.out.println("Tuffy");
	}
	
	@Override //Override the Animal Interface method.
	public void voice() {
		System.out.println("Boww!!!");
		
	}
	@Override // Override the Animal Interface method.
	public void feet() {
		System.out.println("4 Feet");
		
	}
	
	@Override   // Override the SeniorClass method.
	public void whatIsTheAge() {
		System.out.println("Age is 4 years");
	}
}
