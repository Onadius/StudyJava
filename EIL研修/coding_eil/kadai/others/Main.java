import java.util.*;
/* ���C���N���X */
class Main{
	/* �����J�n�����main���\�b�h */
	public static void main(String[]args){
		/* ��ʓ��͂Ɏg��Scanner�N���X */
		Scanner cin=new Scanner(System.in);
		/* �ϐ��錾 */
		String line;
		for(;cin.hasNext();){
			/* ���͂��ꂽ�l��line�ϐ��ɃZ�b�g */
			line=cin.nextLine();
			/* �啶���ɕϊ����ăR���\�[���o�� */
			System.out.println(line.toUpperCase());
		}
	}
}
