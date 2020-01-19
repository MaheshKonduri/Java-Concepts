/**
 * 
 */
package practicejava.basics.concepts.arrays;

/**
 * @author kmahe
 *
 */
public class CallingArraysConcepts {

	public void callBasicArray() {

		BasicArraysPractice basicArraysPractice = new BasicArraysPractice();
		basicArraysPractice.arrayTestmodel1();
		
		
	}
	
	/*
	 * This method is used to call leetcode challenges.
	 */
	public void callLeetCodeArrays() {
		LeetCodeChanges LeetCodeChanges = new LeetCodeChanges();
		int[] a = { 3,2,4};
		LeetCodeChanges.twoSum(a, 6);
		
	}

}
