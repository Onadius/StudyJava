/* --- ������`�F�b�N�N���X --- */
import java.util.LinkedList ; /* LinkedList�I�u�W�F�N�g */

class chkStrError {

  /* -- �G���[�\���I�u�W�F�N�g�̍쐬 -- */
  errorDisplay minamike = new errorDisplay() ;

  //�S�p�`�F�b�N���\�b�h
  int checkHString(String... num) {

    for( int i = 0 ; i < num.length ; i++ ) {
      char[] moji = num[i].toCharArray() ;
      int[] nagato = new int[moji.length] ;

      for( int j = 0 ; j < moji.length; j++) {
        //error����(�Ώە�����1�������̃o�C�g�����m�F)
        if( String.valueOf(moji[j]).getBytes().length > 1 ) {
          System.out.print((i + 1) + "�ڂ̋N���������A" + moji[j] + " ���S�p����\n") ;
          return 0 ;
        }

        if( status != Character.isDigit(moji[j])) {
          System.out.print((i + 1) + "�ڂ̋N���������A" + moji[j] + " ����������Ȃ���\n") ;
          return 0 ;
        }
      }
    }
    return 1 ;
  }
}


  //������ --> �����z�񃁃\�b�h
  char[] changeCharArrey(String sagiri) {

    char[] aniki = sagiri.toCharArray() ;
    return aniki ;
  }


  //�����z�� --> int�z�񃁃\�b�h
  int [] changeIntChar(char[] haruhi, int size) {

    int[] nagato = new int[size] ;
    for(int i = 0 ; i < haruhi.length ; i++ ){
      nagato[i] = Character.getNumericValue(haruhi[i]) ;
    }

    return nagato ;
  }


  // �����z�� --> �ꕶ������LinkedList
  LinkedList<Character> changeLinkedList(char[] suruga) {
    LinkedList<Character> araragi = new LinkedList<Character>() ;

    try {
      for(int k = 0 ; k < suruga.length ; k++) {
        araragi.add(suruga[k]) ;
      }
    }
    catch (Exception e) {
      e.printStackTrace() ;
      minamike.display("���Z�����̃��m�x��l��!!(LinkedList����G���[)") ;
    }

    return araragi ;
  }

  //������ --> int�ϊ����\�b�h
  int changeStrInt(String obj) {
    int num = Integer.parseInt(obj) ;
    return num ;
  }


  LinkedList<Integer> chIntLinkedList(int[] nadeko) {
    LinkedList<Integer> araragi = new LinkedList<Integer>() ;

    try {
      for(int k = 0 ; k < nadeko.length ; k++) {
        araragi.add(nadeko[k]) ;
      }
    }
    catch (Exception e) {
      e.printStackTrace() ;
      minamike.display("���Z�����̃��m�x��l��!!(LinkedList����G���[)") ;
    }

    return araragi ;
  }


  //�����z�񕪉����\�b�h_kadai3
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


  // List���v�f���`���\�b�h_kadai5
  LinkedList<Integer> analyzeKadai5(LinkedList<Integer> mayoi) {
    boolean status = true ; //���[�v�����X�e�[�^�X

    while(status) {
      status = false ;

      for(int i = 0 ; i < ( mayoi.size() - 1 ) ; i++ ){

        //�ׂ荇����̐������̐�Βl1�̂Ƃ��A�v�f�̍폜
        if( Math.abs( mayoi.get(i) - mayoi.get(i + 1) ) == 1 ) {
          if( i != (mayoi.size() - 2) ){
            mayoi.remove(i) ;
            mayoi.remove(i + 1) ;

            status = true ;
            break ;

          }
          mayoi.remove(i) ;
          mayoi.removeLast() ;
          status = false ;
          break ;
        }
      }
    }
    return mayoi ;
  }


}
