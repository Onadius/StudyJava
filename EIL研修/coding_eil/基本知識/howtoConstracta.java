/* --------- �R���X�g���N�^�̈����ɂ���

�R���X�g���N�^�Ƃ́A�N���X����I�u�W�F�N�g���쐬�����ۂɁA�����I�Ɏ��s����郁�\�b�h�̂��ƂŁA
�����o�ϐ��̏������Ȃǂ̎�ɍs���܂��B

�����o�ϐ��ɒl���i�[���郁�\�b�h���Ăяo���Ă͂��Ȃ��̂ł���
�R���X�g���N�^�ɂ���ăI�u�W�F�N�g�쐬���Ƀ����o�ϐ��ɏ����l���i�[����Ă��邽�߁A
dispChannnel()���\�b�h������ɓ���


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

  /* �R���X�g���N�^ */
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
    System.out.println("���݂̃`�����l����" + housouKyoku + "�ł�");
  }
}
