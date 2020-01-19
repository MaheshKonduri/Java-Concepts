package practicejava.basics.concepts.arrays;

/*PROBLEM-1
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].*/

public class LeetCodeChanges {

	/*
	 * public int[] twoSum(int[] nums, int target) {
	 * System.out.println("value entered here : "); for (int i = 0; i < nums.length;
	 * i++) { System.out.println("inside for loop "); for (int j = i + 1; j <
	 * nums.length; j++) { if ((nums[i] + nums[j]) == target) { System.out.print(j);
	 * 
	 * //return arr; }
	 * 
	 * }
	 * 
	 * } int[] arr= {nums[i], nums[j]}; return arr;
	 * 
	 * }
	 */
	public int[] twoSum(int[] nums, int target) {
		int intArr[] = { 0, 0 };
		for (int i = 0; i < (nums.length); i++) {
			System.out.println("i value: " + nums[i]);
			for (int j = i + 1; j < nums.length; j++) {
				System.out.println("j value: " + nums[j]);
				int value = nums[i] + nums[j];
				System.out.println("value is : " + value);
				if (target == value) {
					System.out.println(nums[i] + "---" + nums[j]);
					intArr[0] = nums[i];
					intArr[1] = nums[j];
				}
			}
		}
		return intArr;
	}

}
