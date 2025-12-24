package application;

public class Solution {

	public static void main(String[] args) {
		
		String[] strs = {"a"};
		String prefix = longestCommonPrefix(strs);
		
		String input = "";
		
		for (String s : strs) {
			input += s + ", ";
		}
		
		input = input.substring(0, input.length()-2);
		
		System.out.println("Input: " + input);
		
		System.out.println("Output: " + prefix);
	}
	
	public static String longestCommonPrefix(String[] strs) {
		
		String result = "";
		
        String target = strs[0];

        int count = 0;

        if (strs.length > 1){

            if (target.length() > 1){

                for (int i = 0; i<strs[0].length(); i++){

                    for (int j = 1; j<strs.length; j++){

                        if (strs[j].contains(target.substring(0, target.length()-i))){
                            count++;
                        }
                        else{
                            count = 0;
                        }
                        if (count == strs.length-1){
                            result = target.substring(0, target.length()-i);
                        break;
                        }
                    }
                }
            }
        }
        else if (strs.length <= 1){
            result = strs[0];
        }
        else{
            result = "";
        }
		
		return result;
	}
}
