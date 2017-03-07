

import java.util.Stack;

public class InfixToPostfix {

	public static void main(String[] args) {
		
		String infix = "1+2+3-4+8";
		String postfix = "";
		Stack<Character> javaStack = new Stack<Character>(); 

		//set infix to charArray and get every character
		
		for(char ch: infix.toCharArray()){
			
			switch (ch) {
			case '+':
			case '-':	
				while(!javaStack.isEmpty()){
					char topch = javaStack.pop();
					
					//  + or - == + or - so, print  topch
 					if(topch == '+' || topch == '-'){
 						postfix = postfix + topch;
					}
				}
				//push this ch
				
				javaStack.push(ch);
				break;

			default: postfix = postfix + ch ;
				break;
			}
			
			
		}
		
		while(!javaStack.isEmpty()){
			postfix = postfix + javaStack.pop();
		}
		
		System.out.println(postfix);
	}

}
