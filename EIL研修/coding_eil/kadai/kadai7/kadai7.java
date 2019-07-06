/* ----------------------------
【賞与支給における源泉徴収額の計算】


ある会社では、社員に支給する賞与を、社会保険料・源泉所得税を除いた実支給額ベースで算出しています。
一方で、社会保険料・源泉所得税の計算には総支給額を用います。

賞与支給における各種計算式は次の通りです。

　実支給額 = 総支給額 - 源泉徴収額

　源泉徴収額 = 社会保険料 + 源泉所得税

　社会保険料 = 総支給額 (1000円未満切り捨て) × 13.7% (1円未満、0.5円以下切り捨て、0.5円超過で切り上げ)

　課税対象額 = 総支給額 - 社会保険料

　源泉所得税 = 課税対象額 × 税率 (1円未満切り捨て)


税率は課税対象額に応じて、以下の表で定めるものとします。

| 税率(%)|  以上(千円) | 未満(千円) |
|  0.000 |           - |         68 |
|  2.042 |          68 |         79 |
|  4.084 |          79 |        252 |
|  6.126 |         252 |          - |


実支給額に対応する総支給額が複数存在する場合は、
そのうちの最も高い総支給額を支給するものとします。


【プログラム仕様】

データは標準入力を介して渡されます。
1行毎に1人分の実支給（予定）額(円)が渡されます。

60000
1000
100000


結果は、1行毎に源泉徴収額(円)を出力します。

9453
137
20697
---------------------------- */

import java.util.Scanner ; /**  Scannerオブジェクト  **/
import java.util.LinkedList ; /* LinkedListオブジェクト */
import java.util.* ; /** printf()オブジェクト **/

class kadai7 {
  public static void main(String[] args) {

    int    x = 0 ; //実支給額(入力)
    double y = 0 ; //総支給額
    double z = 0 ; //源泉徴収額(出力)
    double a = 0 ; //社会保険料
    double b = 0 ; //源泉所得税
    double c = 0 ; //課税対象額

    ArrayList<Integer> numInt_x = new ArrayList<Integer>() ; //可変長Int型リスト宣言


    /* 開始処理(object化したい) */
    System.out.println("実支給額を入力していってね!!(0:入力終了)");

    /* -- Scaccerオブジェクトの作成 -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* --  額面計算オブジェクト作成  -- */
    setNum money = new setNum() ;

    /* -- エラー表示オブジェクトの作成 -- */
    errorDisplay ed = new errorDisplay() ;

    /* 入力文字列の格納処理 */
    for( int i = 0 ; ; i++ ){
      numInt_x.add(scan1.nextInt()) ;

      // 入力終了処理
      if( numInt_x.get(i).intValue() == 0 ) {
        System.out.println("入力処理を終了するよ!");
        break ;
      }
    }


    /* 出力処理 */
    for( int j = 0 ; j < numInt_x.size() - 1 ; j++ ) {
      x = numInt_x.get(j).intValue() ;
      c = money.calculate_C(x) ;
      if( c == 0 ) {
        ed.display("みゃみゃみゃみゃみゃ!!!(課税対象金額算出エラー)") ;
      }

      b = money.calculate_b(c, x) ;

      y = money.calculate_y(c) ;
      a = money.calculate_a(y) ;
      z = money.calculate_z(Math.round(a), Math.floor(b)) ;
      System.out.println((int)Math.floor(z)) ;
    }


     /* 終了処理(object化したい) */
    System.out.println("すごーーい！!" ) ;
  }
}
