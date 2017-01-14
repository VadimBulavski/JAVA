package com.vadim;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by admin on 14.01.2017.
 */
public class Launcher {
    public static void main(String[] args){
        //вывод строк
        System.out.println("Hello world!");
        System.err.println("Hello world!");

        //вывод данных
        int x = 10;
        System.out.println("X = " + x);

        //ввод данных
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        System.out.println("X = " + x);

        //ссылка на данные
        Integer y = 10;
        System.out.println(y.toString());

        //объект
        Student student = new Student();
        student.setAge(333);
        student.setFio("Step");
        System.out.println(student);

        //массивы
        Integer[] a = new Integer[100];
        System.out.println(a.length);
        Integer[] b = a.clone();

        //лист данных
        List<Integer> integerList = new ArrayList<>();
        //ввод данных
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        //заполнение данными
        for (int i = 0; i < 100; ++i ) integerList.add(i);

        //вывод данных foreach
        for(int i: integerList) {
            System.out.println(i);
        }

        //вывод данных через лямбда - вырожения
        integerList.forEach(v->System.out.println(v));

        Map<Integer, Student> students = new HashMap<>();
        students.put(545454556, new Student(25, "AAA", Color.black));
        students.put(123456789, new Student(25, "BBB", Color.white));
        students.put(788141232, new Student(25, "CCC", Color.CYAN));
        students.put(234566878, new Student(25, "DDD", Color.YELLOW));
        students.forEach((k,v)->System.out.println(k + " : " + v + " " + v.hashCode()));

    }
}
