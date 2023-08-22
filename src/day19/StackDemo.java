package day19;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("John");
		stack.push("Mary");
		stack.push("Jack");
		System.out.println(stack);
		
		// 利用迴圈依序拿出
		while (!stack.isEmpty()) { // 判斷容器是否是空的
			String name = stack.pop();
			System.out.printf("取出: %s\n", name);
			System.out.println(stack);
		}

	}

}
