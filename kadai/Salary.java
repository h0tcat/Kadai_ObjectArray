/*
*
*    21JN0110 加藤嵩大
*    
*/
package kadai;

public class Salary {

    private String number, name;
    
    private int academic, exYear;
    private int overTime;

    private static int[] baseSalaryTable = {231000, 212000, 187000, 165000};
    private static int baseOverTimePay = 1200;

    Salary(String number, String name, int academic, int exYear, int overTime){
        this.number = number;
        this.name = name;

        this.academic = academic;
        this.exYear = exYear;
        this.overTime = overTime;
    }

    int getBaseSalary(){
        int basicSalary = (int) (Math.round(((baseSalaryTable[academic] +(baseSalaryTable[academic]) * 0.02)) * exYear));

        return basicSalary;
    }

    int getOverTimePay(){
        return baseOverTimePay * overTime;
    }

    static int getBaseSalary(int academic){
        return baseSalaryTable[academic];
    }
    static void setBaseSalaryTable(int[] baseSalaryTable){
        Salary.baseSalaryTable = baseSalaryTable;
    }
    static void setBaseOverTimePay(int overTimePay){
        Salary.baseOverTimePay = overTimePay;
    }
    static int getBaseOverTimePay(){
        return baseOverTimePay;
    }

    void printPaySlip(){
        System.out.println("Number : " + number);
        System.out.println("Name : " + name);

        System.out.println("BaseSalary : " + baseSalaryTable[academic]);
        System.out.println("OvertimePay : " + getOverTimePay());
        
        System.out.printf("(OverTime %dH, BaseOverTimePay : \\%d)\n", overTime, baseOverTimePay);

        System.out.println("Total : " + (baseSalaryTable[academic] + getOverTimePay()));
        System.out.println();
    }
}
