package com.bilgeadam.iocconfigwithannotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Mario implements IRunable {
    public void up(){
        System.out.println("Zıpla");
    }
    public void down(){
        System.out.println("Bir deliğe gir");

    }
    public void left(){
        System.out.println("Geri Don");

    }
    public void right(){
        System.out.println("Hızlan");

    }
}
