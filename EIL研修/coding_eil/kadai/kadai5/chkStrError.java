/* --- 文字列チェッククラス --- */
import java.util.LinkedList ; /* LinkedListオブジェクト */

class chkStrError {

  /* -- エラー表示オブジェクトの作成 -- */
  errorDisplay minamike = new errorDisplay() ;


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

  //int[] --> LinkedListメソッド
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
