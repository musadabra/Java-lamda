package Lambda;

public class RunnableExample {
	public static void main(String[] args) {
		
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Printed inside");
			}
		}); 
		
		myThread.run();
		
		Thread myLambdaThread = new Thread(() -> System.out.println("Printed inside lambda") );
		myLambdaThread.run();
	}
}
 