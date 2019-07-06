/******************
Class : Person

******************/
class Person {
	String name;
	int age;

	//コンストラクタ --> クラス名と同じ名前のメソッド
	//インスタンス化された時に自動で呼び出されます
	Person(String _name, int _age){
		name = _name;
		age = _age;
	}

	//出力メッセージ整形メソッド
	String MakeMassage(){
		String msg;

		msg = "Vocaloid Name:" + name + "\n";
		msg = msg + "Vocalod No:" + age;
		return msg;
	}

	//出力メソッド
	//戻り値が無い場合は、戻り値の型に voidを指定
	void Output(String msg){
		System.out.println(msg);
	}

}



/******************
Main Function
Class : Vocaloid
******************/
class Vocaloid{
	public static void main(String[] args) {

		//クラス（型枠）のインスタンス（実体）化
		Person miku = new Person("初音ミク", 39);
		miku.Output(miku.MakeMassage());

		Person luka = new Person("巡音ルカ", 21);
		luka.Output(luka.MakeMassage());

	}
}
