//读入n名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。
//
//        输入格式：每个测试输入包含1个测试用例，格式为
//
//        第1行：正整数n
//        第2行：第1个学生的姓名 学号 成绩
//        第3行：第2个学生的姓名 学号 成绩
//        ... ... ...
//        第n+1行：第n个学生的姓名 学号 成绩
//        其中姓名和学号均为不超过10个字符的字符串，成绩为0到100之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。
//        输出格式：对每个测试用例输出2行，第1行是成绩最高学生的姓名和学号，第2行是成绩最低学生的姓名和学号，字符串间有1空格。
//
//        输入样例：
//        3
//        Joe Math990112 89
//        Mike CS991301 100
//        Mary EE990830 95
//        输出样例：
//        Mike CS991301
//        Joe Math990112
package PATbasic;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * Created by Betafringe on 2017/10/23.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Test03  {
    public static void main(String[] args) {
        List<Student> stds = new ArrayList<Student>();
        Scanner input = new Scanner(System.in);
        int num = Integer.parseInt(input.nextLine());
        while(num>0){
            String str = input.nextLine();
            //System.out.println(str);
            String[] temp = str.split(" ");
            Student std = new Student();
            std.name = temp[0];
            std.stuId = temp[1];
            std.score = Integer.parseInt(temp[2]);
            stds.add(std);
            num--;
        }
        Collections.sort(stds);
        System.out.println(stds.get(0).name+" "+stds.get(0).stuId);
        System.out.println(stds.get(stds.size()-1).name+" "+stds.get(stds.size()-1).stuId);
    }

}
class  Student implements Comparable<Student>{
    String name;
    String stuId;
    int score;
    @Override
    public String toString() {
        return "Student [name=" + name + ", stuId=" + stuId + ", score=" + score + "]";
    }
    @Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return -(score-o.score);
    }

}