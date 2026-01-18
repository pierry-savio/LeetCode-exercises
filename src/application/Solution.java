/*
	Median of Two Sorted Arrays:

	Given two sorted arrays nums1 and nums2 of size m and n respectively,
	return the median of the two sorted arrays.

	The overall run time complexity should be O(log (m+n)).
	
	-> Example 1:
	
		Input: nums1 = [1,3], nums2 = [2]
		Output: 2.00000
		Explanation: merged array = [1,2,3] and median is 2.
		
	-> Example 2:
	
		Input: nums1 = [1,2], nums2 = [3,4]
		Output: 2.50000
		Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
*/

package application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
	
	public static void main (String[] args) {
		
		int[] nums1 = {1,2,8,9,4,6};
		int[] nums2 = {17,20,18};
		
		System.out.println("Mediana: " + findMedianSortedArrays(nums1, nums2));
	}
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
       
    	List<Integer> nums3 = new ArrayList<>();
    	
        for (Integer n1 : nums1) {
        	nums3.add(n1);
        }
        
        for (Integer n2 : nums2) {
        	nums3.add(n2);
        }
        
        Collections.sort(nums3);
           
        double centerNumber = nums3.get(nums3.size()/2);
        double centerNumberMinusOne = (nums3.size()>1) ? nums3.get(nums3.size()/2-1) : 0.0;
    
        return (nums3.size()%2 == 0) ? (centerNumber+centerNumberMinusOne)/2 : centerNumber;
    }
}
