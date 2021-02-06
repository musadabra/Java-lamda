package javabrains;

public class Basics {
	
   MyLambda greetingFunction = () -> System.out.print("hello");
   doublenumberFunction = (int a) -> a * 2;
   
}

interface MyLambda{
	void foo();
	int intNum(int a);
}
