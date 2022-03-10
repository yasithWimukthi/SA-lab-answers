package com.lab.exercise3;

public class Main {

    public static void main(String[] args) {
	    Query query1 = new QueryBuilder().select("name").from("students").build();
        System.out.println(query1.toString());
        Query query2 = new QueryBuilder().select("name").from("students").where("name = name1").build();
        System.out.println(query2.toString());
        Query query3 = new QueryBuilder().select("name").where("name = name1").build();
        System.out.println(query3.toString());
    }
}
