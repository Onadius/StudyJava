/* ---

数チェッククラス

--- */
import java.util.Scanner ; /**  Scannerオブジェクト  **/

class chkNumError {

  String maxnum = new String() ; //初期化

  //桁数チェックメソッド
  String checkKString(String... num) {

    for( int i = 0 ; i < num.length ; i++ ) {

      //error処理
      if( num[i].length() > 32 ) {
        return "可愛くない" ;
      }

      //最大サイズの選定処理
      if( num[i].length() > maxnum.length() ) {
        maxnum = num[i] ;
      }
    }
    return maxnum ;
  }


  //入力数の上限チェックメソッド_kadai3
  int checkInputNum(int check, int num) {

    if(check > num) {
      return 0 ;
    }
    return 1 ;
  }


  //入力数の上限チェックメソッド_kadai3
  int checkInputNum2(int check, int num) {

    if( check != num ) {
      return 0 ;
    }
    return 1 ;
  }

}
