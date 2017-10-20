//1002. 写出这个数 (20)
//
//        时间限制
//        400 ms
//        内存限制
//        65536 kB
//        代码长度限制
//        8000 B
//        判题程序
//        Standard
//        作者
//        CHEN, Yue
//        读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。
//
//        输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10100。
//
//        输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。
//
//        输入样例：
//        1234567890987654321123456789
//        输出样例：
//        yi san wu
package PATbasic;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Betafringe on 2017/10/17.
 */
public class Test02 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String input = s.nextLine();
        int sum = 0;
        for (int i=0; i<input.length(); i++)
        {
            sum += (int) input.charAt(i) - '0';
//            System.out.println(input.charAt(i));
        }
    Stack<String> stack = new Stack<>();
        do {
            int unit;
            unit = sum % 10;
            System.out.println(unit);
            switch (unit)
            {
                case 0:
                    stack.push("ling");
                    break;
                case 1:
                    stack.push("yi");
                    break;
                case 2:
                    stack.push("er");
                    break;
                case 3:
                    stack.push("san");
                    break;
                case 4:
                    stack.push("si");
                    break;
                case 5:
                    stack.push("wu");
                    break;
                case 6:
                    stack.push("liu");
                    break;
                case 7:
                    stack.push("qi");
                    break;
                case 8:
                    stack.push("ba");
                    break;
                case 9:
                    stack.push("jiu");
                    break;
            }
            sum /= 10;
        }while (sum != 0);
        System.out.print(stack.pop());
        while (!stack.isEmpty()) {
            System.out.print(" " + stack.pop());
        }
    }
}
