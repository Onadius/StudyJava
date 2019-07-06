/* ---
結果出力クラス
--- */

import java.util.Scanner ; /**  Scannerオブジェクト  **/
import java.util.* ; /** printf()オブジェクト **/
import java.util.LinkedList ; /* LinkedListオブジェクト */

class output {

  //kadai6分析メソッド
  int analyzeKadai6(int tino) {
    int count = 0 ;

    try {
      for(int i = 1 ; i < 1000000 ; i++ ) {
        if( (i + (i + 1)) % tino == 0 ) {
          count += 1 ;
          continue ;
        }
      }
    }
    catch( Exception e ) {
      e.printStackTrace() ;
      return -1 ;
    }

    System.out.printf("%dだよ\n", count) ;
    return count ;
  }

}
