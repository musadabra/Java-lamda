package Lambda;

public class Basic {
	
  public static void main(String [] args) {
	  MyLambda show = (s) -> s;
	  
	  System.out.print(show.show("something"));
  }
  
  public static void printLambda(String S) {
	  System.out.println(S);
  }
 
}

