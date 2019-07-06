/* ----- 例外処理

try{
  例外が発生しているかどうか調べる文1;
  例外が発生しているかどうか調べる文2;
  ...
}
catch (例外クラス1 変数名1){
  例外クラス1の例外が発生した時に行う文;
  ...
}
catch (例外クラス2 変数名2){
  例外クラス2の例外が発生した時に行う文;
  ...
}
finally {
  例外が発生するしないに関わらず実行する文;
  ...
}


例外が発生するかどうかを調べる対象の文をtryの後の
「{」から「}」までのブロック内に記述します。
そして例外が発生した時に行いたい処理をcatchの後の
「{」から「}」までのブロック内に記述します。

try{
  for (int i = 0; i < 4; i++){
    System.out.println(n[i]);
  }
}
catch(ArrayIndexOutOfBoundsException e){
  System.out.println("配列の範囲を超えています");
}
finally{
  System.out.println("配列の出力を終了しました");
}


----- */







class howtoError {
  public static void main(String[] args) {

  }
}
