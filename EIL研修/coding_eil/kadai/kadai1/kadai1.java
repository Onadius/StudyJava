/*
�y���z
���s��؂�̕�����̊e�s�́A���p�����݂̂̐����i�ő包��32�j�ɂȂ��Ă��܂��B
���̊e�s�̐擪�ɔC�ӂ̐��̔��p�̃A���_�[�o�[�i_�j��}�����āA�E�����ɂȂ�悤�ɉ��H���ĉ������B
�������A�ł��������������l�̐擪�ɂ́A���p�̃A���_�[�o�[��}�����Ȃ����̂Ƃ��܂��B


�ȉ��̓_���ӁB
�E���͂͂T�s�s���B
�E���͒l�ɑ΂��ĉ��L�`�F�b�N���s���A�G���[���̓��b�Z�[�W�Ƌ��ɏ������f
�@�@���p�����`�F�b�N
�@�@�����`�F�b�N(32��)

// ���̓T���v��
1
23
45678
9
10

�@��

// �o�̓T���v��
____1
___23
45678
____9
___10


*/

/**  Scanner�I�u�W�F�N�g  **/
import java.util.Scanner ;
import java.util.* ;

class kadai1 {
  public static void main(String[] args) {

    int h_error = 0 ; //���p�p�����G���[�p
    int o_error = 0 ; //�o�̓G���[�p
    int sachiko = 0 ; //�����`�F�b�N�p & �ő包������擾
    String[] strs = new String[5] ; //���͗p


    /* -- ���̓I�u�W�F�N�g�쐬 -- */
    System.out.println("��������͂���!!");
    Scanner scan = new Scanner(System.in) ;
    scan.useDelimiter("\n");

    /* -- �G���[�\���I�u�W�F�N�g�̍쐬 -- */
    errorDisplay ed = new errorDisplay() ;

    /* ���G���[�I�u�W�F�N�g�̍쐬 */
    chkKetaError kawaii = new chkKetaError() ;

    /* ���p�G���[�I�u�W�F�N�g�̍쐬 */
    chkHankakuError kawaii2 = new chkHankakuError() ;


    for(int i = 0 ; i < 5 ; i++ ){ //���͕�����̊i�[
      strs[i] = scan.next();
    }

    sachiko = kawaii.checkKString(strs) ; // str[] --> int

    if( sachiko == 0 ) { //���G���[����
      ed.display("�����G���[�ł���v���f���[�T�[����!!") ;
    }

    h_error = kawaii2.checkHString(strs) ; // --> int

    if( h_error == 0 ) { //�S�p�G���[����
      ed.display("�S�p�G���[�ł���v���f���[�T�[����!!") ;
    }


    /* �o�̓I�u�W�F�N�g�̍쐬 */
    output kawaii3 = new output() ;
    o_error = kawaii3.output_1(sachiko, strs) ;
    if( h_error == 0 ) { //�S�p�G���[����
      ed.display("�o�̓G���[�ł���v���f���[�T�[����!!") ;
    }

    System.out.println("�����[�[���I!\n") ;
  }
}




/* ---------------------------------------------------------------------------
�ȉ��̃N���X��3�ȍ~����O���t�@�C����
--------------------------------------------------------------------------- */

/* -- error�\��&�����I���N���X -- */
class errorDisplay {

  void display(String error) {
    System.out.println(error) ;
    System.exit(0) ;
  }

}


/* --- �����`�F�b�N�N���X --- */
class chkKetaError {

  int maxnum = 0 ; //������

  //�����`�F�b�N���\�b�h
  int checkKString(String... num) {

    for( int i = 0 ; i < num.length ; i++ ) {

      //error����
      if( num[i].length() > 32 ) {
        return 0 ;
      }

      //�ő�T�C�Y�̑I�菈��
      if( num[i].length() > maxnum ) {
        maxnum = num[i].length() ;
      }
    }
    return maxnum ;
  }
}



/* --- ���p�`�F�b�N�N���X --- */
class chkHankakuError {
  boolean status = true ;

  //�S�p�`�F�b�N���\�b�h
  int checkHString(String... num) {

    for( int i = 0 ; i < num.length ; i++ ) {
      char[] moji = num[i].toCharArray() ;
      int[] nagato = new int[moji.length] ;

      for( int j = 0 ; j < moji.length; j++) {
        //error����(�Ώە�����1�������̃o�C�g�����m�F)
        if( String.valueOf(moji[j]).getBytes().length > 1 ) {
          System.out.print("�S�p����\n") ;
          return 0 ;
        }

        if( status != Character.isDigit(moji[j])) {
          System.out.print("��������Ȃ���\n") ;
          return 0 ;
        }
      }
    }
    return 1 ;
  }
}


/* --- ���ʏo�̓N���X  --- */
class output {

  //_�E�����o�̓��\�b�h
  int output_1(int maxSize, String... num) {

    int keta = maxSize ;
    int minus = 0 ;


    System.out.println(" --- �o�͌��� --- ") ;

    try{
      for(int i = 0 ; i < num.length ; i++) {
        String under = "_" ;
        minus = keta - num[i].length() ;

        if( num[i].length() == keta ) {
          System.out.println(num[i]) ;
          continue ;
        }

        //������_������̍쐬
        for(int j = 0 ; j < minus - 1 ; j ++) {
          under += "_" ;
        }

        String zyougasaki = under.concat(num[i]) ;
        System.out.printf("%s\n", zyougasaki) ;
      }
    }
    catch (IllegalFormatException e) {
      System.out.println("������̈����ԈႦ������Ă��ӂ����c");
      return 0 ;
    }
    return 1 ;
  }
}
