/*
 * Copyright (C) 2020 ;)
 */

package com.garnagaaa.lesson02.task01.app3;

/**
 * @author Aleksei Garnaga
 */
public class Program {
    public static void main(String[] args) throws MyException {
        System.out.println("Hello, World!");
        // Вызов пользовательского варианта исключения
        throw new MyException("Test Exception");
    }
}