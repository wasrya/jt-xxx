package day01;

public class StringDemo07 {

	public static void main(String[] args) {
		/**
		 * 去除字符串两端的“空白”
		 * 空白：空格，回车\n，tab\t等
		 修改修改修改修改修改修改
		 */
		String name = " \t Tom \n \r  ";
		String n = name.trim();
		System.out.println("["+n+"]");
		System.out.println("["+name+"]");
		
		String s = "  Tom ";
		s.trim();
		System.out.println(s);
		//如上代码输出结果是：
		//A.Tom  B.null  C.空串  D.  Tom 
		
		//检查 trim() 返回的是否是原字符串
		String s1 = "ABC";
		String s2 = s1.trim();
		System.out.println(s1==s2); 
		String s3 = " ABC ";
		String s4 = s3.trim();
		System.out.println(s3==s4); 
	}
}








