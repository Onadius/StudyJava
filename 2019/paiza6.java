import java.util.*;


class paiza4 {
	public static void main(String[] args) {

		/***
			ƒR[ƒq[‚Ì‰¿Ši‚ÆŠ„ˆø‚«—¦‚ğ“ü—Í
		***/
		Scanner scanner1 = new Scanner(System.in); //ƒL[ƒ{[ƒh‚©‚ç‚Ì“ü—Í
		int coffe_val = scanner1.nextInt();
		int discount_rate = scanner1.nextInt();

		/***
			o—Í—Íˆ—
		***/
		double pay_all = 0;
		double current_val = (double)coffe_val;
		double off_val = 0;

		while (current_val > 0) {
			//x•¥‚¢‘ŠzZo
			pay_all += current_val;

			//’lˆø‚«ŠzZo
			off_val = Math.ceil(current_val*((double)discount_rate/100));

			//Ÿ‰ñw“ü‰¿ŠiZo
			current_val = current_val - off_val;

			//System.out.println(off_val);
			//System.out.println(current_val);
		}

		System.out.println((int)pay_all);

	}
}
