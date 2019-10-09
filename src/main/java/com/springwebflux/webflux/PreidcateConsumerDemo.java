package com.springwebflux.webflux;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

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

    public static  Student test(Student student,Function<Student,Student> function, Predicate<Student> predicate){
        if (predicate.test(student)){
          student= function.apply(student);

        }
        return student;
    }

    public static String test(int i,Function<Integer,String> function){
        return function.apply(i);
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

        Student student3 = new Student("Rajat","Verma", 8.0);

        student3=test(student3, student -> {
            student.feeDiscount=10.0;
            return student;
        }, student -> student.grade>=8);
        student3.printFee();
        student3=test(student3, student -> new Student("Rajat","Verma", 8.0), student -> student.grade>=8);
      student3.printFee();
      System.out.println(test(2, integer -> integer+"b"));
     List<String> list1= Arrays.asList("lilei","hanmeimei","zhou","li");
       List<String> list2 = list1.stream().filter(s -> s.length() > 5).collect(Collectors.toList());
        List<String> list3=list1.stream().map(s -> s+"haha").collect(Collectors.toList());
        List<String> list4=map(list1,s->s+"haha");
        List<String> list5=map1(list1,s -> s=s+"haha");
        System.out.println(list3);
       System.out.println(list4);
        System.out.println(list2);
        System.out.println(list5);
        List<String> list= new ArrayList<>();
        list.add("lilei");
        list.add("hanmeimei");
        list.add("zhou");
        list.add("li");
      list=filter(list,integer -> integer.length()>5);
      System.out.println(list);
    }

   public static List<String> filter(List<String> list, Predicate<String> predicate ){
       Iterator<String> iteratorIterator= list.iterator();

       while (iteratorIterator.hasNext()){

           String i=iteratorIterator.next();
           if (predicate.negate().test(i)){
               iteratorIterator.remove();
           }
       }
       return list;
   }
    public static List<String> map(List<String> list, Function<Object,String> function ){
       for (int i=0;i<list.size();i++){
           list.set(i,function.apply(list.get(i)));
       }
        return list;
    }

    public static List<String> map1(List<String> list, Consumer<String> consumer){
        for (int i=0;i<list.size();i++){
           consumer.accept(list.get(i));
        }
        return list;
    }
}
