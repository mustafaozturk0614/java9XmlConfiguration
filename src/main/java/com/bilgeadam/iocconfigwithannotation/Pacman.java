package com.bilgeadam.iocconfigwithannotation;

/*

    up->yukarı
    down->aşaği
    left ->sola
    right-> sağa
 */

import org.springframework.stereotype.Component;

@Component

public class Pacman implements IRunable {

    @Override
    public void up() {
        System.out.println("yukari");
    }

    @Override
    public void down() {
        System.out.println("asagi");
    }

    @Override
    public void left() {
        System.out.println("sola");
    }

    @Override
    public void right() {
        System.out.println("sağa");
    }
}
