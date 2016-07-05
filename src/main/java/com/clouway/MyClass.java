package com.clouway;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import java.util.Scanner;

public class MyClass {

    public static Logger log = Logger.getLogger(MyClass.class);

    public static void main(String[] args){
        BasicConfigurator.configure();
        Sumator sumator = new Sumator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the numbers you want to sum:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int answer = sumator.sumInt(a,b);
        System.out.println("The answer is: " + answer);

        log.info("Sumator was called with " + a + ", " + b + " and the answer is: " + answer);
    }
}
