/* ---

���`�F�b�N�N���X

--- */
import java.util.Scanner ; /**  Scanner�I�u�W�F�N�g  **/

class chkNumError {

  String maxnum = new String() ; //������

  //�����`�F�b�N���\�b�h
  String checkKString(String... num) {

    for( int i = 0 ; i < num.length ; i++ ) {

      //error����
      if( num[i].length() > 32 ) {
        return "�����Ȃ�" ;
      }

      //�ő�T�C�Y�̑I�菈��
      if( num[i].length() > maxnum.length() ) {
        maxnum = num[i] ;
      }
    }
    return maxnum ;
  }


  //���͐��̏���`�F�b�N���\�b�h_kadai3
  int checkInputNum(int check, int num) {

    if(check > num) {
      return 0 ;
    }
    return 1 ;
  }


  //���͐��̏���`�F�b�N���\�b�h_kadai3
  int checkInputNum2(int check, int num) {

    if( check != num ) {
      return 0 ;
    }
    return 1 ;
  }

}
