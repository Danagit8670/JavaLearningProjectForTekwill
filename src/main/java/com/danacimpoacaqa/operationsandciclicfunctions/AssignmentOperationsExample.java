package com.danacimpoacaqa.operationsandciclicfunctions;

public class AssignmentOperationsExample {
    public static void main(String[] args) {

        int a = 3;
        int b = 8;

        int c = a;
        System.out.println("Atribuire simpla: " + c);

        a += c;
        // a = a + c;
        System.out.println("Atribuire cu adunare:" + a);

        a -= b;
        // a = a -b
        System.out.println("Atribuire cu scadere:" + a);

        a =-b;
        //a = -b;

        a *= c ;
        // a = a * c;
        System.out.println("Atribuire cu imultire" + a);

        a /=a;
        // a = a/a;
        System.out.println("Atribuire cu impartire:" + a);

        a %= b;

        // a = a % b;
        System.out.println("Atribuire cu restul impartirii:" + a);
    }
}
