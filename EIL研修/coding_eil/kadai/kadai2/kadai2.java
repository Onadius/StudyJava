/* ----------------------------
�y���z
�������̐����l���^�����܂��B
�����̒��ŁA�a�����傤��256�ɂȂ�悤��2�������݂��邩�ǂ����𒲂ׂĂ��������B


�y���́z
�W�����͂���A�����l���^�����܂��B
1�s�ڂ͐����lN�i2��N��100�j�A2�s�ڂ�N�̐����lAk�i0��Ak��256�j��
���p�X�y�[�X�ŋ�؂��Ă��܂��B


�y�o�́z
�a��256�ɂȂ�2�������݂���ꍇ��"yes"�A���݂��Ȃ��ꍇ��"no"�ƁA
�W���o�͂ɏo�͂��Ă��������B


�y���o�̓T���v���z
Input

4
32 64 128 192


Output

yes
---------------------------- */


import java.util.Scanner ; /**  Scanner�I�u�W�F�N�g  **/
import java.util.* ; /** printf()�I�u�W�F�N�g **/


class kadai2 {
  public static void main(String[] args) {

    int N_error = 0 ; //���͏�����G���[�p
    int ak_error = 0 ; //������ak�G���[�p
    int o_error = 0 ; //�o�̓G���[�p
    ArrayList<Integer> num_ak = new ArrayList<Integer>() ; //�ϒ�Int�^���X�g�錾

    /* -- �G���[�\���I�u�W�F�N�g�̍쐬 -- */
    errorDisplay ed = new errorDisplay() ;

    /* -- ���̓I�u�W�F�N�g�쐬 -- */
    System.out.println("��������͂���!!");
    Scanner scan1 = new Scanner(System.in) ;
    int num_N = scan1.nextInt();

    /* �G���[���̓I�u�W�F�N�g�̍쐬 */
    chkNumError kawaii = new chkNumError() ;

    /* �o�̓I�u�W�F�N�g�̍쐬 */
    output kawaii2 = new output() ;


    N_error = kawaii.checkInputNum(num_N, 100) ; // int, int --> int
    if( N_error == 0 ) { //���͐��G���[����
      ed.display("�L�~�͏�������G���[�����Ⴄ�t�����Y�Ȃ񂾂�!!") ;
    }

    /* ���ӊ��N */
    System.out.printf("���p�X�y�[�X�ň������͂�%d�܂ł���!!\n", num_N) ;

    /* -- �������i�[���� -- */
    for(int i = 0 ; i < num_N ; i++ ){ //���͕�����̊i�[
      num_ak.add(scan1.nextInt()) ;
    }

    o_error = kawaii2.output_2(num_ak) ; //ArrayList<Integer> --> int
    if( o_error == 2 ) {
      ed.display("�o�̓G���[����!!\n") ;
    }

    /* �I���o�� */
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



/* --- ���`�F�b�N�N���X --- */
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

  //�S�pand�����`�F�b�N���\�b�h string --> int
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
          System.out.print("��������Ȃ���\n") ;
          return 0 ;
        }
      }
    }
    return 1 ;
  }
}


  //���͐��̏���`�F�b�N���\�b�h_kadai2
  int checkInputNum(int check, int num) {

    if(check > num) {
      return 0 ;
    }
    return 1 ;
  }


}


/* --- ���ʏo�̓N���X  --- */
class output {

  //_�E�����o�̓��\�b�h
  int output_1(String maxSize_num, String... num) {

    int keta = maxSize_num.length() ;
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


  //�o�̓��\�b�h_kadai2
  int output_2(ArrayList<Integer> miku) {

    try{
      for( int i = 0 ; i < miku.size() ; i++ ) {
        for(int j = i + 1 ; j < miku.size() ; j++ ) {

          if( ( miku.get(i).intValue() + miku.get(j).intValue() ) == 256 ) {

            System.out.println("Yes����!") ;
            return 1 ;
          }
        }
      }
      System.out.println("No����!") ;
      return 1 ;
    }
    catch( Exception e ) {

      e.printStackTrace() ;
      return 2 ;
    }
  }

}
