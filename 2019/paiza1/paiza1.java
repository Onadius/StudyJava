/*
	Q7:N倍の文字列
*/
import java.util.*;

class paiza1{
	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			int in_num = scanner.nextInt();	//入力値
			String str="";

			//入力値チェック
			if ((in_num < 0)||(in_num > 100)) {
				System.out.println(in_num + ":入力値エラーです");
				System.exit(0);
			}


			for (int i = 0; i < in_num ; i++) {
				str += "*";
			}

			str += "\n";
			System.out.println(str);
	}
}
