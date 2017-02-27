package com.company.temp;

/**
 * Created by clouway on 22.02.17.
 */
public class App {

    public static void main(String[] args) {
        MyTargetClass targetClass = new MyTargetClass();
        try {
            targetClass.myMethod();
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
    }
}
