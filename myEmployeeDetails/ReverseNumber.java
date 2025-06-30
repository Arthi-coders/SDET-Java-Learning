package myEmployeeDetails;

public class ReverseNumber {

	public static void main(String[] args) {
		int nums[]= {10, 15, 20, 25, 30};
		for(int i=nums.length-1;i>=0;i--) {
			System.out.println("nums[" + i + "] = " +nums[i]);
					//nums[nums.length - 1]); this will print only last elements
					//"nums[" + i + "] = " +nums[i]);
		}



	}

}
