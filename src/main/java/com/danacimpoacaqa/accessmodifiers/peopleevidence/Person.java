package com.danacimpoacaqa.accessmodifiers.peopleevidence;

public class Person {

    public static boolean isHuman;

    public String firstName;

    protected String lastName;

    int id;

    private int age;

    public boolean isRetired;

    public Person(String firstName,String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id =id;

    }

public Person(String firstName,String lastName, int id, int age, boolean isRetired){

    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;

    if (age > 0 && age <100){
        this.age = age;
    } else {
        System.out.println("The entered age it not valid, the property age is still emp");
        this.age = age;
        this.isRetired = isRetired;
    }
}
public void setAge(int enteredAge){
        if (enteredAge > 0 && enteredAge <100){
            this.age = enteredAge;
        } else {
            System.out.println("The entered age it not valid, the property age is still empty");

        }
}
public int getAge(){
        return this.age;

}
public void printRetirementStatus(){
        if (isRetired){
            System.out.println(firstName + "este la pensie");
        } else {
            System.out.println(firstName + "nu este pensionat");
        }
}
}





