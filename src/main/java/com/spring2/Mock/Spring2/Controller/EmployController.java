//package com.spring2.Mock.Spring2.Controller;
//
//import com.spring2.Mock.Spring2.Entity.Employee;
//import com.spring2.Mock.Spring2.Services.EmployeeServices;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//public class EmployController {
//
//    @Autowired
//    private EmployeeServices employeeServices;
//
//    @PostMapping("/addemploytodb")
//    public String addEmploye(@RequestBody Employee employee ){
//        Employee result = employeeServices.addEmployee(employee);
//
//        return "Employ Details has been added successfully" + result;
//    }
//    @GetMapping("/getDetailsofEmploy/{emp_id}")
//    public String getEmploy(@PathVariable Long emp_id){
//        Employee EmpDetails = employeeServices.getById(emp_id);
//
//        return "This is the Employee Details that your are looking for" +EmpDetails;
//
//    }
//}
