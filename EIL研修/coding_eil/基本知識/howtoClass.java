/* -----

�N���X���畨�̂��쐬����ɂ�"new"���g���܂��B
�N���X�� �ϐ��� = new �N���X��(����);

�N���X�ϐ�.���\�b�h�ŏ���

main���\�b�h�̓v���O���������s���鎞�ɍŏ��ɌĂяo����郁�\�b�h
���̃��\�b�h���ɑ��̃N���X�̃I�u�W�F�N�g���쐬����L�q�����Ă������Ƃ�
�v���O�����͓��삷��킯�ł�


//�I�u�W�F�N�g�w��
�I�u�W�F�N�g�w���ƌ����̂́A�ړI�ɉ����ăN���X��݌v���āA
��������I�u�W�F�N�g���쐬���A���̃I�u�W�F�N�g�ɓ����������A
�Ƃ������L�q���@���s������

�ustatic�v�Ƃ����L�q������ꍇ�́A�V�X�e�����Ńv���O�����J�n���ɗp�ӂ��Ă����
���\�b�h�Ƃ������ƂɂȂ�܂��B���́ustatic�v���������\�b�h�����瑼�̃��\�b�h��
�Ăяo���ꍇ�ɂ́A���̌Ăяo����郁�\�b�h���ustatic�v���t���Ă���K�v������

�N���X�̒��ɋL�q����A��������I�u�W�F�N�g���쐬����Ă�����s����郁�\�b�h�́A
�I�u�W�F�N�g���쐬���ꂽ���_�Ń��\�b�h���쐬�����΂����̂ŁA
�ustatic�v��t����K�v�͖����킯�ł��B


���\�b�h���g���ă����o�ϐ���ύX���闝�R

https://goo.gl/5TKmbG

----- */





class howtoClass {
  public static void main(String[] args) {

    //�I�u�W�F�N�g�̍쐬
    Television miku = new Television() ;

    //�����o�ϐ��ւ̒l�̊i�[
    miku.mikudayo = 1 ;

    miku.setChannel(1) ;
    miku.dispChannel() ;

  }
}




/*  �N���X1  */
class Television{
  int channelNo;
  int mikudayo ;

  void setChannel(int newChannelNo){
    channelNo = newChannelNo;
  }

  void dispChannel(){
    System.out.print("���݂̃`�����l���� " + channelNo + " �ł�");
  }
}
