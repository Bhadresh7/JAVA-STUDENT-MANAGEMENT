package collections_Example;

public class StudentData {

	private int id;
	private String name;
	private int age;
	private String std;
	
	
	
	@Override
	public String toString() {
		return "StudentData [id=" + id + ", name=" + name + ", age=" + age + ", std=" + std + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public StudentData(int id, String name, int age, String std) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.std = std;
	}










}
