package string;

public class Dateformat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="06:40:03AM";
		int h1 = (int) s.charAt(0) - '0';
		int h2 = (int) s.charAt(1) - '0';
		int hh = h1 * 10 + h2 % 10;
		String newdate = " ";
		if (s.charAt(8) == 'P') {
			if(hh==12)
			{
				newdate = Integer.toString(hh);
				for (int i = 2; i < 8; i++) {
					newdate = newdate + s.charAt(i);
				}
				
			}
			else {
			hh = hh + 12;
			newdate = Integer.toString(hh);
			for (int i = 2; i < 8; i++) {
				newdate = newdate + s.charAt(i);
			}
			}
		} else {
			if (hh == 12) {
				newdate = "00";
				for (int i = 2; i < 8; i++)
					newdate = newdate + s.charAt(i);
			} else {
				for (int i = 0; i < 8; i++)
					newdate = newdate + s.charAt(i);
			
			}

		}
		
		System.out.println(newdate);
	}

}
