/* --- メソッドの使い方  UTF-8

・メソッド定義
[修飾子] 戻り値のデータ型 メソッド名(引数1, 引数2, ....){

}
戻り値のデータ型はメソッドが呼び出された時に値を一つだけ呼び出し元に返すことができます。
その返す値のデータ型を指定します。何も値を返さない場合はvoid型を指定する。



・配列を引数としてメソッドに渡すとき
メソッドの呼び出し側の配列とメソッド側で引数に代入された配列は
まったく同じ場所の位置を管理していることになる。

メソッド側で配列の要素に格納されている値を変更すると、
メソッド呼び出し側の配列の同じ要素に格納されている値も変更されることになります。


・Stringクラスのオブジェクトを引数とするとき
文字列変数に新しい文字列を代入するとまったく別の場所にオブジェクトが新しく作成され、
その新しい場所の位置がメソッド内の変数に代入されます。
その為、元の場所には元の文字列が格納されたままなので
メソッド呼び出し元の文字列には何も影響を与えません。



・return文が実行されるとそれ以降にメソッド内に書かれた処理は実行されません
return文を使うことでメソッドの中の処理の流れを
任意の位置で終了させ呼び出し元に処理を返すことができる


・メソッドのオーバーロードについて
同じメソッド名で複数のメソッドを定義するには、
引数の数が異なっているか、引数のデータ型が異なっている必要がある。
○ 引数の数が異なっている場合:
private static void test(int n1){
  // ...
}

private static void test(int n1, int n2){
  // ...
}

○ 引数の種類が異なっている場合:
private static void test(int n1){
  // ...
}

private static void test(double d1){
  // ...
}


・可変引数について
固定引数と可変引数を組み合わせる場合の注意点は、
必ず固定引数から記述する必要がある。
可変引数は一つのメソッドで一つしか記述できない。



--- */
class howtoMethod {
  public static void main(String[] args) {

    int miku = 39;
    int rin = 77;


    /* メソッドの関数的な使い方 */
    check("Miku", miku);
    check("Rin", rin);

    int age = eromannga() ;
    System.out.print("お兄ちゃん(" + age + ")のラノベ主人公!!\n");

    konosuba("アクア", "めぐみん", "ダクネス") ;
  }


  //関数的扱いのメソッド
  public static void check(String vocaloid, int num) {

    System.out.println("The vocaloid is ") ;
    if (num == 39) {
      System.out.println(vocaloid) ;
    }else{

      System.out.print("my sweet honey " + vocaloid + "\n") ;
    }
  }

  //返り値ありメソッド
  public static int eromannga() {

    return 23 ;
  }


  //可変引数をもつメソッド
  public static  void konosuba(String... chara) {

    for(int i = 0 ; i < chara.length ; i++) {
      System.out.print(chara[i] + "はパンツ履かない\n") ;
    }
  }

}
