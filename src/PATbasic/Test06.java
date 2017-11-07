package PATbasic;

import java.util.Scanner;

/**
 * Created by Betafringe on 2017/11/7.
 */
public class Test06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] school = new int[n+1];
        int maxindex = 1;
        for (int i=0; i<n; i++){
            int index = scanner.nextInt();
            school[index] += scanner.nextInt();
            if (school[maxindex] < school[index]){
                maxindex = index;
            }
        }
        scanner.close();
        System.out.println(maxindex + " " + school[maxindex]);
    }
}
