package com.priv.pratices.chapter11;
import com.priv.util.Stack;
/**
 * 使用com.priv.util.Stack对下面表达式进行求值，其中'+'表示进栈，
 * ‘-’表示出栈。
 * 表达式：“+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---”
 */
public class Test15 {
    public static String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---";
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++) {
            switch(str.toCharArray()[i]) {
                case '+':
                    stack.push(str.toCharArray()[i+1]);
                    i++;
                    break;
                case '-':
                    System.out.print(stack.pop());
                    break;
                default:
                    break;
            }
        }
        System.out.println();
        while(!stack.empty())
            System.out.print(stack.pop() + " ");
    }
}
