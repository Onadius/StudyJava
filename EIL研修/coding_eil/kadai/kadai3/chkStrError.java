/* --- 文字列チェッククラス --- */

class chkStrError {

  //文字列 --> 文字配列メソッド
  char[] changeCharArrey(String sagiri) {

    char[] aniki = sagiri.toCharArray() ;
    return aniki ;
  }


  //文字配列 --> int配列メソッド
  int [] changeIntCahr(char[] haruhi) {

    int[] nagato = new int[4] ;
    for(int i = 0 ; i < haruhi.length ; i++ ){
      nagato[i] = Character.getNumericValue(haruhi[i]) ;
    }

    return nagato ;
  }



  //文字列分解メソッド
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
