/* -- javaの配列の扱い(参照)  -- */

class sample2 {
  public static void main(String[] args) {

    //配列宣言
    int a[];
    //new演算子を使って必要な数の要素を確保
    a = new int[5] ;

    int b[] = new int[5] ;

    //配列宣言2
    int miku[] = {39, 3939, 399} ;
    System.out.println(miku.length) ; //配列長さの取得


    //多次元配列の扱い
    int seiseki[][];
    seiseki = new int[2][3];

    seiseki[0][0] = 80;
    seiseki[0][1] = 92;
    seiseki[0][2] = 45;

    seiseki[1][0] = 75;
    seiseki[1][1] = 89;
    seiseki[1][2] = 54;





  }
}
