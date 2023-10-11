package oops.inheritance.Hybird;

public class Dog implements Animal, Animal2{

	@Override
	public void voice() {
		// TODO Auto-generated method stub
		System.out.println("Bow!!!");
	}

	@Override
	public void handShake() {
		// TODO Auto-generated method stub
		System.out.println("handShake !!!");
	}

	@Override
	public void iAmSuper() {
		// TODO Auto-generated method stub
		System.out.println("Method from Ani Inteface !!!");
	}

}
