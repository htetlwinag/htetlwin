package com.base.response.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.base.response.constant.GlobalConstant;
import com.base.response.entity.Student;
import com.base.response.response.BaseResponse;
import com.base.response.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@GetMapping (value = "/studentlist")
	public BaseResponse getStudent() {
		List<Student> students=studentService.getStudent();
		return BaseResponse(GlobalConstant.SUCCESS , students ,GlobalConstant.Message.SUCCESS_MES); 
	}

	private BaseResponse BaseResponse(int success, List<Student> students, String successMes) {
		// TODO Auto-generated method stub
		return null;
	}
}
