/* --- ������`�F�b�N�N���X --- */
import java.util.LinkedList ; /* LinkedList�I�u�W�F�N�g */

class chkStrError {

  /* -- �G���[�\���I�u�W�F�N�g�̍쐬 -- */
  errorDisplay minamike = new errorDisplay() ;


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

  //int[] --> LinkedList���\�b�h
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
