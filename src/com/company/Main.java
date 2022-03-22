package com.company;

import com.company.classes.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
	/*
	Сандар массивин түзүңүз. Стримдеги элементерди бири бирине кобойтуп (а * а) көрсөтүңүз.
	 */
        int[] numbers = {1,2,3,4,5,6,8,9,10};
        Arrays.stream(numbers).forEach(a-> System.out.println(a*a));
        Stream.of(1,2,3,4,5).forEach(a-> System.out.println(a*a));

    /*
     1.Стримдин ар бир элементинен 10% алышыңыз керек
     */

        double[] numbers2 = {100,90,80,70,60};
        int[] numbers3 = {100,90,80,70,60};
        Arrays.stream(numbers2).map(x->(x*0.1)).forEach(System.out::println);
        Arrays.stream(numbers3).mapToDouble(x->(x*0.1)).forEach(System.out::println);

    /*
    Студент класс түзүүнуз (ID, FIO). Стримден фамилиялардын тизмесин алыңыз.
     */
        Student student1 = new Student(1,"Spider Man",95);
        Student student2 = new Student(2,"John Doe",80);
        Student student3 = new Student(3,"Peter Parker",65);

        Student [] students = {student1,student2,student3};
        Arrays.stream(students).map(Student::getId).forEach(System.out::println);
        Arrays.stream(students).map(x->x.getExamGrade()).forEach(x-> System.out.println(x));

        System.out.println("--------------------------------");

        ArrayList<Student> studentArrayList = new ArrayList<>();
        studentArrayList.add(new Student(4,"Serhio Ramos",95));
        studentArrayList.add(new Student(5,"Grant Xaka",80));
        studentArrayList.add(new Student(6,"Pascal Nouma",40));
        studentArrayList.stream().map(Student::getName).forEach(System.out::println);

    /*
    Тизмедеги ар бир саптын көчүрмөсүн кайталаңыз (Оля, Юлия)->(ОляОля, ЮляЮля)
     */
        studentArrayList.stream().map(x->x.getName()+x.getName()).forEach(x-> System.out.println(x));
        studentArrayList.stream().map(x->x.getName()).map(x->x+x).forEach(x-> System.out.println(x));
        studentArrayList.stream().forEach(x-> System.out.println(x.getName()+x.getName()));
        studentArrayList.forEach(x-> System.out.println(x.getName()+x.getName())); //kilsa bolot deyt intellijidea

    /*
    Экзамендик упайлары >= 80 бар студенттердин тизмесиналыңыз
     */
        long otlichnikterdinSany =studentArrayList.stream().filter(x->x.getExamGrade()>=80).count();
        System.out.println(otlichnikterdinSany);

    /*
     Экзаменден отпой калган студенттердин санын эсептениз.
     */

        long failderdinSany =studentArrayList.stream().filter(x->x.getExamGrade()<50).count();
        System.out.println(failderdinSany);
    }
}
