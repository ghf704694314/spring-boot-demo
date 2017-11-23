package com.ghf.impl.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * ghf.demo.entity
 *
 * @Author : Gaohf
 * @Description :
 * @Date : 2017/11/14
 */
@Entity
@Table(name = "user")
public class User{

    @Id
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
//        new ArrayList<String>().parallelStream().forEachOrdered(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                 s.equals("A");
//            }
//        });
//        new ArrayList<String>().parallelStream().forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//
//            }
//        });
//
//        new ArrayList<String>().stream().filter(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                return false;
//            }
//        });
    }


}
