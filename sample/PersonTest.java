
/* 
 * 21JN0110 加藤嵩大
 * 
*/
package sample;

import java.util.Scanner;

public class PersonTest{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Person[] person = new Person[4];

        for (int i = 0; i < person.length; i++){
            System.out.print("Name --> ");
            String name = sc.next();

            System.out.print("Type --> ");
            String type = sc.next();

            person[i] = new Person(name, type);
        }

        System.out.println();
        for (int i = 0; i < person.length; i++){
            System.out.println(person[i].getName() + "\t" + person[i].getType());
        }

        sc.close();
    }
}