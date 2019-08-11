package cn.com.study;

public class StringTest {

	public static void main(String[] args) {
		System.out.println(new StringTest().getPointCount("9.7.2"));
	}

	private int getPointCount(String string) {
		int j = 0;
		while (string.indexOf(".") != -1) {
			string = string.substring(string.indexOf(".") + 1);
			j++;
		}
		return j;
	}
}
