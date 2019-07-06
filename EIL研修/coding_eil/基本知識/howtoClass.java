/* -----

クラスから物体を作成するには"new"を使います。
クラス名 変数名 = new クラス名(引数);

クラス変数.メソッドで処理

mainメソッドはプログラムを実行する時に最初に呼び出されるメソッド
このメソッド内に他のクラスのオブジェクトを作成する記述をしておくことで
プログラムは動作するわけです


//オブジェクト指向
オブジェクト指向と言うのは、目的に応じてクラスを設計して、
そこからオブジェクトを作成し、そのオブジェクトに動作をさせる、
といった記述方法を行うもの

「static」という記述がある場合は、システム側でプログラム開始時に用意してくれる
メソッドということになります。この「static」がついたメソッド内から他のメソッドを
呼び出す場合には、その呼び出されるメソッドも「static」が付いている必要がある

クラスの中に記述され、いったんオブジェクトを作成されてから実行されるメソッドは、
オブジェクトが作成された時点でメソッドが作成されればいいので、
「static」を付ける必要は無いわけです。


メソッドを使ってメンバ変数を変更する理由

https://goo.gl/5TKmbG

----- */





class howtoClass {
  public static void main(String[] args) {

    //オブジェクトの作成
    Television miku = new Television() ;

    //メンバ変数への値の格納
    miku.mikudayo = 1 ;

    miku.setChannel(1) ;
    miku.dispChannel() ;

  }
}




/*  クラス1  */
class Television{
  int channelNo;
  int mikudayo ;

  void setChannel(int newChannelNo){
    channelNo = newChannelNo;
  }

  void dispChannel(){
    System.out.print("現在のチャンネルは " + channelNo + " です");
  }
}
