/* ----------------------------
【問題】
2つの整数値N, Mが与えられます。
0からNまでの各整数（10進数）について、2進表記したときに1の数がM個になるものを数えてください。
たとえば、9を2進表記すると1001ですので、1の数は2ということになります。


【入力】
標準入力から、半角スペースで区切られた2つの整数値N（0≦N≦100000）、M（0≦M≦17）が与えられます。


【出力】
0からNまでの整数の中で、2進表記したときに1の数がM個あるものの個数を出力してください。


【入出力サンプル】
Input

10 2


Output

5

残作業
エラー処理
開始及び終了処理のクラス化

---------------------------- */

import java.util.Scanner ; /**  Scannerオブジェクト  **/
import java.util.* ; /** printf()オブジェクト **/

class kadai4 {
  public static void main(String[] args) {

    int N_num = 0 ;
    int M_num = 0 ;
    int sum = 0 ;
    int N_error = 0 ; //入力上限数エラー用
    int M_error = 0 ; //実引数akエラー用
    int count_1 = 0 ; //出力確認用


    /* 開始処理(object化したい) */
    System.out.println("半角スペースで区切られた2つの整数値を入力してね!!");

    /* -- Scaccerオブジェクトの作成 -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* -- 上限数エラーオブジェクトの作成 -- */
    chkNumError kawaii = new chkNumError() ;

    /* -- エラー表示オブジェクトの作成 -- */
    errorDisplay ed = new errorDisplay() ;

    /* -- 入力文字列の格納処理 -- */
    N_num = scan1.nextInt() ;
    N_error = kawaii.checkInputNum( N_num, 10001 ) ;
    if( N_error == 0 ) { //入力ケタ数エラー処理
      ed.display("キミはNの上限数をエラーしちゃうフレンズなんだね!!") ;
    }

    M_num = scan1.nextInt() ;
    M_error = kawaii.checkInputNum( M_num, 18 ) ;
    if( M_error == 0 ) { //入力ケタ数エラー処理
      ed.display("キミはMの上限数をエラーしちゃうフレンズなんだね!!") ;
    }

    /* -- 各配列格納オブジェクト作成 -- */
    setNum suzumiya = new setNum() ;
    int[] kyon = suzumiya.setNumArray(N_num) ; //int --> int[]
    String[] strBinary = suzumiya.setBinaryArray(kyon) ; //int[] --> String[]

    /* 文字列操作オブジェクト作成 */
    chkStrError serval = new chkStrError() ;

    // 出力処理
    for( int i = 0 ; i < strBinary.length ; i ++) { //以降一行ずつの文字分解処理
      char[] mikuru = serval.changeCharArrey(strBinary[i]) ; // str --> char[]

      // -- 出力処理選別 --
      count_1 = serval.analyzeKadai4(mikuru) ; //char[] --> int
      if( count_1 == M_num ) {
        sum += 1 ;
      }
      else if( count_1 == -1 ){
        ed.display("食べないで～!!\n") ;
      }
    }

     /* 終了処理(object化したい) */
    System.out.println( sum + "\nすごーーい！!" ) ;
  }
}
