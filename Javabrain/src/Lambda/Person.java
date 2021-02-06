package Lambda;

public class Person implements MyLambda{

	int age;
	String name;
	
	Person(){}
	
	@Override
	public String show() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return age+name;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	} 
}
