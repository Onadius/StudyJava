/******************* javaコーディングメモ  **********************/

shift-jis

// pass: C:\Users\Administrator\Documents\java\coding_eil\kadai

/* ----
参考 : http://manga.crocro.com/?cat=java&pg=index

atom パッケージ: https://goo.gl/5HT1JC

ソースファイルを文字コードとしてUTF-8を使って保存した場合、
次のようにコンパイルを行う
javac -encoding UTF-8 sample.java

Javaでは、各OSや環境向けにJava仮想マシンを用意しています。
そしてJavaコンパイラで作られたファイルを、それぞれの環境上で動くようにしてくれます。

Java仮想マシンは、Javaコンパイラが作った中間ファイルを読み取り、
動作させるアプリケーションです

Javaでは、人間用のプログラムの拡張子は「.java」で、
Java用のファイルの拡張子は「.class」になります。
拡張子「.class」のJava用ファイルを「中間（言語）ファイル」と呼びます。
また、このファイルに書いてあるコンピュータ用の命令を「中間言語コード」と呼びます。

目的に応じたクラスを設計し、クラスからモノを作り、
そのモノに処理を実行させるというのがプログラムの流れ



int n[];
n = new int[5];
new演算子を使って5個の値が格納できる場所が確保されると同時に、
確保された場所の先頭の場所の位置が配列変数に代入されます。
この時点で初めて配列変数は有効な値を持つことになります。

配列変数そのものはあくまでどこかに確保された場所の位置だけを格納しています。
配列に値を格納したり、値を取り出したりする場合は配列変数そのものではなく
配列の各要素に対して行うことになる


クラスのオブジェクトを変数に代入する場合は、配列の場合と同じく参照型の変数となります。
よってStringクラスのオブジェクトを作成して変数に代入した場合は、
まず入れ物が別に用意されてStringクラスのオブジェクトが格納され、
変数には入れ物の位置が格納されます。




--------------------------------------------------------------------

・//  --> コメントアウト

・拡張for文(for-each文)
for (データ型 変数名: コレクション){
  実行する文1;
  実行する文2;
  ...
}


・クラスからオブジェクトを作成するには次のように行う
クラス名 変数名;
変数名 = new クラス名(引数, 引数, ...);
String name;
name = new String();


String str1 = "abc";
String str2 = "abc";

if (str1 == str2){
  System.out.println("等しい");
}else{
  System.out.println("等しくない");
}
結果は「等しい」
"abc"という文字列をどこかの入れ物に入れてその位置を最初に変数「str1」に代入し、
次に同じように"abc"という文字列を先ほどとは別の入れ物に入れてその位置を
変数「str2」に代入するため、この二つの単に比較しても本来等しくならないはずですが、
Javaではこのような時に1番目と2番目で同じ"abc"の位置を代入している。




--- */
