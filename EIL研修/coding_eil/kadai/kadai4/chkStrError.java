/* --- ������`�F�b�N�N���X --- */

class chkStrError {

  
  //������ --> �����z�񃁃\�b�h
  char[] changeCharArrey(String sagiri) {

    char[] aniki = sagiri.toCharArray() ;
    return aniki ;
  }


  //kadai4_��i��1�̕������J�E���g���\�b�h
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

}
