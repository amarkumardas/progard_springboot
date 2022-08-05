package com.example.EmployeeSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
//    @GetMapping("/employee/{name}/{age}/{city}")
//    public Employee employeeDetails(@PathVariable("name") String name,@PathVariable("age") String age,@PathVariable("city") String city){
//        return new Employee(name,age,city);
//    }
    @GetMapping("/employee")
    public Employee employeeDetails(@RequestParam("name") String name, @RequestParam("age") String age, @RequestParam("city") String city){
        return new Employee(name,age,city);
    }
}
