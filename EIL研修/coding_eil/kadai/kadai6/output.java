/* ---
���ʏo�̓N���X
--- */

import java.util.Scanner ; /**  Scanner�I�u�W�F�N�g  **/
import java.util.* ; /** printf()�I�u�W�F�N�g **/
import java.util.LinkedList ; /* LinkedList�I�u�W�F�N�g */

class output {

  //kadai6���̓��\�b�h
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

    System.out.printf("%d����\n", count) ;
    return count ;
  }

}
