package com.spring2.Mock.Spring2.Controller;

import com.spring2.Mock.Spring2.Entity.EmployeeEntity;
import com.spring2.Mock.Spring2.Services.EmployServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmpController {

    @Autowired
    private EmployServices employServices;

    @PostMapping("/addEmployee")
    public ResponseEntity<String> addEmp(@RequestBody EmployeeEntity employee){
        String result = employServices.addEmployee(employee);
        return new ResponseEntity<>(result, HttpStatus.CREATED);
    }

    @GetMapping("/findById")
    public ResponseEntity findEmpById(@RequestParam ("empId") Integer empId) throws Exception {
       try{
           EmployeeEntity employee = employServices.findEmployeeById(empId);
           return  new ResponseEntity<>(employee, HttpStatus.OK);
       }catch(Exception e){
           return new ResponseEntity(e.getMessage(), HttpStatus.BAD_REQUEST);
       }



    }

}
