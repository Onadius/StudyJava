/* ---
���ʏo�̓N���X
--- */

import java.util.Scanner ; /**  Scanner�I�u�W�F�N�g  **/
import java.util.* ; /** printf()�I�u�W�F�N�g **/
import java.util.LinkedList ; /* LinkedList�I�u�W�F�N�g */

class output {

  //kadai5_out���\�b�h
  void output_5(LinkedList<Integer> oikura) {

    int size = oikura.size() ;
    for(int i = 0 ; i < size ; i++ ){
      System.out.print(oikura.get(i)) ;
    }
    System.out.print("\n") ;
  }

}
