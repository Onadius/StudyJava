/******************
Main Function
Class : Vocaloid
******************/
import java.util.Scanner;
public class Vocaloid{ //ファイル名と同じクラス名を定義する
	public static void main(String[] args) {

		//配列定義
		Person[] people = new Person[2];

		//インスタンス定義
		people[0] = new Person("初音ミク", 39);
		people[1] = new Person("巡音ルカ", 21);

		//出力
		for(int i = 0; i < people.length; i++){
			people[i].Output();
		}


		//データセット
		Scanner scanner = new Scanner(System.in);
		System.out.println("---- Input Change Data(Name, Age) ----");

		String chg_name = scanner.next();
		people[1].setName(chg_name);

		int chg_num = scanner.nextInt();
		people[1].setAge(chg_num);

		//出力
		for(int i = 0; i < people.length; i++){
			people[i].Output();
		}

		//データ取得
		System.out.println("---- Get Data(Name, Age) ----");
		System.out.println(people[1].getName());
		System.out.println(people[1].getAge());

	}
}
