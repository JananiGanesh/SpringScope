package com.greatlearning.serviceimpl;

import com.greatlearning.service.Teacher;

public class HindiTeacher implements Teacher {

	@Override
	public String getHomework() {
		// TODO Auto-generated method stub
		return "Do Hindhi writing all the swars";
	}
	public void doInitialJob() {
		System.out.println("Under the initial method");
	}
	public void doFinalJob() {
		System.out.println("Under the final method");
	}

}
