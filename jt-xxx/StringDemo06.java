package day01;

public class StringDemo06 {

	public static void main(String[] args) {
		/**
		 * 截取子字符串
		 * substring 从一个字符串中截取子字符串
		 */
		String url=
			"https://www.tedu.cn/index.html";
		//"http://canglaoshi.org/site/demo/index.html";
		//   01234567890123456789012345678
		//http 协议， www.tedu.cn 主机名
		//  /index.html 请求路径
		/*
		 * 截取请求路径
		 */
		int start = url.indexOf("//")+2;
		int index=url.indexOf("/",start);
		String path=url.substring(index);
		System.out.println(path); 
		
		/**
		 * substring(开始，结束)
		 * 包含开始，不包含结束
		 */
		//截取URL中的主机名：
		url="https://www.tedu.cn/index.html";
		start = url.indexOf("//")+2;
		int end = url.indexOf("/", start);
		String host=url.substring(start, end);
		System.out.println(host);
	}
}







