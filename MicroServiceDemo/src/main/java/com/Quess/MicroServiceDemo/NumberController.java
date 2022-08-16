package com.Quess.MicroServiceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
    @Autowired
    private FloatNumberInput floatNumberInput;
@GetMapping("/num")
    public FloatNumberInput retrieveNames(){
    return new FloatNumberInput(floatNumberInput.getNum1(),floatNumberInput.getNum2());
    }
}
