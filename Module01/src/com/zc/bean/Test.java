package com.zc.bean;

import java.util.ArrayList;

/**
 * @author zc
 * @date 2018/11/1 - 16:52
 *IDEA中代码模板所处的位置 setting -Editor
 */
public class Test {
    //模板六：prsf  private static final
    private static final int a =0;
    //变形 psf
    public static final Student STUDENT=new Student();
    //psfi   int 类型
    //psfs   String 类型

    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("hello");
        //变形：soup 输出方法的形参
        System.out.println("args = [" + args + "]");
        //soutm
        System.out.println("Test.main");
        //soutv 打印变量的值  最近位置匹配
        System.out.println("args = " + args);


        //模板三：fori
        String[] arr=new String[]{"Tom","HanMeiMei"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr);

        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }

        //模板四：list.for
        ArrayList list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(527);

        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr  倒序迭代
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }
        //list.for
        for(Object b:list){

        }

        //模板五：ifn
        ArrayList list2=new ArrayList();
        if (list2 == null) {
        }
        //变形:inn
        if (list2 != null) {
            
        }
        //变形：xxx.null xxx.nn
        if (list == null) {

        }
        //





    }


}
