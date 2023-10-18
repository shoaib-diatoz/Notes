package obj.obj;

public class Child extends ParentClass {

	private int id;
	private String name;
	private int age;
	private static int helo =0;
	public Child(int id) {
		super(); //by default this super keyword exist here, in the constructor of the ChildClass
		this.id=id;
	}
	public Child(String name) {
//		super();
		super("Nagaraj");
		this.name=name;
	}
	public Child(int id,String name) {
//		super();
		super("Nagaraj");
		this.id=id;
		this.name=name;
	}
	
	public Child(int id,String name,int age) {
//		super();
		super("Nagaraj");
		this.id=id;
		this.name=name;
		this.age=age;
		
	}
	
	// super keywork is used to class the parent class and intialising the Parent object before intializing the child object.
	// In constructor of child the super key word exist as the first value or word.
	// no multiple super keyword exist in the child constructor to intialized the parent object.
	// if parent doesnot contains constructor without parmeter, then in super key word we have to pass the parameters so that parent object can be intialized.
	
}
