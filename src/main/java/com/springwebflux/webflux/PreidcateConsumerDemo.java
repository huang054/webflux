package com.springwebflux.webflux;

import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author huangjun
 * @version V1.0
 * @Description: TODO
 * @Date Create in 16:33 2019/09/16
 */
public class PreidcateConsumerDemo {
    public static Student updateStudentFee(Student student, Predicate<Student> predicate, Consumer<Student> consumer){

        if ( predicate.test(student)){

            consumer.accept(student);

        }

        return student;

    }
    public static void main(String[] args) {

        Student student1 = new Student("Ashok","Kumar", 7.5);

        student1 = updateStudentFee(student1,

                //Lambda expression for Predicate interface

                student -> student.grade > 8.5,

                //Lambda expression for Consumer inerface

                student -> student.feeDiscount = 30.0);

        student1.printFee();

        Student student2 = new Student("Rajat","Verma", 8.0);

        student2 = updateStudentFee(student2,

                student -> student.grade >= 8,

                student -> student.feeDiscount = 20.0);

        student2.printFee();

    }


}
