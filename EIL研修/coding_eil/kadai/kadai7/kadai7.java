/* ----------------------------
�y�ܗ^�x���ɂ����錹�򒥎��z�̌v�Z�z


�����Ђł́A�Ј��Ɏx������ܗ^���A�Љ�ی����E���򏊓��ł����������x���z�x�[�X�ŎZ�o���Ă��܂��B
����ŁA�Љ�ی����E���򏊓��ł̌v�Z�ɂ͑��x���z��p���܂��B

�ܗ^�x���ɂ�����e��v�Z���͎��̒ʂ�ł��B

�@���x���z = ���x���z - ���򒥎��z

�@���򒥎��z = �Љ�ی��� + ���򏊓���

�@�Љ�ی��� = ���x���z (1000�~�����؂�̂�) �~ 13.7% (1�~�����A0.5�~�ȉ��؂�̂āA0.5�~���߂Ő؂�グ)

�@�ېőΏۊz = ���x���z - �Љ�ی���

�@���򏊓��� = �ېőΏۊz �~ �ŗ� (1�~�����؂�̂�)


�ŗ��͉ېőΏۊz�ɉ����āA�ȉ��̕\�Œ�߂���̂Ƃ��܂��B

| �ŗ�(%)|  �ȏ�(��~) | ����(��~) |
|  0.000 |           - |         68 |
|  2.042 |          68 |         79 |
|  4.084 |          79 |        252 |
|  6.126 |         252 |          - |


���x���z�ɑΉ����鑍�x���z���������݂���ꍇ�́A
���̂����̍ł��������x���z���x��������̂Ƃ��܂��B


�y�v���O�����d�l�z

�f�[�^�͕W�����͂���ēn����܂��B
1�s����1�l���̎��x���i�\��j�z(�~)���n����܂��B

60000
1000
100000


���ʂ́A1�s���Ɍ��򒥎��z(�~)���o�͂��܂��B

9453
137
20697
---------------------------- */

import java.util.Scanner ; /**  Scanner�I�u�W�F�N�g  **/
import java.util.LinkedList ; /* LinkedList�I�u�W�F�N�g */
import java.util.* ; /** printf()�I�u�W�F�N�g **/

class kadai7 {
  public static void main(String[] args) {

    int    x = 0 ; //���x���z(����)
    double y = 0 ; //���x���z
    double z = 0 ; //���򒥎��z(�o��)
    double a = 0 ; //�Љ�ی���
    double b = 0 ; //���򏊓���
    double c = 0 ; //�ېőΏۊz

    ArrayList<Integer> numInt_x = new ArrayList<Integer>() ; //�ϒ�Int�^���X�g�錾


    /* �J�n����(object��������) */
    System.out.println("���x���z����͂��Ă����Ă�!!(0:���͏I��)");

    /* -- Scaccer�I�u�W�F�N�g�̍쐬 -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* --  �z�ʌv�Z�I�u�W�F�N�g�쐬  -- */
    setNum money = new setNum() ;

    /* -- �G���[�\���I�u�W�F�N�g�̍쐬 -- */
    errorDisplay ed = new errorDisplay() ;

    /* ���͕�����̊i�[���� */
    for( int i = 0 ; ; i++ ){
      numInt_x.add(scan1.nextInt()) ;

      // ���͏I������
      if( numInt_x.get(i).intValue() == 0 ) {
        System.out.println("���͏������I�������!");
        break ;
      }
    }


    /* �o�͏��� */
    for( int j = 0 ; j < numInt_x.size() - 1 ; j++ ) {
      x = numInt_x.get(j).intValue() ;
      c = money.calculate_C(x) ;
      if( c == 0 ) {
        ed.display("�݂�݂�݂�݂�݂�!!!(�ېőΏۋ��z�Z�o�G���[)") ;
      }

      b = money.calculate_b(c, x) ;

      y = money.calculate_y(c) ;
      a = money.calculate_a(y) ;
      z = money.calculate_z(Math.round(a), Math.floor(b)) ;
      System.out.println((int)Math.floor(z)) ;
    }


     /* �I������(object��������) */
    System.out.println("�����[�[���I!" ) ;
  }
}
