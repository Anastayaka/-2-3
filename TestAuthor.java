package ru.mirea.lab2;
import java.lang.System;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Лев Толстой", "войнаимир@mail.ru", 'M');
        System.out.println(a1);
        Blogger b1 = new Blogger("Хованский", "hov@mail.ru", 'M', "khovansky_life");
        System.out.println(b1);
        b1.name = "Larin";
        System.out.println(b1);
        Student name = new Student("Nastya", 20, "123456789");
        name.say();
        High_student high_student = new High_student("Настя", 20, "12345", "GIBO0318");
        high_student.say();
    }
}
