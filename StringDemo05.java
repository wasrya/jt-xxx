package day01;

public class StringDemo05 {

	public static void main(String[] args) {
		/**
		 * 查找字符串  UIUC也一样
		 */
		String s = "ABC123中国在中国的位置";
		//在s中查找“中国”出现的位置
		//匹配到第一个位置就返回这个位置
		int n = s.indexOf("中国");
		System.out.println(n);
		//如果查找不到，返回-1
		n = s.indexOf("美国");
		System.out.println(n);//-1
		
		//一个重载的 indexOf方法
		// s.indexOf("字符串", 起始位置)
		// 从“起始位置”开始查找 “字符串”
		
		s = "画上荷花和尚画";
		//   0 1 2 3 4 5 6
		//查找第二个 “画”的位置
		n = s.indexOf("画", 1);
		System.out.println(n);//6
		
		//测试重载的方法：查找一个字符
		n = s.indexOf('画', 1);
		System.out.println(n);//6
		
		//自行测试：从头查找一个字符
		// indexOf(char)
		
		//lastIndexOf
		n = s.lastIndexOf('画');
		System.out.println(n); 
		n = s.lastIndexOf('和');
		System.out.println(n); 
		//经典案例：查找最后一个“点”的位置
		String url=
			"http://www.tedu.cn/index.html";
		n = url.lastIndexOf(".");
		System.out.println(n); 
	
	}

}








