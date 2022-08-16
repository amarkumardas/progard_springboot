package com.Quess.MicroServiceDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("firstmicroserviceapp")//providing application name
public class FloatNumberInput {
    public FloatNumberInput(){//0 param constructor

    }
    public float getNum1() {
        return num1;
    }

    public FloatNumberInput(float num1, float num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    private float num1;
    private float num2;
}
