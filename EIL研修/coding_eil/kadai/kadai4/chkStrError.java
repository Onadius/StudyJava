/* --- 文字列チェッククラス --- */

class chkStrError {

  
  //文字列 --> 文字配列メソッド
  char[] changeCharArrey(String sagiri) {

    char[] aniki = sagiri.toCharArray() ;
    return aniki ;
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

}
