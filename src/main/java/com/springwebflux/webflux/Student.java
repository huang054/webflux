package com.springwebflux.webflux;

/**
 * @author huangjun
 * @version V1.0
 * @Description: TODO
 * @Date Create in 16:32 2019/09/16
 */
public class Student {
    String firstName;

    String lastName;

    Double grade;

    Double feeDiscount = 0.0;

    Double baseFee = 20000.0;

    public Student(String firstName, String lastName, Double grade) {

        this.firstName = firstName;

        this.lastName = lastName;

        this.grade = grade;

    }

    public void printFee(){

        Double newFee = baseFee - ((baseFee * feeDiscount) / 100);

        System.out.println("The fee after discount: " + newFee);

    }

}
