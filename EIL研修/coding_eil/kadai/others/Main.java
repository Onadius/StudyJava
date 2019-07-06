import java.util.*;
/* メインクラス */
class Main{
	/* 処理開始されるmainメソッド */
	public static void main(String[]args){
		/* 画面入力に使うScannerクラス */
		Scanner cin=new Scanner(System.in);
		/* 変数宣言 */
		String line;
		for(;cin.hasNext();){
			/* 入力された値をline変数にセット */
			line=cin.nextLine();
			/* 大文字に変換してコンソール出力 */
			System.out.println(line.toUpperCase());
		}
	}
}
