/* --- Scanner�N���X�̈���
import java.util.Scanner;

�L�[�{�[�h����̓��͂��󂯂���ꍇ��System.in���g���ĉ��L�̂悤�ɋL�q���܂��B
Scanner scan = new Scanner(System.in);


[��؂蕶����ύX����]
�Ⴆ�΋�؂蕶�����J���}(,)�ɕύX����ꍇ�͉��L�̂悤�ɂȂ�܂�
Scanner scan = new Scanner(System.in);
scan.useDelimiter(",");


*/

import java.util.Scanner;

class howtoScanner {
  public static void main(String[] args) {

    String[] strs = new String[5] ;

    System.out.println("��������͂��ĉ������B");

    //���̓I�u�W�F�N�g�쐬
    Scanner scan = new Scanner(System.in) ;
    scan.useDelimiter("\n");


    for(int i = 0 ; i < 5 ; i++ ){
      strs[i] = scan.next();
      System.out.println("�o��:" + strs[i]) ;

    }


  }
}
