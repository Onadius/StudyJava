/* ----------------------------
【問題】
「0123456789」の10枚のカードの内、4枚のカードが提示されます。
通常は、「最も数値が大きなカード」が勝利者のカードです。
4枚の中に0があれば、「0以外で最も小さなカード」が勝利者のカードです。
勝利者のカードの数値を割り出してください。


【入力】
標準入力から、複数行のデータが与えられます。1行のデータが、1セットのゲームになります。
1行のデータは、数字4文字の文字列になります。この1文字ずつが、1枚のカードになります。


【出力】
1行ずつ結果を判定して、その答えとなる数字を、1行ごと標準出力に出力します。


【入出力サンプル】
Input
1234
6745
0149
3705

Output
4
7
1
3
---------------------------- */

import java.util.Scanner ; /**  Scannerオブジェクト  **/
import java.util.* ; /** printf()オブジェクト **/

class kadai3 {
  public static void main(String[] args) {

    int N_error = 0 ; //入力上限数エラー用
    int ak_error = 0 ; //実引数akエラー用
    int o_select = 0 ; //出力確認用
    int o_error = 0 ; //出力エラー用
    ArrayList<String> numStr = new ArrayList<String>() ; //可変長Int型リスト宣言
    char[] char_inp_num = new char[4] ; //String --> char[]変換用
    int[] int_inp_num = new int[4] ; //char[] --> int[]変換用


    /* 開始処理(object化したい) */
    System.out.println("数字4ケタ(4枚のカード)を入力して!!(終了時9999入力)");

    /* -- Scaccerオブジェクトの作成 -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* -- 上限数エラーオブジェクトの作成 -- */
    chkNumError kawaii = new chkNumError() ;

    /* 入力文字列の格納処理 */
    for( int i = 0 ; ; i++ ){
      numStr.add(scan1.next()) ;
      N_error = kawaii.checkInputNum2( numStr.get(i).length(), 4 ) ; // int, int --> int

      if( N_error == 0 ) { //入力ケタ数エラー処理
        System.out.print("キミはカードの上限数をエラーしちゃうフレンズなんだね!!\n") ;
        System.exit(0) ;
      }

      /* 入力終了処理 */
      if( numStr.get(i).equals("9999") ) {
        System.out.println("入力処理を終了するよ!");
        break ;
      }
    }

    /* 文字列扱いオブジェクト作成 */
    chkStrError serval = new chkStrError() ;

    /* 出力オブジェクト作成 */
    output gotiusa = new output() ;

    for( int i = 0 ; i < (numStr.size() - 1) ; i ++) { //以降一行ずつの文字分解処理

      char_inp_num = serval.changeCharArrey(numStr.get(i)) ; // str --> char[]
      int_inp_num = serval.changeIntCahr(char_inp_num) ; //char[] --> int[]

      Arrays.sort(int_inp_num) ; //int[]の昇順ソート
      o_select = gotiusa.output_3ver2(int_inp_num) ; //int[] --> int
      if(o_select == 0) {
        System.out.print("食べないよ！！\n") ;
        System.exit(0) ;
      }

      /* -- 出力処理選別
      o_select = serval.analyzeStr(char_inp_num) ; //string --> int
      switch (o_select) {

        case 1 : gotiusa.output_3(int_inp_num, o_select) ; break ;
        case 2 : gotiusa.output_3(int_inp_num, o_select) ; break ;
        case 0 :
          System.out.println("errorうわあああああああああ!!!") ; System.exit(0) ;
      }
      -- */
    }

     /* 終了処理(object化したい) */
    System.out.println("すごーーい！!\n") ;
  }
}
