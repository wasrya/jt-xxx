package day01;

public class StringDemo06 {

	public static void main(String[] args) {
		/**
		 * ��ȡ���ַ���
		 * substring ��һ���ַ����н�ȡ���ַ���
		 */
		String url=
			"https://www.tedu.cn/index.html";
		//"http://canglaoshi.org/site/demo/index.html";
		//   01234567890123456789012345678
		//http Э�飬 www.tedu.cn ������
		//  /index.html ����·��
		/*
		 * ��ȡ����·��
		 */
		int start = url.indexOf("//")+2;
		int index=url.indexOf("/",start);
		String path=url.substring(index);
		System.out.println(path); 
		
		/**
		 * substring(��ʼ������)
		 * ������ʼ������������
		 */
		//��ȡURL�е���������
		url="https://www.tedu.cn/index.html";
		start = url.indexOf("//")+2;
		int end = url.indexOf("/", start);
		String host=url.substring(start, end);
		System.out.println(host);
	}
}







