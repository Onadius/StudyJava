/* ---

数チェッククラス

--- */

class chkNumError {

  String maxnum = new String() ; //初期化

  //入力数の上限チェックメソッド_kadai3
  int checkInputNum2(int check, int num) {

    if( check != num ) {
      return 0 ;
    }
    return 1 ;
  }

}
