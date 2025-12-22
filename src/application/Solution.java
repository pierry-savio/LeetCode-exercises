package application;

public class Solution {

	public static void main(String[] args) {
		
	}
	
	public String longestCommonPrefix(String[] strs) {
		
		String result = "";
		
		for (int i = 0; i<strs[0].length(); i++) {
			if (strs[1].contains(strs[0].substring(0, strs[0].length()-i)) &&
				strs[2].contains(strs[0].substring(0, strs[0].length()-i))
			   )
			{
				return strs[0].substring(0, strs[0].length()-1);
			}
		}
		return result;
	}
}
