package obj.obj;

public class Child {

	private int id;
	private String name;
	private int age;
	
	public Child(int id) {
		this.id=id;
	}
	public Child(String name) {
		this.name=name;
	}
	public Child(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public Child(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
}
