/* ----------------------------
1����1,000,000�܂ł̐����͈̔͂ŁA�A������2�l�����v���܂��B
2�l�̍��v���A����N�̔{���ɂȂ�g�ݍ��킹���A�����Ă��������B
�������A����N�́A2��N��1,000 �͈̔͂Ƃ��܂��B

��
����N��11�̏ꍇ�A�u5, 6�i���v��11�j�v�A�u16,17�i���v��33�j�v�c�c�Ƃ����g�ݍ��킹���A����N�̔{���ɂȂ�܂��B
�܂��A�A������2�l�̍ŏ��́u1, 2�i���v��3�j�v�A�ő�́A�u999999, 1000000�i���v��1999999�j�v�ɂȂ�܂��B


�y���́z
�W�����͂���A�����s�̃f�[�^���^�����܂��B1�s�̃f�[�^���A1�̐���N�ɂȂ�܂��B


�y�o�́z
1�s���������s�Ȃ��A���̓�����1�s���ƕW���o�͂ɏo�͂��܂��B


�y���o�̓T���v���z
Input
307
456
545
165

Output
3257
0
1835
6061

---------------------------- */

import java.util.Scanner ; /**  Scanner�I�u�W�F�N�g  **/
import java.util.LinkedList ; /* LinkedList�I�u�W�F�N�g */
import java.util.* ; /** printf()�I�u�W�F�N�g **/

class kadai6 {
  public static void main(String[] args) {

    int N_error = 0 ; //���͔͈̓`�F�b�N�p
    int O_num = 0 ; //�o�͗p�ϐ�
    ArrayList<Integer> numInt = new ArrayList<Integer>() ; //�ϒ�Int�^���X�g�錾


    /* �J�n����(object��������) */
    System.out.println("1000�܂ł̐�������͂��Ă����Ă�!!(0:���͏I��)");

    /* -- Scaccer�I�u�W�F�N�g�̍쐬 -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* -- ������G���[�I�u�W�F�N�g�̍쐬 -- */
    chkNumError kawaii = new chkNumError() ;

    /* -- �G���[�\���I�u�W�F�N�g�̍쐬 -- */
    errorDisplay ed = new errorDisplay() ;

    /* �o�̓I�u�W�F�N�g�쐬 */
    output gotiusa = new output() ;


    /* ���͕�����̊i�[���� */
    for( int i = 0 ; ; i++ ){
      numInt.add(scan1.nextInt()) ;
      N_error = kawaii.checkInputNum( numInt.get(i).intValue(), 1000 ) ; // int, int --> int

      // ���͏I������
      if( numInt.get(i).intValue() == 0 ) {
        System.out.println("���͏������I�������!");
        break ;
      }

      //���̓P�^���G���[����
      if( N_error == 0 ) {
        ed.display("�L�~�͓��͏�������I�[�o�[�����Ⴄ�t�����Y�Ȃ񂾂�!!") ;
      }
    }


    /* �o�͏��� */
    for( int j = 0 ; j < numInt.size() - 1 ; j++ ) {
      O_num = gotiusa.analyzeKadai6(numInt.get(j).intValue()) ;
      if ( O_num < 0 ) {
        ed.display("�݂�݂�݂�݂�݂�!!!") ;
      }
    }

     /* �I������(object��������) */
    System.out.println("�����[�[���I!" ) ;
  }
}
