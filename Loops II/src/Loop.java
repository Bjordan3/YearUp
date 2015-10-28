public class Loop {

	public static void main(String[] args) {

		int [] number = {32, 44, 56, 53, 78, 14, 90, 90, 90, 45, 44, 44, 44, 44, 44, 44};
		IsThere(number, 44);
		HowMany(number, 44);
		IsThere(number, 0);
		
	
	}
	public static void IsThere(int[] nums, int num) {
		if (nums != null) {
			int equal = -1;
			for (int i = 1; i < nums.length; i++) {
				if (num == nums[i]) {
					equal = i;
					break;
				}
			}
			if (equal >= 0) {
				System.out.println("The number was found at location " + equal);
			}
			else{
				System.out.println("This number is not found");
			}
		}
	}
	public static void HowMany(int[] nums, int num) {
		if (nums != null) {
			int equal = 0;
			
			for (int i = 1; i < nums.length; i++) {
				if (num == nums[i]) {
					equal++;
					
				}
			}
			if (equal >= 0) {
				System.out.println(num + " is found "+ equal+ " times");
			}

		}
	}
}