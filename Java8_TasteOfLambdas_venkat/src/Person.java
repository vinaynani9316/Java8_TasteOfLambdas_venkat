
public class Person 
{
	String name;
	String Gender;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", Gender=" + Gender + ", age=" + age + "]";
	}
	public Person(String name, String gender, int age) {
		super();
		this.name = name;
		Gender = gender;
		this.age = age;
	}

}
