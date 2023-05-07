//Answer to Question No.2

package com.gl.dsa.lab2.question1;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBracketsImplementation {

	static boolean justLettersorNumbers = false;

	private boolean BalancedOrNot(String brackets) {

		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < brackets.length(); i++) {

			char s = brackets.charAt(i);

			if (s == '(' || s == '{' || s == '[' || s == ']' || s == '}' || s == ')') {
				justLettersorNumbers = false;
				if (s == '(' || s == '{' || s == '[') {

					stack.push(s);
					continue;
				}

				if (stack.isEmpty()) {
					return false;
				}
				char poppedBracket;

				switch (s) {
				case '}':
					poppedBracket = stack.pop();
					if (poppedBracket == '[' || poppedBracket == '(') {
						return false;
					}
					break;
				case ']':
					poppedBracket = stack.pop();
					if (poppedBracket == '{' || poppedBracket == '(')
						return false;
					break;
				case ')':
					poppedBracket = stack.pop();
					if (poppedBracket == '{' || poppedBracket == '[')
						return false;
					break;
				}
			} else {
				justLettersorNumbers = true;
				continue;
			}
		}

		return (stack.isEmpty());

	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the series of brackets to check if they are balanced or not: ");
		String expression = input.next();
		BalancedBracketsImplementation obj = new BalancedBracketsImplementation();
		boolean status = obj.BalancedOrNot(expression);
		if (justLettersorNumbers) {
			System.out.println("Please enter a valid string WITH brackets to evaluate if balanced or not!");
		}
		if (status == true && justLettersorNumbers == false) {
			System.out.println("The entered String has Balanced Brackets!");
		} else if (status == false && justLettersorNumbers == false) {
			System.out.println("The entered Strings do not contain Balanced Brackets!");
		}
		input.close();
	}
}
