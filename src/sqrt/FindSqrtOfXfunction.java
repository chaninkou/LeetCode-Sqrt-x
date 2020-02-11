package sqrt;

public class FindSqrtOfXfunction {
	// Binary search way
	public int mySqrt2(int x) {
		if (x == 0) {
			return 0;
		}

		int left = 1;
		int right = x;

		while (true) {

			// To prevent overflow, use below instead of left + right /2
			int mid = left + ((right - left) / 2);

			if (mid > x / mid) {
				right = mid - 1;
			} else {
				if (mid + 1 > x / (mid + 1)) {
					return mid;
				}
				
				left = mid + 1;
			}
		}
	}

	// Integer Newton
	public int mySqrt(int x) {
		// Using long in case it will overflow when we check answer * answer > x
		long answer = x;
		
		while(answer * answer > x){
			
			// Keep dividing by 2
			answer = (answer + answer/x)/2;
		}
		
		return (int) answer;
	}
}
