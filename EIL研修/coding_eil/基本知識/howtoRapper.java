/* ----- ���b�p�[�N���X�̎g����

��{�f�[�^�^�ɂ̓N���X�̂悤�Ƀ��\�b�h�͗p�ӂ���Ă��܂���̂ŁA
��{�f�[�^�^�ɑ΂��đ�����s�����肷�邱�Ƃ͂ł��܂���B

�����Ŋ�{�f�[�^�^�̒l�������Ƃ��ł��A
�l�X�ȕ֗��ȃ��\�b�h��p�ӂ����N���X���p�ӂ���Ă��܂��B
���ꂪ���b�p�[�N���X�ƌĂ΂����̂ł��B

��{�f�[�^�^����Ή����郉�b�p�[�N���X�̃I�u�W�F�N�g���쐬���A
���̃I�u�W�F�N�g�ɑ΂��ėp�ӂ��ꂽ���\�b�h�𗘗p���邱�Ƃ�
�Ⴆ�ΐ��l���當����ւ̕ϊ��Ƃ������������\�ɂȂ�B


���b�p�[�N���X�̃I�u�W�F�N�g�����ɂ́Anew���Z�q���g���܂��B
������������Ƀv���~�e�B�u�l��^������̂ƕ������^������̂̂Q��ނ�����܂��B

-----------------------------------------

[���l���當����ւ̕ϊ�]
�EtoString���\�b�h���g���ĕ�����ɕϊ�����
int i = 84;
Integer oi = new Integer(i);
String str = oi.toString();


�EString�N���X�ŗp�ӂ���Ă���valueOf���\�b�h���g���ĕ�����ɕϊ�������@
�����ɂ̓��b�p�[�N���X�̃I�u�W�F�N�g�ł͂Ȃ���{�f�[�^�^�̒l�𒼐ڎw�肷��
int i = 84;
String str = String.valueOf(i);

�E��{�f�[�^�^�̒l�Ƌ󕶎�""���u+�v���Z�q�ŘA�����邱�Ƃ�
���l�𕶎���ɕϊ����邱�Ƃ��\
int i = 84;
String str = "" + i;

-----------------------------------------

[�����񂩂琔�l�ւ̕ϊ�]
�Eparse���\�b�h�̎g�p
String str = "124";
int i = Integer.parseInt(str);

�E�e���b�p�[�N���X�ŗp�ӂ���Ă���valueOf���\�b�h���g�p������@
String str = "124";
Integer oi = Integer.valueOf(str);



----- */

class howtoRapper {
  public static void main(String[] args) {
    int i = 84;
    Integer oi = new Integer(i);

    int val = oi.intValue();

    /* �I�[�g�{�N�V���O�𗘗p
    int i = 84;
    Integer oi = i;
    */
    System.out.println(oi.intValue());


    /* ���l���當����ւ̕ϊ� */

  }
}
