package cn.misection.dbstudy.entity;

import java.util.ArrayList;
import java.util.List;

public class Parent {

    public static void main(String[] args) {
        List<String> stringArrayList = new ArrayList<String>();
        List<Integer> integerArrayList = new ArrayList<Integer>();

        Class classStringArrayList = stringArrayList.getClass();
        Class classIntegerArrayList = integerArrayList.getClass();

        if(classStringArrayList.equals(classIntegerArrayList)){
            System.out.println("类型相同");
            System.out.println(classIntegerArrayList.toString());
        }
    }
}
