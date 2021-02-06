package Lambda;

public class TestTypeInfrence {
   public static void main(String[] args) {
//	   WITH PARANTESIS
	  TypeInfrance len = (s) -> s.length();
	  System.out.println(len.stringLength("musa"));
	  
//	  WITHOUT PARANTESIS
	  TypeInfrance nopantesis = s -> s.length();
	  System.out.println(nopantesis.stringLength("musa"));
	  
   }
}
