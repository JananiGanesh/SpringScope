package com.greatlearning.driver;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimpl.HindiTeacher;

public class SpringDriver {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Teacher teacher = context.getBean("hindiTeacher", HindiTeacher.class);
		/*Teacher teacher2 = context.getBean("hindiTeacher", HindiTeacher.class);
		if(teacher==teacher2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		System.out.println(teacher);
		System.out.println(teacher2)*/
		System.out.println(teacher.getHomework());
		context.close();
	}

}
