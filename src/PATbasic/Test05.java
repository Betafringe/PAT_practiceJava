package PATbasic;

import java.util.ArrayList;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Comparator;
/**
 * Created by Betafringe on 2017/11/6.
 */


class Pie
{
    double num ;
    double price ;
    @Override
    public String toString() {
        return "Pie [num=" + num + ", price=" + price + "]";
    }


}

public class Test05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int typeNum= scanner.nextInt();
        double need = scanner.nextInt();
        ArrayList<Pie> pies = new ArrayList<Pie>();
        for(int i=0;i<typeNum;++i)
        {
            Pie pie = new Pie();
            pie.num =  scanner.nextDouble();
            pies.add(pie);
        }
        for(int i=0;i<typeNum;++i)
        {
            pies.get(i).price = (double)scanner.nextDouble()/pies.get(i).num;
        }
        Collections.sort(pies,new Comparator<Pie>() {


            public int compare(Pie o1, Pie o2) {

                if(o1.price>o2.price)
                    return -1;
                else if(o1.price<o2.price)
                    return 1;
                else return 0;
            }

        });
        int index = 0;
        double sum =0;
        while(need>0 && index<typeNum)
        {
            Pie pie  = pies.get(index);
            if(pie.num>need)
            {
                sum = sum+need*pie.price;
            }
            else
            {
                sum = sum+pie.num*pie.price;
            }
            need = need-pie.num;
            index++;
        }
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println(df.format(sum));

    }



}