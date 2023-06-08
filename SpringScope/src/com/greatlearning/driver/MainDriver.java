package com.greatlearning.driver;

import com.greatlearning.service.Teacher;
import com.greatlearning.serviceimpl.HindiTeacher;

public class MainDriver {

	public static void main(String[] args) {
		//Create an object for Teacher
		
		Teacher teacher=new HindiTeacher();
		
		//Use the object and retrieve the homework for particular object
		System.out.println(teacher.getHomework());
		

	}

}
