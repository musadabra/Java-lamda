package javabrains;

public class Basics {
	
   MyLambda greetingFunction = () -> System.out.print("hello");
   MyInt doublenumberFunction = (int a) -> a * 2;
   
   System.out.println(doublenumberFunction);
}

interface MyLambda{
	void foo();
}

interface MyInt{
	int intNum(int a);
}
