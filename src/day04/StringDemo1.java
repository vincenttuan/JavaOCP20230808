package day04;

public class StringDemo1 {

	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		String s3 = "Java"; // 字面值宣告(會放在 String pool 中共用)
		String s4 = "Java"; // 字面值宣告(會放在 String pool 中共用)
		
		System.out.println(s1 == s2); // false
		System.out.println(s3 == s4); // true
		System.out.println(s1.equals(s2)); // true
		System.out.println(s3.equals(s4)); // true
		System.out.println(s2.equals(s3)); // true
		System.out.println(s1.equals(s4)); // true

	}

}
