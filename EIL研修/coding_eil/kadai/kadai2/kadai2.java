/* ----------------------------
【問題】
いくつかの整数値が与えられます。
それらの中で、和がちょうど256になるような2数が存在するかどうかを調べてください。


【入力】
標準入力から、整数値が与えられます。
1行目は整数値N（2≦N≦100）、2行目はN個の整数値Ak（0≦Ak≦256）が
半角スペースで区切られています。


【出力】
和が256になる2数が存在する場合は"yes"、存在しない場合は"no"と、
標準出力に出力してください。


【入出力サンプル】
Input

4
32 64 128 192


Output

yes
---------------------------- */


import java.util.Scanner ; /**  Scannerオブジェクト  **/
import java.util.* ; /** printf()オブジェクト **/


class kadai2 {
  public static void main(String[] args) {

    int N_error = 0 ; //入力上限数エラー用
    int ak_error = 0 ; //実引数akエラー用
    int o_error = 0 ; //出力エラー用
    ArrayList<Integer> num_ak = new ArrayList<Integer>() ; //可変長Int型リスト宣言

    /* -- エラー表示オブジェクトの作成 -- */
    errorDisplay ed = new errorDisplay() ;

    /* -- 入力オブジェクト作成 -- */
    System.out.println("数字を入力して!!");
    Scanner scan1 = new Scanner(System.in) ;
    int num_N = scan1.nextInt();

    /* エラー分析オブジェクトの作成 */
    chkNumError kawaii = new chkNumError() ;

    /* 出力オブジェクトの作成 */
    output kawaii2 = new output() ;


    N_error = kawaii.checkInputNum(num_N, 100) ; // int, int --> int
    if( N_error == 0 ) { //入力数エラー処理
      ed.display("キミは上限数をエラーしちゃうフレンズなんだね!!") ;
    }

    /* 注意喚起 */
    System.out.printf("半角スペースで引数入力は%dつまでだよ!!\n", num_N) ;

    /* -- 第二引数格納処理 -- */
    for(int i = 0 ; i < num_N ; i++ ){ //入力文字列の格納
      num_ak.add(scan1.nextInt()) ;
    }

    o_error = kawaii2.output_2(num_ak) ; //ArrayList<Integer> --> int
    if( o_error == 2 ) {
      ed.display("出力エラーだね!!\n") ;
    }

    /* 終了出力 */
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



/* --- 数チェッククラス --- */
class chkNumError {

  String maxnum = new String() ; //初期化

  //桁数チェックメソッド
  String checkKString(String... num) {

    for( int i = 0 ; i < num.length ; i++ ) {

      //error処理
      if( num[i].length() > 32 ) {
        return "可愛くない" ;
      }

      //最大サイズの選定処理
      if( num[i].length() > maxnum.length() ) {
        maxnum = num[i] ;
      }
    }
    return maxnum ;
  }

  //全角and数字チェックメソッド string --> int
  int checkHString(String... num) {

    for( int i = 0 ; i < num.length ; i++ ) {
      char[] moji = num[i].toCharArray() ;
      int[] nagato = new int[moji.length] ;

      for( int j = 0 ; j < moji.length; j++) {
        //error処理(対象文字列1文字ずつのバイト数を確認)
        if( String.valueOf(moji[j]).getBytes().length > 1 ) {
          System.out.print((i + 1) + "個目の起動引数中、" + moji[j] + " が全角だよ\n") ;
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


  //入力数の上限チェックメソッド_kadai2
  int checkInputNum(int check, int num) {

    if(check > num) {
      return 0 ;
    }
    return 1 ;
  }


}


/* --- 結果出力クラス  --- */
class output {

  //_右揃え出力メソッド
  int output_1(String maxSize_num, String... num) {

    int keta = maxSize_num.length() ;
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


  //出力メソッド_kadai2
  int output_2(ArrayList<Integer> miku) {

    try{
      for( int i = 0 ; i < miku.size() ; i++ ) {
        for(int j = i + 1 ; j < miku.size() ; j++ ) {

          if( ( miku.get(i).intValue() + miku.get(j).intValue() ) == 256 ) {

            System.out.println("Yesだよ!") ;
            return 1 ;
          }
        }
      }
      System.out.println("Noだよ!") ;
      return 1 ;
    }
    catch( Exception e ) {

      e.printStackTrace() ;
      return 2 ;
    }
  }

}
