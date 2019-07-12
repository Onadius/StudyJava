import java.util.*;


class paiza4 {
	public static void main(String[] args) {

		/***
			コーヒーの価格と割引き率を入力
		***/
		Scanner scanner1 = new Scanner(System.in); //キーボードからの入力
		int coffe_val = scanner1.nextInt();
		int discount_rate = scanner1.nextInt();

		/***
			出力力処理
		***/
		double pay_all = 0;
		double current_val = (double)coffe_val;
		double off_val = 0;

		while (current_val > 0) {
			//支払い総額算出
			pay_all += current_val;

			//値引き額算出
			off_val = Math.ceil(current_val*((double)discount_rate/100));

			//次回購入価格算出
			current_val = current_val - off_val;

			//System.out.println(off_val);
			//System.out.println(current_val);
		}

		System.out.println((int)pay_all);

	}
}
