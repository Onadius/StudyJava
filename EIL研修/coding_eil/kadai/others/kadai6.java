/* ----------------------------
1から1,000,000までの整数の範囲で、連続する2値を合計します。
2値の合計が、整数Nの倍数になる組み合わせを、数えてください。
ただし、整数Nは、2≦N≦1,000 の範囲とします。

例
整数Nが11の場合、「5, 6（合計は11）」、「16,17（合計は33）」……という組み合わせが、整数Nの倍数になります。
また、連続する2値の最小は「1, 2（合計は3）」、最大は、「999999, 1000000（合計は1999999）」になります。


【入力】
標準入力から、複数行のデータが与えられます。1行のデータが、1つの整数Nになります。


【出力】
1行ずつ処理を行ない、その答えを1行ごと標準出力に出力します。


【入出力サンプル】
Input
307
456
545
165

Output
3257
0
1835
6061

---------------------------- */

import java.util.Scanner ; /**  Scannerオブジェクト  **/
import java.util.LinkedList ; /* LinkedListオブジェクト */
import java.util.* ; /** printf()オブジェクト **/

class kadai6 {
  public static void main(String[] args) {

    int N_error = 0 ; //入力範囲チェック用
    int O_num = 0 ; //出力用変数
    ArrayList<Integer> numInt = new ArrayList<Integer>() ; //可変長Int型リスト宣言


    /* 開始処理(object化したい) */
    System.out.println("1000までの数字を入力していってね!!(0:入力終了)");

    /* -- Scaccerオブジェクトの作成 -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* -- 上限数エラーオブジェクトの作成 -- */
    chkNumError kawaii = new chkNumError() ;

    /* -- エラー表示オブジェクトの作成 -- */
    errorDisplay ed = new errorDisplay() ;

    /* 出力オブジェクト作成 */
    output gotiusa = new output() ;


    /* 入力文字列の格納処理 */
    for( int i = 0 ; ; i++ ){
      numInt.add(scan1.nextInt()) ;
      N_error = kawaii.checkInputNum( numInt.get(i).intValue(), 1000 ) ; // int, int --> int

      // 入力終了処理
      if( numInt.get(i).intValue() == 0 ) {
        System.out.println("入力処理を終了するよ!");
        break ;
      }

      //入力ケタ数エラー処理
      if( N_error == 0 ) {
        ed.display("キミは入力上限数をオーバーしちゃうフレンズなんだね!!") ;
      }
    }


    /* 出力処理 */
    for( int j = 0 ; j < numInt.size() - 1 ; j++ ) {
      O_num = gotiusa.analyzeKadai6(numInt.get(j).intValue()) ;
      if ( O_num < 0 ) {
        ed.display("みゃみゃみゃみゃみゃ!!!") ;
      }
    }

     /* 終了処理(object化したい) */
    System.out.println("すごーーい！!" ) ;
  }
}
