import java.util.*;


class paiza4 {
	public static void main(String[] args) {

		/***
			�R�[�q�[�̉��i�Ɗ������������
		***/
		Scanner scanner1 = new Scanner(System.in); //�L�[�{�[�h����̓���
		int coffe_val = scanner1.nextInt();
		int discount_rate = scanner1.nextInt();

		/***
			�o�͗͏���
		***/
		double pay_all = 0;
		double current_val = (double)coffe_val;
		double off_val = 0;

		while (current_val > 0) {
			//�x�������z�Z�o
			pay_all += current_val;

			//�l�����z�Z�o
			off_val = Math.ceil(current_val*((double)discount_rate/100));

			//����w�����i�Z�o
			current_val = current_val - off_val;

			//System.out.println(off_val);
			//System.out.println(current_val);
		}

		System.out.println((int)pay_all);

	}
}
