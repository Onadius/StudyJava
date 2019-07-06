
/* -- �����������\�b�h -- */
class setNum {


  //�ېőΏۊz�v�Z���\�b�h
  double calculate_C(int x) {

    double[] q = {0, 0.02042, 0.04084, 0.06126} ;

    if( ((double)x / (1 - q[0])) < 68000 ) {
      return  (double)x / (1 - q[0]) ;
    }
    else if( ((double)x / (1 - q[1])) >= 68000 && ((double)x / (1 - q[1])) < 79000 ) {
      return ((double)x / (1 - q[1])) ;
    }
    else if( ((double)x / (1 - q[2])) >= 79000 && ((double)x / (1 - q[2])) < 252000 ) {
      return ((double)x / (1 - q[2])) ;
    }
    else if( ((double)x / (1 - q[3])) >= 252000 ) {
      return ((double)x / (1 - q[3])) ;
    }

    return 0 ;
  }

  //���򏊓��Ōv�Z���\�b�h
  double calculate_b(double c, int x) {

    return (c - (double)x) ;
  }

  //���x���z�v�Z���\�b�h
  double calculate_y(double c) {

    double zei = 0.137 ;
    return (c / ( 1 - zei )) ;
  }


  //�Љ�ی����v�Z���\�b�h
  double calculate_a(double y) {
    double y2 = Math.round(y/1000) * 1000 ;

    return (y2 * 0.137) ;
  }


  //
  double calculate_z(double a, double b) {
    double b2 = Math.round(b) ;

    return (a + b2) ;
  }


}
