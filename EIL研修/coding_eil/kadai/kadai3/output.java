/* ---
���ʏo�̓N���X
--- */

import java.util.Scanner ; /**  Scanner�I�u�W�F�N�g  **/
import java.util.* ; /** printf()�I�u�W�F�N�g **/

class output {

  //�o�̓��\�b�h_kadai3
  void output_3( int[] miku, int status ) {

    int max = miku[0] ;
    int min = miku[1] ;

    try {
      switch( status ) {

        case 1 :
          for(int i = 0 ; i < miku.length ; i++ ) {
            if( miku[i] > max ) {
              max = miku[i] ;
            }
          }
          System.out.println(max) ; break ;

        case 2 :
          for(int i = 0 ; i < miku.length ; i++ ) {

            if( (miku[i] < min) && (miku[i] != 0) ) {
              min = miku[i] ;
            }
            else if(min == 0) {
              min = miku[i] ;
            }
          }
          System.out.println(min) ; break ;

      }
    }
    catch( Exception e ) {
      e.printStackTrace() ;
    }
  }


  //�o��ver2
  int output_3ver2(int[] miku) {

    //������error�`�F�b�N
    for( int i= 0 ; i < (miku.length - 1) ; i++ ) {
      if( miku[i] == miku[i + 1] ) {

        System.out.println("�L�~�͓����J�[�h���`���C�X�����Ⴄ�t�����Y�Ȃ񂾂�!!") ;
        break ;
      }
    }

    try {
      if(miku[0] == 0) {
        System.out.println(miku[1]) ; //�ŏ��l�o��
        return 1 ;
      }

      System.out.println(miku[3]) ; //�ő�l�o��
      return 1 ;
    }
    catch(Exception e) {
      return 0 ;
    }
  }


}
