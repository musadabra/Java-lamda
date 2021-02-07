package Lambda;

public class Person implements Comparable<Person>{

	int age;
	private String firstname;
	private String lastname;
	
	public Person(){}
	
	public Person(String fname, String lname, int age) {
		firstname = fname;
		lastname = lname;
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub	
		return o.getLastname().compareTo(lastname);
	}
	
	
	
	
}
