/* ----- ラッパークラスの使い方

基本データ型にはクラスのようにメソッドは用意されていませんので、
基本データ型に対して操作を行ったりすることはできません。

そこで基本データ型の値を持つことができ、
様々な便利なメソッドを用意したクラスが用意されています。
それがラッパークラスと呼ばれるものです。

基本データ型から対応するラッパークラスのオブジェクトを作成し、
そのオブジェクトに対して用意されたメソッドを利用することで
例えば数値から文字列への変換といった処理が可能になる。


ラッパークラスのオブジェクトを作るには、new演算子を使います。
いずれも引数にプリミティブ値を与えるものと文字列を与えるものの２種類があります。

-----------------------------------------

[数値から文字列への変換]
・toStringメソッドを使って文字列に変換する
int i = 84;
Integer oi = new Integer(i);
String str = oi.toString();


・Stringクラスで用意されているvalueOfメソッドを使って文字列に変換する方法
引数にはラッパークラスのオブジェクトではなく基本データ型の値を直接指定する
int i = 84;
String str = String.valueOf(i);

・基本データ型の値と空文字""を「+」演算子で連結することで
数値を文字列に変換することが可能
int i = 84;
String str = "" + i;

-----------------------------------------

[文字列から数値への変換]
・parseメソッドの使用
String str = "124";
int i = Integer.parseInt(str);

・各ラッパークラスで用意されているvalueOfメソッドを使用する方法
String str = "124";
Integer oi = Integer.valueOf(str);



----- */

class howtoRapper {
  public static void main(String[] args) {
    int i = 84;
    Integer oi = new Integer(i);

    int val = oi.intValue();

    /* オートボクシングを利用
    int i = 84;
    Integer oi = i;
    */
    System.out.println(oi.intValue());


    /* 数値から文字列への変換 */

  }
}
