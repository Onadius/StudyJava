/* ----------------------------
�y���z
�u0123456789�v��10���̃J�[�h�̓��A4���̃J�[�h���񎦂���܂��B
�ʏ�́A�u�ł����l���傫�ȃJ�[�h�v�������҂̃J�[�h�ł��B
4���̒���0������΁A�u0�ȊO�ōł������ȃJ�[�h�v�������҂̃J�[�h�ł��B
�����҂̃J�[�h�̐��l������o���Ă��������B


�y���́z
�W�����͂���A�����s�̃f�[�^���^�����܂��B1�s�̃f�[�^���A1�Z�b�g�̃Q�[���ɂȂ�܂��B
1�s�̃f�[�^�́A����4�����̕�����ɂȂ�܂��B����1���������A1���̃J�[�h�ɂȂ�܂��B


�y�o�́z
1�s�����ʂ𔻒肵�āA���̓����ƂȂ鐔�����A1�s���ƕW���o�͂ɏo�͂��܂��B


�y���o�̓T���v���z
Input
1234
6745
0149
3705

Output
4
7
1
3
---------------------------- */

import java.util.Scanner ; /**  Scanner�I�u�W�F�N�g  **/
import java.util.* ; /** printf()�I�u�W�F�N�g **/

class kadai3 {
  public static void main(String[] args) {

    int N_error = 0 ; //���͏�����G���[�p
    int ak_error = 0 ; //������ak�G���[�p
    int o_select = 0 ; //�o�͊m�F�p
    int o_error = 0 ; //�o�̓G���[�p
    ArrayList<String> numStr = new ArrayList<String>() ; //�ϒ�Int�^���X�g�錾
    char[] char_inp_num = new char[4] ; //String --> char[]�ϊ��p
    int[] int_inp_num = new int[4] ; //char[] --> int[]�ϊ��p


    /* �J�n����(object��������) */
    System.out.println("����4�P�^(4���̃J�[�h)����͂���!!(�I����9999����)");

    /* -- Scaccer�I�u�W�F�N�g�̍쐬 -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* -- ������G���[�I�u�W�F�N�g�̍쐬 -- */
    chkNumError kawaii = new chkNumError() ;

    /* ���͕�����̊i�[���� */
    for( int i = 0 ; ; i++ ){
      numStr.add(scan1.next()) ;
      N_error = kawaii.checkInputNum2( numStr.get(i).length(), 4 ) ; // int, int --> int

      if( N_error == 0 ) { //���̓P�^���G���[����
        System.out.print("�L�~�̓J�[�h�̏�������G���[�����Ⴄ�t�����Y�Ȃ񂾂�!!\n") ;
        System.exit(0) ;
      }

      /* ���͏I������ */
      if( numStr.get(i).equals("9999") ) {
        System.out.println("���͏������I�������!");
        break ;
      }
    }

    /* �����񈵂��I�u�W�F�N�g�쐬 */
    chkStrError serval = new chkStrError() ;

    /* �o�̓I�u�W�F�N�g�쐬 */
    output gotiusa = new output() ;

    for( int i = 0 ; i < (numStr.size() - 1) ; i ++) { //�ȍ~��s���̕�����������

      char_inp_num = serval.changeCharArrey(numStr.get(i)) ; // str --> char[]
      int_inp_num = serval.changeIntCahr(char_inp_num) ; //char[] --> int[]

      Arrays.sort(int_inp_num) ; //int[]�̏����\�[�g
      o_select = gotiusa.output_3ver2(int_inp_num) ; //int[] --> int
      if(o_select == 0) {
        System.out.print("�H�ׂȂ���I�I\n") ;
        System.exit(0) ;
      }

      /* -- �o�͏����I��
      o_select = serval.analyzeStr(char_inp_num) ; //string --> int
      switch (o_select) {

        case 1 : gotiusa.output_3(int_inp_num, o_select) ; break ;
        case 2 : gotiusa.output_3(int_inp_num, o_select) ; break ;
        case 0 :
          System.out.println("error���킠����������������!!!") ; System.exit(0) ;
      }
      -- */
    }

     /* �I������(object��������) */
    System.out.println("�����[�[���I!\n") ;
  }
}
