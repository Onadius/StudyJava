/* ----------------------------
�y���z
20���̐������񎦂���܂��B
��ԍ��̌���擪�Ƃ��āA�E�̌��ւƏ��Ɍ��Ă����܂��B
�����āA�ׂ荇���������A�����鐔�������ꍇ�́A���̑o�����폜���Đ擪�ɖ߂�܂��B
�ŏI�I�ɁA�폜���ł��Ȃ��Ȃ������_�Ő������o�͂��Ă��������B

��
�u95422357545868773174�v���u95422357545868773174�v��
�u922357545868773174�v���u922357545868773174�v��
�u9257545868773174�v���u9257545868773174�v��
�u92575868773174�v���u92575868773174�v��
�u925758673174�v���u925758673174�v��
�u9257583174�v�i�폜���ł��Ȃ��Ȃ����̂ŁA���ꂪ�����j


�y���́z
�W�����͂���A�����s�̃f�[�^���^�����܂��B1�s�̃f�[�^���A1��20���̐����ɂȂ�܂��B


�y�o�́z
1�s���������s�Ȃ��A���̓�����1�s���ƕW���o�͂ɏo�͂��܂��B


�y���o�̓T���v���z
Input
95422357545868773174
24566191298259441958
34757881545564825469
86423251489513547814

Output
9257583174
26619259441958
75818269
8642511314

---------------------------- */

import java.util.Scanner ; /**  Scanner�I�u�W�F�N�g  **/
import java.util.LinkedList ; /* LinkedList�I�u�W�F�N�g */
import java.util.* ; /** printf()�I�u�W�F�N�g **/

class kadai5 {
  public static void main(String[] args) {

    int N_error = 0 ; //���͌����`�F�b�N�p
    ArrayList<String> numStr = new ArrayList<String>() ; //�ϒ�Int�^���X�g�錾
    char[] char_inp_num = new char[20] ; //String --> char[]�ϊ��p
    int[] int_inp_num = new int[20] ; //cahr[] --> int[]�ϊ��p
    LinkedList<Integer> listNum = new LinkedList<Integer>(); //iny[] --> LinkedList<int>�ϊ��p
    LinkedList<Integer> shinobu  = new LinkedList<Integer>() ; //���ʏo�͗p


    /* �J�n����(object��������) */
    System.out.println("20�P�^��������͂��Ă����Ă�!!");

    /* -- Scaccer�I�u�W�F�N�g�̍쐬 -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* -- ������G���[�I�u�W�F�N�g�̍쐬 -- */
    chkNumError kawaii = new chkNumError() ;

    /* -- �G���[�\���I�u�W�F�N�g�̍쐬 -- */
    errorDisplay ed = new errorDisplay() ;

    /* -- �����񑀍�I�u�W�F�N�g�쐬 -- */
    chkStrError serval = new chkStrError() ;

    /* �o�̓I�u�W�F�N�g�쐬 */
    output gotiusa = new output() ;


    /* ���͕�����̊i�[���� */
    for( int i = 0 ; ; i++ ){
      numStr.add(scan1.next()) ;
      N_error = kawaii.checkInputNum2( numStr.get(i).length(), 20 ) ; // int, int --> int

      // ���͏I������
      if( numStr.get(i).equals("�łɈ��܂��") ) {
        System.out.println("���͏������I�������!");
        break ;
      }

      //���̓P�^���G���[����
      if( N_error == 0 ) {
        ed.display("�L�~�͓��͌������G���[�����Ⴄ�t�����Y�Ȃ񂾂�!!") ;
      }
    }


    /* ��s���̕����񕪐͏��� */
    for( int j = 0 ; j < (numStr.size() - 1) ; j ++) { //�ȍ~��s���̕�����������
      char_inp_num = serval.changeCharArrey(numStr.get(j)) ; // str --> char[]
      int_inp_num = serval.changeIntChar(char_inp_num, 20) ; //char[] --> int[]
      listNum = serval.chIntLinkedList(int_inp_num) ; //int[] --> LinkedList<int>

      //�o�͏���
      shinobu = serval.analyzeKadai5(listNum) ;
      gotiusa.output_5(shinobu) ;

    }

     /* �I������(object��������) */
    System.out.println("�����[�[���I!" ) ;
  }
}
