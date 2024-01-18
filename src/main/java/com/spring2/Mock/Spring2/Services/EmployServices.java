package com.spring2.Mock.Spring2.Services;

import com.spring2.Mock.Spring2.Entity.EmployeeEntity;
import com.spring2.Mock.Spring2.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployServices {

    @Autowired
    private EmployeeRepository employeeRepository;

    public String addEmployee(EmployeeEntity employee){
        EmployeeEntity employe = employeeRepository.save(employee);

        return "Employe Details has beensaved to DB with Employ id " + employe.getEmp_id();
    }

    public EmployeeEntity findEmployeeById(Integer empId) throws Exception{
        Optional<EmployeeEntity> optionEmp = employeeRepository.findById(empId);

        if(optionEmp.isEmpty()){
            throw  new Exception("Invalid Employ Id ");
        }

        EmployeeEntity empDetails = optionEmp.get();
        return empDetails;
    }

    public String deleteEmploy(Integer empId){
        employeeRepository.deleteById(empId);
        return "Employ Details has been deleted";
    }
}
