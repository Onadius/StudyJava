/* --- Scannerクラスの扱い
import java.util.Scanner;

キーボードからの入力を受けつける場合はSystem.inを使って下記のように記述します。
Scanner scan = new Scanner(System.in);


[区切り文字を変更する]
例えば区切り文字をカンマ(,)に変更する場合は下記のようになります
Scanner scan = new Scanner(System.in);
scan.useDelimiter(",");


*/

import java.util.Scanner;

class howtoScanner {
  public static void main(String[] args) {

    String[] strs = new String[5] ;

    System.out.println("数字を入力して下さい。");

    //入力オブジェクト作成
    Scanner scan = new Scanner(System.in) ;
    scan.useDelimiter("\n");


    for(int i = 0 ; i < 5 ; i++ ){
      strs[i] = scan.next();
      System.out.println("出力:" + strs[i]) ;

    }


  }
}
