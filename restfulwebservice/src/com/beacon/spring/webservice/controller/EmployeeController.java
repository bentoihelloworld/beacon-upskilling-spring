package com.beacon.spring.webservice.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.DataFormatException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.beacon.spring.webservice.model.Employee;

@Controller
public class EmployeeController {
	
	private List<Employee> listEmployee ;
	
	public EmployeeController() {
		listEmployee = new ArrayList<Employee>();
	}

	
	@RequestMapping(value="/employee/dummy/one", 
			produces= {"application/json","application/xml"})
	public @ResponseBody Employee getEmployee() {
		return new Employee("melvin.a.villamor","melvin","team lead");
	}
	
	@RequestMapping(value="/employee/create", method= RequestMethod.POST)
	public @ResponseBody void addNewEmployee(@RequestBody Employee emp) {
		listEmployee.add(emp);
	}
	
	@RequestMapping("/employee/list/all")
	public @ResponseBody List<Employee> getAllListOfEmployee(){
		return listEmployee;
	}
	
	@RequestMapping("/dataformat")
	public @ResponseBody String throwDataFormatException() throws DataFormatException {
		throw new DataFormatException("This is my Data format exception");
	}
	
	
	@ExceptionHandler(DataFormatException.class)
	@ResponseStatus(value= HttpStatus.NOT_ACCEPTABLE, 
	reason = "date format error occurred!!")
	public void catchDateFormatException(DataFormatException ex, 
			HttpServletResponse response) {
		System.err.println("Handling DateFormatExcepion " + 
			ex.getClass().getSimpleName());
	}
	
	
}
