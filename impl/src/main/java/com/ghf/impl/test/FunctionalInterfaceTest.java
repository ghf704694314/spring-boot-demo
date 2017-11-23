package com.ghf.impl.test;

import java.util.function.Predicate;

/**
 * com.ghf.impl.test
 *
 * @Author : Gaohf
 * @Description :
 * @Date : 2017/11/22
 */
public class FunctionalInterfaceTest implements Predicate<Long>{

    public static void main(String[] args) {
//        Predicate p=new FunctionalInterfaceTest();
//        System.out.println(p.test(6L));
        Predicate<Long> p=aLong -> aLong>2;
        System.out.println(p.test(6L));
    }

    @Override
    public boolean test(Long l) {
        return l>7;
    }

}
