package com.example.communicationBetweenToMicroServise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//http://localhost:8090/app1/student/send
@RequestMapping("/app1")
@RestController
public class StudentController {
    @Autowired
    RestClientService restClientService;
    @GetMapping("/student/send")
    public Student save(){
        Student student=new Student();
        student.setFirstName("Amar");
        student.setLastname("das");
        return restClientService.save(student);
    }
}
