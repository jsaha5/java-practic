package array2d;

public class DecimalCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { -4, 3, -9, 0, 4, 1};
		double postive = 0;
		double negative = 0;
		double zero = 0;
		for (int i:arr) {
			if (i > 0) {
				postive++;

			} else if (i < 0) {
				negative++;

			} else if (i == 0) {
				zero++;

			}

		}
		System.out.println(postive / arr.length);
		System.out.println(negative / arr.length);
		System.out.println(zero / arr.length);
	}

}
