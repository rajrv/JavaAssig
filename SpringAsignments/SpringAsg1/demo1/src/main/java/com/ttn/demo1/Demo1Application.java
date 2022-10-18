package com.ttn.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Demo1Application
{

	public static void main(String[] args) {


		ApplicationContext applicationContext = SpringApplication.run(Demo1Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		boolean result = binarySearch.binarySearch(new int[]{2,8,3,-18,5},2);
		if(result==true)
			System.out.println("Number is present");
		else
			System.out.println("Number is not present");

		System.out.println(applicationContext.getBean(BinarySearchImpl.class));
	}

}
