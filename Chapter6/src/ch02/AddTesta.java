package ch02;

public class AddTesta {

	public static void main(String[] args) {

		// ���ٽ� ǥ��
		Add addL = (x, y) -> {return x+y;}; //return ���Խ� �߰�ȣ �ʼ�
		Add addI = (x, y) -> x+y; // return ����
		System.out.println(addL.add(2,3));
	}

}
