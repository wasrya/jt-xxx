package day01;

public class StringDemo07 {

	public static void main(String[] args) {
		/**
		 * ȥ���ַ������˵ġ��հס�
		 * �հף��ո񣬻س�\n��tab\t��
		 �޸��޸��޸��޸��޸��޸�
		 */
		String name = " \t Tom \n \r  ";
		String n = name.trim();
		System.out.println("["+n+"]");
		System.out.println("["+name+"]");
		
		String s = "  Tom ";
		s.trim();
		System.out.println(s);
		//���ϴ����������ǣ�
		//A.Tom  B.null  C.�մ�  D.  Tom 
		
		//��� trim() ���ص��Ƿ���ԭ�ַ���
		String s1 = "ABC";
		String s2 = s1.trim();
		System.out.println(s1==s2); 
		String s3 = " ABC ";
		String s4 = s3.trim();
		System.out.println(s3==s4); 
	}
}








