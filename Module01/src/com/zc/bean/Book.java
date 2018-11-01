package com.zc.bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zc
 * @date 2018/11/1 - 10:14
 *
 */


public class Book extends Customer{

    public Book() {

        System.out.println("显示结构的");
    }

    @Override
    public String toString() {
        return "Book{}";
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        int num=10;

    }
    public void method(){
        ArrayList list=new ArrayList();
        Map map=new HashMap();
    }

    @Override
    public void  eat() {
        System.out.println("客户在吃饭");
    }
}
