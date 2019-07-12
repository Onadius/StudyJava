import java.util.*;


class Student {
	private int student_no;
	private int score;
	private int absent;

	//インスタンス生成
	public Student(int i_sutudentNo,int i_score,int i_absent){
		student_no = i_sutudentNo;
		score = i_score;
		absent = i_absent*5;
	}

	//生徒番号取得
	public int getStudentNo(){
		return student_no;
	}

	//スコア取得
	public int getScore(){
		return score;
	}

	//欠席スコア取得
	public int getAbsent(){
		return absent;
	}

}



class Main {
	public static void main(String[] args) {

		/***
			学生人数 & 合格点 の入力処理
		***/
		Scanner scanner1 = new Scanner(System.in); //キーボードからの入力
		int student_num = scanner1.nextInt();
		int pass_score = scanner1.nextInt();

		/***
			生徒情報入力処理
		***/
		Student[] students = new Student[student_num]; //配列定義
		//Scanner scanner2 = new Scanner(System.in);

		for (int i = 0; i < student_num ; i++) {
			int in_score = scanner1.nextInt();
			int in_absent = scanner1.nextInt();

			students[i] = new Student(i+1, in_score, in_absent); //インスタンス作成
		}

		/***
			合格者出力処理
		***/
		for (int i = 0; i < student_num ; i++) {
		    if (pass_score == 0) {
		        System.out.println(students[i].getStudentNo());
		    }
			else if ((students[i].getScore() - students[i].getAbsent()) >= pass_score) {
				System.out.println(students[i].getStudentNo());
			}
		}

	}
}
