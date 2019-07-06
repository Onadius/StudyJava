/* ---
結果出力クラス
--- */

import java.util.Scanner ; /**  Scannerオブジェクト  **/
import java.util.* ; /** printf()オブジェクト **/
import java.util.LinkedList ; /* LinkedListオブジェクト */

class output {

  //_右揃え出力メソッド
  int output_1(String maxSize_num, String... num) {

    int keta = maxSize_num.length() ;
    int minus = 0 ;


    System.out.println(" --- 出力結果 --- ") ;

    try{
      for(int i = 0 ; i < num.length ; i++) {
        String under = "_" ;
        minus = keta - num[i].length() ;

        if( num[i].length() == keta ) {
          System.out.println(num[i]) ;
          continue ;
        }

        //結合分_文字列の作成
        for(int j = 0 ; j < minus - 1 ; j ++) {
          under += "_" ;
        }

        String zyougasaki = under.concat(num[i]) ;
        System.out.printf("%s\n", zyougasaki) ;
      }
    }
    catch (IllegalFormatException e) {
      System.out.println("文字列の扱い間違えちゃってるよふえぇ…");
      return 0 ;
    }
    return 1 ;
  }


  //出力メソッド_kadai2
  int output_2(ArrayList<Integer> miku) {

    try{
      for( int i = 0 ; i < miku.size() ; i++ ) {
        for(int j = i + 1 ; j < miku.size() ; j++ ) {

          if( ( miku.get(i).intValue() + miku.get(j).intValue() ) == 256 ) {

            System.out.println("Yesだよ!") ;
            return 1 ;
          }
        }
      }
      System.out.println("Noだよ!") ;
      return 1 ;
    }
    catch( Exception e ) {

      e.printStackTrace() ;
      return 2 ;
    }
  }


  //出力メソッド_kadai3
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


  void output_5(LinkedList<Integer> oikura) {

    int size = oikura.size() ;
    for(int i = 0 ; i < size ; i++ ){
      System.out.print(oikura.get(i)) ;
    }
    System.out.print("\n") ;
  }

  //kadai6分析メソッド
  int analyzeKadai6(int tino) {
    int count = 0 ;

    try {
      for(int i = 1 ; i < 1000000 ; i++ ) {
        if( (i + (i + 1)) % tino == 0 ) {
          count += 1 ;
          continue ;
        }
      }
    }
    catch( Exception e ) {
      e.printStackTrace() ;
      return -1 ;
    }

    System.out.printf("%dだよ\n", count) ;
    return count ;
  }





}
