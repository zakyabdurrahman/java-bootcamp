package com.example.springboot_starter;

import org.springframework.stereotype.Component;

@Component
public class MachineGun implements Weapon{
    @Override
    public void fire() {
        System.out.println("dor dor dor dor");
    }
}
