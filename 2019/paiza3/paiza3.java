import java.util.*;

class paiza3 {
	public static void main(String[] args) {
		/***
			金魚数 & ぽい数 & 耐久値 の入力処理
		***/
		Scanner scanner1 = new Scanner(System.in); //キーボードからの入力
		int gfish_num = scanner1.nextInt();
		int poi_num = scanner1.nextInt();
		int taikyu_val = scanner1.nextInt();

		/***
			金魚重量情報入力処理
		***/
		Scanner scanner2 = new Scanner(System.in);
		List<Integer> gfishs = new ArrayList<>();

		for (int i = 0; i < gfish_num ; i++) {
			int weight = scanner2.nextInt();
			gfishs.add(i);
		}


		/***
			結果出力処理
		***/
		int use_num = 0;
		int z_taikyu_val = taikyu_val;
		int save_num=0;

		int i = 0;
		while(i < gfish_num) {
			z_taikyu_val = z_taikyu_val - gfishs.get(i);

			if (z_taikyu_val > 0) {
				save_num += 1;
				i++;
			} else {
				use_num += 1;
				z_taikyu_val = taikyu_val; //残耐久値の初期化
			}

			//ポイの残数チェック
			if (poi_num == use_num) {
				break ;
			}
		}

		System.out.println(save_num);

	}
}
