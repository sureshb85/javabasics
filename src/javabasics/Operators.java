package javabasics;

/*
 * Operators are special symbols that perform specific operations on one, two, or three operands, and then return a result.
 * 	Operators		Precedence
	postfix			expr++ expr--
	unary			++expr --expr +expr -expr ~ !
	multiplicative	* / %
	additive		+ -
	shift			<< >> >>>
	relational		< > <= >= instanceof
	equality		== !=
	bitwise 		AND	&
	bitwise exclusive OR	^
	bitwise inclusive OR	|
	logical AND		&&
	logical OR		||
	ternary			? :
	assignment		= += -= *= /= %= &= ^= |= <<= >>= >>>=
 */


// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html


public class Operators {
	public static void main(String[] args) {
		 int result = 1 + 2;
	        // result is now 3
	        System.out.println("1 + 2 = " + result);
	        int original_result = result;

	        result = result - 1;
	        // result is now 2
	        System.out.println(original_result + " - 1 = " + result);
	        original_result = result;

	        result = result * 2;
	        // result is now 4
	        System.out.println(original_result + " * 2 = " + result);
	        original_result = result;

	        result = result / 2;
	        // result is now 2
	        System.out.println(original_result + " / 2 = " + result);
	        original_result = result;

	        result = result + 8;
	        // result is now 10
	        System.out.println(original_result + " + 8 = " + result);
	        original_result = result;

	        result = result % 7;
	        // result is now 3
	        System.out.println(original_result + " % 7 = " + result);
	        
	        String firstString = "This is";
	        String secondString = " a concatenated string.";
	        String thirdString = firstString+secondString;
	        System.out.println(thirdString);
	        
	        System.out.println("=================Unary operators===========================");
	        //int value = value + 1;
	        int value = +1;
	        // result is now 1
	        System.out.println(value);

	        // value = value - 1;
	        value--;
	        // result is now 0
	        System.out.println(value);

	        value++;
	        // result is now 1
	        System.out.println(value);

	        value = -value;
	        // result is now -1
	        System.out.println(value);

	        boolean success = false;
	        // false
	        System.out.println(success);
	        // true
	        System.out.println(!success);
	        
	        System.out.println("=================Relational operators===========================");
	        int value1 = 10;
	        int value2 = 20;
	        if(value1 == value2)
	            System.out.println("value1 == value2");
	        if(value1 != value2)
	            System.out.println("value1 != value2");
	        if(value1 > value2)
	            System.out.println("value1 > value2");
	        if(value1 < value2)
	            System.out.println("value1 < value2");
	        if(value1 <= value2)
	            System.out.println("value1 <= value2");
	        System.out.println("====================conditional operators===========================================");
	        if((value1 == 1) && (value2 == 2))
	            System.out.println("value1 is 1 AND value2 is 2");
	        if((value1 == 1) || (value2 == 1))
	            System.out.println("value1 is 1 OR value2 is 1");
	        
	        boolean someCondition = true;
	        result = someCondition ? value1 : value2;

	        System.out.println(result);
	}
}
