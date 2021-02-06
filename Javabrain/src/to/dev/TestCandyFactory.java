package to.dev;

import java.util.*;

public class TestCandyFactory {
	
	public static void main(String [] args, int Collection) {	
		
		CandyFactory candyFactory = new CandyFactory();
		Collection<CandyFactory> bagOfCandy = candyFactory.bagOfCandy();
		Collection<CandyFactory> redCandies = filterByColor(bagOfCandy, Color.RED);
		int numberOfReds = redCandies.size();
		    
	  }
	
   static Collection<CandyFactory> filterByColor( Collection<CandyFactory> assortedCandy, Color color){
		
		Collection<CandyFactory> results = new ArrayList<>();
	    for(CandyFactory candyPiece : assortedCandy) {
	        if(candyPiece.getColor().equals(color)) {
	            results.add(candyPiece);
	        }
	    }
	    return results;
	}

}