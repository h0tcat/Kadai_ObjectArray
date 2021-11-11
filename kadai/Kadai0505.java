/*
*
*    21JN0110 加藤嵩大
*    
*/

package kadai;

import java.util.Scanner;

public class Kadai0505 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Salary[] salaries = new Salary[3];

        for(int i = 0; i < salaries.length; i++){
            System.out.print("Number --> ");
            String number = scan.next();
            System.out.print("Name --> ");
            String name = scan.next();
            System.out.print("Academic --> ");
            int academic = scan.nextInt();

            System.out.print("ExYear --> ");
            int exYear = scan.nextInt();
            System.out.print("OverTime --> ");
            int overTime = scan.nextInt();
            
            System.out.println();
            salaries[i] = new Salary(number, name, academic, exYear, overTime);
        }
        
        for(Salary salary : salaries){
            salary.printPaySlip();
        }

        scan.close();
    }    
}
