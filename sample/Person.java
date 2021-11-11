package sample;

/* 
 * 21JN0110 加藤嵩大
 * 
*/

public class Person{
    private String name,type;

    Person(String name, String type){
        this.name = name;
        this.type = type;
    }

    String getName(){
        return name;
    }


    String getType(){
        return type;
    }
}