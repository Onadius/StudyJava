/******************
Class : Person
******************/
public class Person {
	private String name; //private 他クラスからはアクセス不可
	private int age;     //private 他クラスからはアクセス不可

	//インスタンス生成
	public Person(String _name, int _age){
		name = _name;
		age = _age;
	}

	//name 更新
	public void setName(String chg_name){
		name = chg_name;
	}

	//age 更新
	public void setAge(int chg_age){
		if (chg_age < 0) {
			age = 3939;
		}else{
			age = chg_age;
		}
	}

	//name 取得
	public String getName(){
		return name;
	}

	//age 取得
	public int getAge(){
		return age;
	}

	//出力
	public void Output(){
		String msg;

		msg = "Vocaloid Name:" + name + "\n";
		msg = msg + "Vocalod No:" + age;
		System.out.println(msg);
	}

}
