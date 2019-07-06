
/* -- 変数の扱い -- */

class sample1 {

  public static void main(String[] args) {

      int num = 1 ;
      int miku = 0 ;
      int data[] = {39, 3939, 399} ;

      num = num * 39 ;
      //System.out.println(num) ;

      /* ブロック内()で使用した変数iはブロック内でのみ有効 */
      for (int i = 0 ; i < 10 ; i++) {

        miku += i ;
      }
      //System.out.println(miku) ;


      /* for-each文の使用 */
      for( int vocaloid : data) {
        System.out.println(vocaloid) ;
      }


      /* ラベル付きbreak文 あまり使うな */
      outside: for (int i = 1; i < 5; i++){
        for (int j = 1; j < 5; j++){
          if (i * j > 10){
            break outside;
          }

          System.out.println(i + "*" + j + "=" + (i * j)) ;
        }
      }




  }
}
