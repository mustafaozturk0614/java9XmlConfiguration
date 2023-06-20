package com.bilgeadam.annotation.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/*

    up->yukarı
    down->aşaği
    left ->sola
    right-> sağa
 */

@Component
@Qualifier("pacman")
public class PacmanQualifier implements IRunableQualifier {

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
