/* --- ������`�F�b�N�N���X --- */

class chkStrError {

  //������ --> �����z�񃁃\�b�h
  char[] changeCharArrey(String sagiri) {

    char[] aniki = sagiri.toCharArray() ;
    return aniki ;
  }


  //�����z�� --> int�z�񃁃\�b�h
  int [] changeIntCahr(char[] haruhi) {

    int[] nagato = new int[4] ;
    for(int i = 0 ; i < haruhi.length ; i++ ){
      nagato[i] = Character.getNumericValue(haruhi[i]) ;
    }

    return nagato ;
  }



  //�����񕪉����\�b�h
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

}
