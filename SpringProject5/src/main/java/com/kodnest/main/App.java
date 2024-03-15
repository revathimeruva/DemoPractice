package com.kodnest.main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.kodnest.bean.Trainer;
import com.kodnest.bean.University;


public class App {
		public static void main(String[] args) {
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
			University u1=(University)context.getBean("u1");
			System.out.println(u1);
			
			Trainer t1=(Trainer)context.getBean("t1");
			System.out.println(t1);
			
		}

}
