/* --- 型変換について

サイズが小さい型から大きい型へ代入を行う場合は
明示的にキャスト演算子を使用する必要はない。

int型からshort型への変換や、long型からint型への変換などサイズが大きい型から
小さい型への変換の場合、キャスト演算子を使って明示的に型が変更されることを
示す必要があります。

--- */

class changeType {
  public static void main(String[] args) {

    //キャスト演算子使用(特に必要ない)
    int i = 10;
    long l = (long)i;

    //キャスト演算子必要
    int i = 10;
    short s = (short)i;


  }
}
