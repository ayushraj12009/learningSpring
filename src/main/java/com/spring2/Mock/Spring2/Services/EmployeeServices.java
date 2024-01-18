//package com.spring2.Mock.Spring2.Services;
//
//import com.spring2.Mock.Spring2.Entity.Boss;
//import com.spring2.Mock.Spring2.Entity.Employee;
//import com.spring2.Mock.Spring2.Repository.BossRepo;
//import com.spring2.Mock.Spring2.Repository.EmployeeRepo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//@Service
//public class EmployeeServices {
//
//    @Autowired
//    private EmployeeRepo employeeRepo;
//
//    @Autowired
//    private BossRepo bossrepo;
//
//    public Employee addEmployee(Employee employee){
//        return employeeRepo.save(employee);
//    }
//
//    public List<Employee> finddAllEmploy(){
//        return employeeRepo.findAll();
//    }
//
//    public Employee getById(Long emp_Id){
//        Optional<Employee> OptionalEmploy = employeeRepo.findById(emp_Id);
//        return OptionalEmploy.get();
//    }
//
//
//
//    public Employee addBossToEmploy(Long empId, Long boss_Id){
//
//        Optional<Employee> employee = employeeRepo.findById(empId);
//        Optional<Boss> boss1 = bossrepo.findById(boss_Id);
//
//        Employee employ1  = employee.get();
//        Boss boss = boss1.get();
//        employ1.setBoss(boss);
//
//        employeeRepo.save(employ1);
//        return employ1;
//
//    }
//
//    public void deleteEmploy(Long emp_Id){
//        employeeRepo.deleteById(emp_Id);
//    }
//
//}
