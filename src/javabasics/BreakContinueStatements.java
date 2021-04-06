package javabasics;


/*
 * The break statement can also be used to jump out of a loop.
 */

/*
 * The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.
 */

/* The return Statement
The last of the branching statements is the return statement. 
The return statement exits from the current method, and control flow returns to where the method was invoked. 
The return statement has two forms: one that returns a value, and one that doesn't. 
To return a value, simply put the value (or an expression that calculates the value) after the return keyword.
return ++count;
*/
public class BreakContinueStatements {
	public static void main(String[] args) {

		int[][] arrayOfInts = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622, 127, 12, 955 } };
		int searchfor = 12;

		int i;
		int j = 0;
		boolean foundIt = false;

		search: for (i = 0; i < arrayOfInts.length; i++) {
			for (j = 0; j < arrayOfInts[i].length; j++) {
				if (arrayOfInts[i][j] == searchfor) {
					foundIt = true;
					break search;
				}
			}
		}

		if (foundIt) {
			System.out.println("Found " + searchfor + " at " + i + ", " + j);
		} else {
			System.out.println(searchfor + " not in the array");
		}
		
		
		
	     int[] arrayOfInt = 
	            { 32, 87, 3, 589,
	              12, 1076, 2000,
	              8, 622, 127 };
	        searchfor = 12;

	        foundIt = false;

	        for (i = 0; i < arrayOfInt.length; i++) {
	            if (arrayOfInt[i] == searchfor) {
	                foundIt = true;
	                break;
	            }
	        }

	        if (foundIt) {
	            System.out.println("Found " + searchfor + " at index " + i);
	        } else {
	            System.out.println(searchfor + " not in the array");
	        }
	        
	        
	        
	        
	        String searchMe = "peter piper picked a " + "peck of pickled peppers";
	        int max = searchMe.length();
	        int numPs = 0;

	        for (int k = 0; k < max; k++) {
	            // interested only in p's
	            if (searchMe.charAt(k) != 'p')
	                continue;

	            // process p's
	            numPs++;
	        }
	        System.out.println("Found " + numPs + " p's in the string.");
	        
	        
	}
}
