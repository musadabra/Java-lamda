package Lambda;

import java.util.List;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class UnitOneExeciseSolution {
  public static void main(String[] args) {
	List<Person> people = Arrays.asList(
				new Person("musa", "hassan", 23),
				new Person("ibra", "nuhu", 23),
				new Person("musa", "muhammd", 23),
				new Person("tukur", "yusuf", 23),
				new Person("ismail", "josua", 23),
				new Person("ayuba", "dauda", 23)
			);
	
	//Sort all people by last name
	//Sort with TreeSet
    System.out.println(sortedPeopleTree(people));
	
	//Sort with comparable
	Collections.sort(people, (o1, o2) -> o1.getLastname().compareTo(o2.getLastname()));
	
	//Create a method that prints persons element
	System.out.println("Sorted");
	printSomeWithCondition(people, p -> true);
	
	//Create a method that print all people that have a last name with m
	System.out.println("Start with");
	printSome(people, "m");
	
	//Print match with condition
	printSomeWithCondition(people, p -> p.getLastname().startsWith("h"));
   }
  
  public static void printSomeWithCondition(List<Person> person, Condition condition) {
	  for (Person p : person) {
		  if(condition.test(p))
			    System.out.println(p);
	  }
  }
 
  
  public static void printSome(List<Person> p, String firstchar) {
//	  Iterator<Person> per = p.iterator();
//	  while (per.hasNext()) {
//		  Person obj = per.next();
//		  if(obj.getLastname().startsWith(firstchar))
//		    System.out.println(obj);
//	  }
	  
	  for (Person person : p) {
		  if(person.getLastname().startsWith(firstchar))
			    System.out.println(person);
	}
  }
  
  
  public static TreeSet<Person> sortedPeopleTree(List<Person> people){
	  Iterator<Person> it = people.iterator();
	  TreeSet<Person> tree = new TreeSet<Person>();
	  while(it.hasNext()) {
		  tree.add(it.next());
	  }
	  return tree;	  
  }
  
}
