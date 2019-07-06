/* ----------------------------
�y���z
2�̐����lN, M���^�����܂��B
0����N�܂ł̊e�����i10�i���j�ɂ��āA2�i�\�L�����Ƃ���1�̐���M�ɂȂ���̂𐔂��Ă��������B
���Ƃ��΁A9��2�i�\�L�����1001�ł��̂ŁA1�̐���2�Ƃ������ƂɂȂ�܂��B


�y���́z
�W�����͂���A���p�X�y�[�X�ŋ�؂�ꂽ2�̐����lN�i0��N��100000�j�AM�i0��M��17�j���^�����܂��B


�y�o�́z
0����N�܂ł̐����̒��ŁA2�i�\�L�����Ƃ���1�̐���M������̂̌����o�͂��Ă��������B


�y���o�̓T���v���z
Input

10 2


Output

5

�c���
�G���[����
�J�n�y�яI�������̃N���X��

---------------------------- */

import java.util.Scanner ; /**  Scanner�I�u�W�F�N�g  **/
import java.util.* ; /** printf()�I�u�W�F�N�g **/

class kadai4 {
  public static void main(String[] args) {

    int N_num = 0 ;
    int M_num = 0 ;
    int sum = 0 ;
    int N_error = 0 ; //���͏�����G���[�p
    int M_error = 0 ; //������ak�G���[�p
    int count_1 = 0 ; //�o�͊m�F�p


    /* �J�n����(object��������) */
    System.out.println("���p�X�y�[�X�ŋ�؂�ꂽ2�̐����l����͂��Ă�!!");

    /* -- Scaccer�I�u�W�F�N�g�̍쐬 -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* -- ������G���[�I�u�W�F�N�g�̍쐬 -- */
    chkNumError kawaii = new chkNumError() ;

    /* -- �G���[�\���I�u�W�F�N�g�̍쐬 -- */
    errorDisplay ed = new errorDisplay() ;

    /* -- ���͕�����̊i�[���� -- */
    N_num = scan1.nextInt() ;
    N_error = kawaii.checkInputNum( N_num, 10001 ) ;
    if( N_error == 0 ) { //���̓P�^���G���[����
      ed.display("�L�~��N�̏�������G���[�����Ⴄ�t�����Y�Ȃ񂾂�!!") ;
    }

    M_num = scan1.nextInt() ;
    M_error = kawaii.checkInputNum( M_num, 18 ) ;
    if( M_error == 0 ) { //���̓P�^���G���[����
      ed.display("�L�~��M�̏�������G���[�����Ⴄ�t�����Y�Ȃ񂾂�!!") ;
    }

    /* -- �e�z��i�[�I�u�W�F�N�g�쐬 -- */
    setNum suzumiya = new setNum() ;
    int[] kyon = suzumiya.setNumArray(N_num) ; //int --> int[]
    String[] strBinary = suzumiya.setBinaryArray(kyon) ; //int[] --> String[]

    /* �����񑀍�I�u�W�F�N�g�쐬 */
    chkStrError serval = new chkStrError() ;

    // �o�͏���
    for( int i = 0 ; i < strBinary.length ; i ++) { //�ȍ~��s���̕�����������
      char[] mikuru = serval.changeCharArrey(strBinary[i]) ; // str --> char[]

      // -- �o�͏����I�� --
      count_1 = serval.analyzeKadai4(mikuru) ; //char[] --> int
      if( count_1 == M_num ) {
        sum += 1 ;
      }
      else if( count_1 == -1 ){
        ed.display("�H�ׂȂ��Ł`!!\n") ;
      }
    }

     /* �I������(object��������) */
    System.out.println( sum + "\n�����[�[���I!" ) ;
  }
}
