package Lambda;

public class TypeInfrensing2 {
	   public static void main(String[] args) {
		  TypeInfrance len = s -> s.length();
		  whatLength(s -> s.length());
		  
	   }
	   
	   public static void whatLength(TypeInfrance type) {
		   System.out.println(type.stringLength("my name"));
	   }
}
