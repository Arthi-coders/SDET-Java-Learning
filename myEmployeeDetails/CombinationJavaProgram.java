package myEmployeeDetails;

public class CombinationJavaProgram {
	int nums[]= {10, 15, 20, 25, 30};
	public void Even() {
	System.out.println("Find Even numbers :");
	for(int i=0;i<nums.length;i++) {
		if(nums[i]%2 == 0) {
			System.out.println("nums[" + i + "] = " +nums[i]);
		}
	}
}
	public void odd() {
	System.out.println("Find odd numbers :");
	for(int i=0;i<nums.length;i++) {
		if(nums[i]%2 != 0) {
			System.out.println("nums[" + i + "] = " +nums[i]);
		}
	}
}
	public void Sumofarray() {
	int sum=0;
	System.out.println("Find the sum of Array :");
	for(int i=nums.length-1;i>=0;i--) {
		System.out.println("nums[" + i + "] = " +nums[i]);
		sum=sum+nums[i];
	}
	System.out.println("Sum of Array :" +sum);

}

	public static void main(String[] args) {
		CombinationJavaProgram summary = new CombinationJavaProgram();
		summary.Even();
		summary.odd();
		summary.Sumofarray();

}
}