/* ---

数チェッククラス

--- */

class chkNumError {


  //入力数の上限チェックメソッド_kadai3
  int checkInputNum(int check, int num) {

    if(check > num) {
      return 0 ;
    }
    return 1 ;
  }

}
