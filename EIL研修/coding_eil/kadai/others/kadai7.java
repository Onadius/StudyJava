/* ----------------------------
yÜ^xÉ¨¯é¹ò¥ûzÌvZz


 éïÐÅÍAÐõÉx·éÜ^ðAÐïÛ¯¿E¹ò¾Åð¢½Àxzx[XÅZoµÄ¢Ü·B
êûÅAÐïÛ¯¿E¹ò¾ÅÌvZÉÍxzðp¢Ü·B

Ü^xÉ¨¯éeívZ®ÍÌÊèÅ·B

@Àxz = xz - ¹ò¥ûz

@¹ò¥ûz = ÐïÛ¯¿ + ¹ò¾Å

@ÐïÛ¯¿ = xz (1000~¢ØèÌÄ) ~ 13.7% (1~¢A0.5~ÈºØèÌÄA0.5~´ßÅØèã°)

@ÛÅÎÛz = xz - ÐïÛ¯¿

@¹ò¾Å = ÛÅÎÛz ~ Å¦ (1~¢ØèÌÄ)


Å¦ÍÛÅÎÛzÉ¶ÄAÈºÌ\ÅèßéàÌÆµÜ·B

| Å¦(%)|  Èã(ç~) | ¢(ç~) |
|  0.000 |           - |         68 |
|  2.042 |          68 |         79 |
|  4.084 |          79 |        252 |
|  6.126 |         252 |          - |


ÀxzÉÎ·éxzª¡¶Ý·éêÍA
»Ì¤¿ÌÅà¢xzðx·éàÌÆµÜ·B


yvOdlz

f[^ÍWüÍðîµÄn³êÜ·B
1sÉ1lªÌÀxi\èjz(~)ªn³êÜ·B

60000
1000
100000


ÊÍA1sÉ¹ò¥ûz(~)ðoÍµÜ·B

9453
137
20697
---------------------------- */

import java.util.Scanner ; /**  ScannerIuWFNg  **/
import java.util.LinkedList ; /* LinkedListIuWFNg */
import java.util.* ; /** printf()IuWFNg **/

class kadai7 {
  public static void main(String[] args) {

    int    x = 0 ; //Àxz(üÍ)
    double y = 0 ; //xz
    double z = 0 ; //¹ò¥ûz(oÍ)
    double a = 0 ; //ÐïÛ¯¿
    double b = 0 ; //¹ò¾Å
    double c = 0 ; //ÛÅÎÛz

    ArrayList<Integer> numInt_x = new ArrayList<Integer>() ; //ÂÏ·Int^Xgé¾


    /* Jn(object»µ½¢) */
    System.out.println("ÀxzðüÍµÄ¢ÁÄË!!(0:üÍI¹)");

    /* -- ScaccerIuWFNgÌì¬ -- */
    Scanner scan1 = new Scanner(System.in) ;

    /* --  zÊvZIuWFNgì¬  -- */
    setNum money = new setNum() ;

    /* -- G[\¦IuWFNgÌì¬ -- */
    errorDisplay ed = new errorDisplay() ;

    /* üÍ¶ñÌi[ */
    for( int i = 0 ; ; i++ ){
      numInt_x.add(scan1.nextInt()) ;

      // üÍI¹
      if( numInt_x.get(i).intValue() == 0 ) {
        System.out.println("üÍðI¹·éæ!");
        break ;
      }
    }


    /* oÍ */
    for( int j = 0 ; j < numInt_x.size() - 1 ; j++ ) {
      x = numInt_x.get(j).intValue() ;
      c = money.calculate_C(x) ;
      if( c == 0 ) {
        ed.display("ÝáÝáÝáÝáÝá!!!(ÛÅÎÛàzZoG[)") ;
      }

      b = money.calculate_b(c, x) ;

      y = money.calculate_y(c) ;
      a = money.calculate_a(y) ;
      z = money.calculate_z(Math.round(a), Math.floor(b)) ;
      System.out.println((int)Math.floor(z)) ;
    }


     /* I¹(object»µ½¢) */
    System.out.println("·²[[¢I!" ) ;
  }
}
