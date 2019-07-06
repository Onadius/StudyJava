/* ---
結果出力クラス
--- */

import java.util.Scanner ; /**  Scannerオブジェクト  **/
import java.util.* ; /** printf()オブジェクト **/
import java.util.LinkedList ; /* LinkedListオブジェクト */

class output {

  //kadai5_outメソッド
  void output_5(LinkedList<Integer> oikura) {

    int size = oikura.size() ;
    for(int i = 0 ; i < size ; i++ ){
      System.out.print(oikura.get(i)) ;
    }
    System.out.print("\n") ;
  }

}
