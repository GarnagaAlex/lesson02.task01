/*
 * Copyright (C) 2020 ;)
 */

package com.garnagaaa.lesson02.task01.app3;

/**
 * @author Aleksei Garnaga
 */

// Пользовательский варианта исключения
public class MyException extends Exception {
    /**
     * @param message - Сообщение об ошибке
     */
    public MyException(String message) {
        super(message);
    }
}