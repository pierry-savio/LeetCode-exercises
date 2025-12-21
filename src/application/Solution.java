package application;

/*
	Given a roman numeral, convert it to an integer.
 */

class Solution {
	
	public static void main (String args[]) {
		
		String s = "III";
		
		System.out.println("Input: " + s);
		System.out.println("Output: " + romanToInt(s));
		
	}
	
    public static int romanToInt(String s) {
        
        int result = 0;
        char previousLetter = 'M';

        for (int i = 0; i<s.length(); i++){
    
            char x = s.charAt(i);

            if (taller(x, previousLetter) == x){          

                switch (x){
                    case 'I':
                        result -= simpleRomanToInteger(previousLetter) + 1;
                    break;

                    case 'V':
                        result -= simpleRomanToInteger(previousLetter) + 5;
                    break;

                    case 'X':
                        result -= simpleRomanToInteger(previousLetter) + 10;
                    break;

                    case 'L':
                        result -= simpleRomanToInteger(previousLetter) + 50;
                    break;

                    case 'C':
                        result -= simpleRomanToInteger(previousLetter) + 100;
                    break;

                    case 'D':
                        result -= simpleRomanToInteger(previousLetter) + 500;
                    break;

                    case 'M':
                        result -= simpleRomanToInteger(previousLetter) + 1000;
                    break;
                }
            }
            else{
                switch (x){
                    case 'I':
                        result += 1;
                    break;

                    case 'V':
                        result += 5;
                    break;

                    case 'X':
                        result += 10;
                    break;

                    case 'L':
                        result += 50;
                    break;

                    case 'C':
                        result += 100;
                    break;

                    case 'D':
                        result += 500;
                    break;

                    case 'M':
                        result += 1000;
                    break;
                }
            }

            previousLetter = x;
        }
        return result;
    }

    public static int simpleRomanToInteger(char roman){
        
        int romanInt = 0;

        switch (roman){
            case 'I':
                romanInt = 1;
            break;

            case 'V':
                romanInt = 5;
            break;

            case 'X':
                romanInt = 10;
            break;

            case 'L':
                romanInt = 50;
            break;

            case 'C':
                romanInt = 100;
            break;

            case 'D':
                romanInt = 500;
            break;

            case 'M':
                romanInt = 1000;
            break;
        }

        return romanInt;
    }

    public static char taller(char first, char second){
        
        int firstNumber = 0;
        int secondNumber = 0;
        char taller = 'I';

        switch (first){

            case 'I':
                firstNumber = 1;
            break;

            case 'V':
                firstNumber = 5;
            break;

            case 'X':
                firstNumber = 10;
            break;

            case 'L':
                firstNumber = 50;
            break;

            case 'C':
                firstNumber = 100;
            break;

            case 'D':
                firstNumber = 500;
            break;

            case 'M':
                firstNumber = 1000;
            break;
        }

        switch (second){

            case 'I':
                secondNumber = 1;
            break;

            case 'V':
                secondNumber = 5;
            break;

            case 'X':
                secondNumber = 10;
            break;

            case 'L':
                secondNumber = 50;
            break;

            case 'C':
                secondNumber = 100;
            break;

            case 'D':
                secondNumber = 500;
            break;

            case 'M':
                secondNumber = 1000;
            break;
        }

        if (firstNumber > secondNumber){
            taller = first;
        }
        else if (firstNumber < secondNumber){
            taller = second;
        }
        else{
            taller = 'n';
        }

        return taller;
    }
}