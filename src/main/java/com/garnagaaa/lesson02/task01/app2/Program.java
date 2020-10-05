/*
 * Copyright (C) 2020 ;)
 */

package com.garnagaaa.lesson02.task01.app2;

/**
 * @author Aleksei Garnaga
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Object[] arrobj = new Object[0];
        // Моделирование исключения «ArrayIndexOutOfBoundsException»
        System.out.println(arrobj[1].hashCode());
    }
}