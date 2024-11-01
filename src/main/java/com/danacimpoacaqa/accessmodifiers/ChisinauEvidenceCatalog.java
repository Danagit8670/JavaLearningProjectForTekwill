package com.danacimpoacaqa.accessmodifiers;

import com.danacimpoacaqa.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person ion001 = new Person("Ion","Busuioc",546245);

        System.out.println(ion001.firstName);
        System.out.println(ion001.getAge());


        Person dana001 = new Person("Dana", "Cimpoaca", 598765, 19, false);

        System.out.println(dana001.getAge());

        Person person = new Person("Valoare","Valoare", 59786, 524, false) ;
        System.out.println(person.getAge());

        if (ion001.isRetired){
            System.out.println(ion001.firstName + "este pensionat");
        } else {
            System.out.println(ion001.firstName + "nu este pensionat");
        }
        if (dana001.isRetired){
            System.out.println(dana001.firstName + "este pensionat");
        } else {
            System.out.println(dana001.firstName + " nu este pensionat");

        }

    }


}
