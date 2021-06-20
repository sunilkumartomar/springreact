package com.springreact.springreact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

//@SpringBootApplication
public class SpringreactApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringreactApplication.class, args);
        System.out.println("Welcome to spring Application");

        long in=40l;
        long startTime = System.currentTimeMillis();
        long value=usingLoop(in);
        long endTime= System.currentTimeMillis();
        System.out.println("using loop time = "+(endTime-startTime));
        System.out.println(value);
        System.out.println("Changes for GIT");
         startTime = System.currentTimeMillis();
         value=recursion(in);
         endTime= System.currentTimeMillis();
        System.out.println("recursion time = "+(endTime-startTime));
        System.out.println(value);


    }
    public static long recursion(long recurValue){

        if(recurValue<2)
            return recurValue;
        else
            return recursion(recurValue -1)+recursion(recurValue-2);
    }


    public static long usingLoop(long recurValue){
        long sum = recurValue;
        if(recurValue<2)
            return recurValue;
        else{
            long a=0;long b=1;

            for (int i=2;i<=recurValue;i++){
                sum = a+b;
                a = b;
                b=sum;
            }
            return sum;
        }
    }
}
