package com.springwebflux;

import java.util.function.Function;

/**
 * @author huangjun
 * @version V1.0
 * @Description: TODO
 * @Date Create in 16:20 2019/09/16
 */
public class FunctionDemo {
/**
　　* @description: TODO
　　* @param ${valueToBeOperated}
　　* @return  @link void
　　* @throws
　　* @author huangjun
　　* @date 2019/9/16 16:22
　　*/
    static void modifyTheValue(int valueToBeOperated, Function<Integer, Integer> function){

        int newValue=function.apply(valueToBeOperated);
        System.out.println(newValue);

    }

    public static void main(String[] args) {
        int incr = 20;  int myNumber = 10;

        modifyTheValue(myNumber, val-> val + incr);

        myNumber = 15;
        modifyTheValue(myNumber, val-> val * 10);

        modifyTheValue(myNumber, val-> val - 100);

        modifyTheValue(myNumber, val-> "somestring".length() + val - 100);

    }
    }
