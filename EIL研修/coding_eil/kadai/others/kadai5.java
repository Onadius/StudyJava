/* ----------------------------
【問題】
20桁の数字が提示されます。
一番左の桁を先頭として、右の桁へと順に見ていきます。
そして、隣り合った数が連続する数だった場合は、その双方を削除して先頭に戻ります。
最終的に、削除ができなくなった時点で数字を出力してください。

例
「95422357545868773174」→「95422357545868773174」→
「922357545868773174」→「922357545868773174」→
「9257545868773174」→「9257545868773174」→
「92575868773174」→「92575868773174」→
「925758673174」→「925758673174」→
「9257583174」（削除ができなくなったので、これが答え）


【入力】
標準入力から、複数行のデータが与えられます。1行のデータが、1つの20桁の数字になります。


【出力】
1行ずつ処理を行ない、その答えを1行ごと標準出力に出力します。


【入出力サンプル】
Input
95422357545868773174
24566191298259441958
34757881545564825469
86423251489513547814

Output
9257583174
26619259441958
75818269
8642511314

---------------------------- */

import java.util.Scanner ; /**  Scannerオブジェクト  **/
import java.util.LinkedList ; /* LinkedListオブジェクト */
import java.util.* ; /** printf()オブジェクト **/

class kadai5 {
  public static void main(String[] args) {

    int N_error = 0 ; //入力桁数チェック用
    ArrayList<String> numStr = new ArrayList<String>() ; //可変長Int型リスト宣言
    char[] char_inp_num = new char[20] ; //String --> char[]変換用
    int[] int_inp_num = new int[20] ; //cahr[] --> int[]変換用
    LinkedList<Integer> listNum = new LinkedList<Integer>(); //iny[] --> LinkedList<int>変換用
    LinkedList<Integer> shinobu  = new LinkedList<Integer>() ; //結果出力用


    /* 開始処理(object化したい) */
    System.out.println("20ケタ数字を入力していってね!!");

    /* -- Scaccerオブジェクトの作成 -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* -- 上限数エラーオブジェクトの作成 -- */
    chkNumError kawaii = new chkNumError() ;

    /* -- エラー表示オブジェクトの作成 -- */
    errorDisplay ed = new errorDisplay() ;

    /* -- 文字列操作オブジェクト作成 -- */
    chkStrError serval = new chkStrError() ;

    /* 出力オブジェクト作成 */
    output gotiusa = new output() ;


    /* 入力文字列の格納処理 */
    for( int i = 0 ; ; i++ ){
      numStr.add(scan1.next()) ;
      N_error = kawaii.checkInputNum2( numStr.get(i).length(), 20 ) ; // int, int --> int

      // 入力終了処理
      if( numStr.get(i).equals("闇に飲まれよ") ) {
        System.out.println("入力処理を終了するよ!");
        break ;
      }

      //入力ケタ数エラー処理
      if( N_error == 0 ) {
        ed.display("キミは入力桁数をエラーしちゃうフレンズなんだね!!") ;
      }
    }


    /* 一行ずつの文字列分析処理 */
    for( int j = 0 ; j < (numStr.size() - 1) ; j ++) { //以降一行ずつの文字分解処理
      char_inp_num = serval.changeCharArrey(numStr.get(j)) ; // str --> char[]
      int_inp_num = serval.changeIntChar(char_inp_num, 20) ; //char[] --> int[]
      listNum = serval.chIntLinkedList(int_inp_num) ; //int[] --> LinkedList<int>

      //出力処理
      shinobu = serval.analyzeKadai5(listNum) ;
      gotiusa.output_5(shinobu) ;

    }

     /* 終了処理(object化したい) */
    System.out.println("すごーーい！!" ) ;
  }
}
