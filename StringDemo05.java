package day01;

public class StringDemo05 {

	public static void main(String[] args) {
		/**
		 * �����ַ���  UIUCҲһ��
		 */
		String s = "ABC123�й����й���λ��";
		//��s�в��ҡ��й������ֵ�λ��
		//ƥ�䵽��һ��λ�þͷ������λ��
		int n = s.indexOf("�й�");
		System.out.println(n);
		//������Ҳ���������-1
		n = s.indexOf("����");
		System.out.println(n);//-1
		
		//һ�����ص� indexOf����
		// s.indexOf("�ַ���", ��ʼλ��)
		// �ӡ���ʼλ�á���ʼ���� ���ַ�����
		
		s = "���Ϻɻ����л�";
		//   0 1 2 3 4 5 6
		//���ҵڶ��� ��������λ��
		n = s.indexOf("��", 1);
		System.out.println(n);//6
		
		//�������صķ���������һ���ַ�
		n = s.indexOf('��', 1);
		System.out.println(n);//6
		
		//���в��ԣ���ͷ����һ���ַ�
		// indexOf(char)
		
		//lastIndexOf
		n = s.lastIndexOf('��');
		System.out.println(n); 
		n = s.lastIndexOf('��');
		System.out.println(n); 
		//���䰸�����������һ�����㡱��λ��
		String url=
			"http://www.tedu.cn/index.html";
		n = url.lastIndexOf(".");
		System.out.println(n); 
	
	}

}








