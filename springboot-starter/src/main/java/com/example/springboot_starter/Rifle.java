package com.example.springboot_starter;

import org.springframework.stereotype.Component;
//component is simpler to use than beans
@Component
//can add scope annotation to make it non-signleton (init more than one)
public class Rifle implements Weapon {
    @Override
    public void fire() {
        System.out.println("dor");
    }
}
