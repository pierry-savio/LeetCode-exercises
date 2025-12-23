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
		int count = 0;
		
		for (int i = 0; i<strs[0].length(); i++) {
			
			for (int j = 1; j<strs.length; j++) {
				
				if (strs[j].contains(strs[0].substring(0, strs[0].length()-i))) {
					count++;
				}
				if (count == strs.length) {
					return strs[0].substring(0, strs[0].length()-i);
				}
			}
		}
		return result;
	}
}
