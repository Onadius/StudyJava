
/* -- �����������\�b�h -- */
class setNum {

  //�����z��쐬���\�b�h --kadai4
  int[] setNumArray(int n) {
    int[] haruhi = new int[n + 1] ;

    for( int i = 0 ; i < n + 1 ; i++ ) {
      haruhi[i] = i ;
    }

    return haruhi ;
  }

  //��i���z��쐬���\�b�h --kadai4
  String[] setBinaryArray(int[] nagato) {
    String[] yuki = new String[ nagato.length ] ;

    for( int i = 0 ; i < nagato.length ; i++ ){
      yuki[i] = Integer.toBinaryString(nagato[i]);
    }

    return yuki ;
  }

}
