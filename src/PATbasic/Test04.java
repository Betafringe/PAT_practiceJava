package PATbasic;
//1011. A+B和C (15)

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by Betafringe on 2017/10/23.
 */
public class Test04 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        BigInteger[][] matrix = new BigInteger[number][3];
        for(int i=0; i<number; i++)
        {
            for(int j=0; j<3; j++)
            {
                matrix[i][j] = new BigInteger(in.next());
            }
        }
        in.close();

        for (int i=0; i<number; i++)
        {
            System.out.println("Case #" + (i + 1) + ": " + (matrix[i][0].add(matrix[i][1]).compareTo(matrix[i][2]) == 1));
        }
    }

}
