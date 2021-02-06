package to.dev;
import java.util.*;

public class CandyFactory {
  String name;
  Color color;
  Collection<CandyFactory> capacity;
  
  public CandyFactory() {
	// TODO Auto-generated constructor stub
  }
  
  String getName() {
	  return name;
  }
  
  int getCapacity() {
	  return capacity.size();
  }
  
  Color getColor() {
	  return color; 
  }
  
  Collection<CandyFactory> bagOfCandy() {
	  return capacity;
  }
  
}
