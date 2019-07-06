/* --- 文字列チェッククラス --- */
import java.util.LinkedList ; /* LinkedListオブジェクト */

class chkStrError {

  /* -- エラー表示オブジェクトの作成 -- */
  errorDisplay minamike = new errorDisplay() ;

  //全角チェックメソッド
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
          System.out.print((i + 1) + "個目の起動引数中、" + moji[j] + " が数字じゃないよ\n") ;
          return 0 ;
        }
      }
    }
    return 1 ;
  }
}


  //文字列 --> 文字配列メソッド
  char[] changeCharArrey(String sagiri) {

    char[] aniki = sagiri.toCharArray() ;
    return aniki ;
  }


  //文字配列 --> int配列メソッド
  int [] changeIntChar(char[] haruhi, int size) {

    int[] nagato = new int[size] ;
    for(int i = 0 ; i < haruhi.length ; i++ ){
      nagato[i] = Character.getNumericValue(haruhi[i]) ;
    }

    return nagato ;
  }


  // 文字配列 --> 一文字ずつLinkedList
  LinkedList<Character> changeLinkedList(char[] suruga) {
    LinkedList<Character> araragi = new LinkedList<Character>() ;

    try {
      for(int k = 0 ; k < suruga.length ; k++) {
        araragi.add(suruga[k]) ;
      }
    }
    catch (Exception e) {
      e.printStackTrace() ;
      minamike.display("お兄ちゃんのラノベ主人公!!(LinkedList操作エラー)") ;
    }

    return araragi ;
  }

  //文字列 --> int変換メソッド
  int changeStrInt(String obj) {
    int num = Integer.parseInt(obj) ;
    return num ;
  }


  LinkedList<Integer> chIntLinkedList(int[] nadeko) {
    LinkedList<Integer> araragi = new LinkedList<Integer>() ;

    try {
      for(int k = 0 ; k < nadeko.length ; k++) {
        araragi.add(nadeko[k]) ;
      }
    }
    catch (Exception e) {
      e.printStackTrace() ;
      minamike.display("お兄ちゃんのラノベ主人公!!(LinkedList操作エラー)") ;
    }

    return araragi ;
  }


  //文字配列分解メソッド_kadai3
  int analyzeStr(char nyaa[]) {

    try {
      for( int j = 0 ; j < nyaa.length ; j++) {

        if( nyaa[j] == '0' ) {
          return 2 ;
        }

      }
    }
    catch (Exception e) {
      e.printStackTrace() ;
      return 0 ;
    }

    return 1 ;
  }


  //kadai4_二進数1の文字数カウントメソッド
  int analyzeKadai4(char flends[]) {
    int kabann = 0 ;

    try {
      for( int j = 0 ; j < flends.length ; j++) {

        if( flends[j] == '1' ) {

          kabann += 1 ;
        }
      }
    }
    catch (Exception e) {

      e.printStackTrace() ;
      return -1 ;
    }
    return kabann ;
  }


  // List内要素整形メソッド_kadai5
  LinkedList<Integer> analyzeKadai5(LinkedList<Integer> mayoi) {
    boolean status = true ; //ループ処理ステータス

    while(status) {
      status = false ;

      for(int i = 0 ; i < ( mayoi.size() - 1 ) ; i++ ){

        //隣り合う二つの数字差の絶対値1のとき、要素の削除
        if( Math.abs( mayoi.get(i) - mayoi.get(i + 1) ) == 1 ) {
          if( i != (mayoi.size() - 2) ){
            mayoi.remove(i) ;
            mayoi.remove(i + 1) ;

            status = true ;
            break ;

          }
          mayoi.remove(i) ;
          mayoi.removeLast() ;
          status = false ;
          break ;
        }
      }
    }
    return mayoi ;
  }


}
