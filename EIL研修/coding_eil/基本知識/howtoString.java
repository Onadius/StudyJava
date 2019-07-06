/* --  クラスの使い方  -- */

/*
クラス名 変数名;
変数名 = new クラス名(引数, 引数, ...);

String name;
name = new String();

*/


/* --- Stringクラスについて

・文字列の比較
文字列オブジェクト1.equals(文字列オブジェクト1)
-->文字列オブジェクト1が表す文字列と
  文字列オブジェクト2が表す文字列が同じであった場合にtrue

・文字列.charAt(インデックス)
文字列の中の指定の位置にある1文字を取得

・文字列の長さを取得する
文字列.length()


--- */


class howtoString {
    public static void main(String[] args) {

      String name = "miku" ;
      // name = new String() ; 不要
      String name1 = "abc";
      String name2 = "abc";

      System.out.println(name) ;

      String str1 = "abc";
      String str2 = "abc";

      /* -- 文字列の比較
      オブジェクトに同じ文字列が
      格納さえているかどうか調べる時には
      「==」演算子は使わない。
      Stringクラスで用意されている
      equalsメソッドを使います。
      -- */
      if (name1.equals(name2)){
        System.out.println("等しい");
      }else{
        System.out.println("等しくない");
      }






    }
}
