/* --------- コンストラクタの扱いについて

コンストラクタとは、クラスからオブジェクトを作成した際に、自動的に実行されるメソッドのことで、
メンバ変数の初期化などの主に行います。

メンバ変数に値を格納するメソッドを呼び出してはいないのですが
コンストラクタによってオブジェクト作成時にメンバ変数に初期値が格納されているため、
dispChannnel()メソッドが正常に動く


--------- */

class howtoConstracta {
  public static void main(String args[]){
    Television tv1 = new Television();

    tv1.dispChannel();
  }
}

class Television{
  private int channelNo;
  private String housouKyoku;

  /* コンストラクタ */
  Television(){
    channelNo = 1;
    housouKyoku = "FujiTV";
  }

  public void setChannel(int newChannelNo){
    channelNo = newChannelNo;
    if (channelNo == 1){
      housouKyoku = "FujiTV";
    }else if (channelNo == 3){
      housouKyoku = "NHK";
    }
  }

  public void dispChannel(){
    System.out.println("現在のチャンネルは" + housouKyoku + "です");
  }
}
