/*
【問題】
改行区切りの文字列の各行は、半角数字のみの整数（最大桁数32）になっています。
この各行の先頭に任意の数の半角のアンダーバー（_）を挿入して、右揃えになるように加工して下さい。
ただし、最も桁数が多い数値の先頭には、半角のアンダーバーを挿入しないものとします。


以下の点注意。
・入力は５行行う。
・入力値に対して下記チェックを行い、エラー時はメッセージと共に処理中断
　　半角数字チェック
　　桁数チェック(32桁)

// 入力サンプル
1
23
45678
9
10

　↓

// 出力サンプル
____1
___23
45678
____9
___10


*/

/**  Scannerオブジェクト  **/
import java.util.Scanner ;
import java.util.* ;

class kadai1 {
  public static void main(String[] args) {

    int h_error = 0 ; //半角英数字エラー用
    int o_error = 0 ; //出力エラー用
    int sachiko = 0 ; //桁数チェック用 & 最大桁数字列取得
    String[] strs = new String[5] ; //入力用


    /* -- 入力オブジェクト作成 -- */
    System.out.println("数字を入力して!!");
    Scanner scan = new Scanner(System.in) ;
    scan.useDelimiter("\n");

    /* -- エラー表示オブジェクトの作成 -- */
    errorDisplay ed = new errorDisplay() ;

    /* 桁エラーオブジェクトの作成 */
    chkKetaError kawaii = new chkKetaError() ;

    /* 半角エラーオブジェクトの作成 */
    chkHankakuError kawaii2 = new chkHankakuError() ;


    for(int i = 0 ; i < 5 ; i++ ){ //入力文字列の格納
      strs[i] = scan.next();
    }

    sachiko = kawaii.checkKString(strs) ; // str[] --> int

    if( sachiko == 0 ) { //桁エラー処理
      ed.display("桁数エラーですよプロデューサーさん!!") ;
    }

    h_error = kawaii2.checkHString(strs) ; // --> int

    if( h_error == 0 ) { //全角エラー処理
      ed.display("全角エラーですよプロデューサーさん!!") ;
    }


    /* 出力オブジェクトの作成 */
    output kawaii3 = new output() ;
    o_error = kawaii3.output_1(sachiko, strs) ;
    if( h_error == 0 ) { //全角エラー処理
      ed.display("出力エラーですよプロデューサーさん!!") ;
    }

    System.out.println("すごーーい！!\n") ;
  }
}




/* ---------------------------------------------------------------------------
以下のクラス問3以降から外部ファイル化
--------------------------------------------------------------------------- */

/* -- error表示&強制終了クラス -- */
class errorDisplay {

  void display(String error) {
    System.out.println(error) ;
    System.exit(0) ;
  }

}


/* --- 桁数チェッククラス --- */
class chkKetaError {

  int maxnum = 0 ; //初期化

  //桁数チェックメソッド
  int checkKString(String... num) {

    for( int i = 0 ; i < num.length ; i++ ) {

      //error処理
      if( num[i].length() > 32 ) {
        return 0 ;
      }

      //最大サイズの選定処理
      if( num[i].length() > maxnum ) {
        maxnum = num[i].length() ;
      }
    }
    return maxnum ;
  }
}



/* --- 半角チェッククラス --- */
class chkHankakuError {
  boolean status = true ;

  //全角チェックメソッド
  int checkHString(String... num) {

    for( int i = 0 ; i < num.length ; i++ ) {
      char[] moji = num[i].toCharArray() ;
      int[] nagato = new int[moji.length] ;

      for( int j = 0 ; j < moji.length; j++) {
        //error処理(対象文字列1文字ずつのバイト数を確認)
        if( String.valueOf(moji[j]).getBytes().length > 1 ) {
          System.out.print("全角だよ\n") ;
          return 0 ;
        }

        if( status != Character.isDigit(moji[j])) {
          System.out.print("数字じゃないよ\n") ;
          return 0 ;
        }
      }
    }
    return 1 ;
  }
}


/* --- 結果出力クラス  --- */
class output {

  //_右揃え出力メソッド
  int output_1(int maxSize, String... num) {

    int keta = maxSize ;
    int minus = 0 ;


    System.out.println(" --- 出力結果 --- ") ;

    try{
      for(int i = 0 ; i < num.length ; i++) {
        String under = "_" ;
        minus = keta - num[i].length() ;

        if( num[i].length() == keta ) {
          System.out.println(num[i]) ;
          continue ;
        }

        //結合分_文字列の作成
        for(int j = 0 ; j < minus - 1 ; j ++) {
          under += "_" ;
        }

        String zyougasaki = under.concat(num[i]) ;
        System.out.printf("%s\n", zyougasaki) ;
      }
    }
    catch (IllegalFormatException e) {
      System.out.println("文字列の扱い間違えちゃってるよふえぇ…");
      return 0 ;
    }
    return 1 ;
  }
}
