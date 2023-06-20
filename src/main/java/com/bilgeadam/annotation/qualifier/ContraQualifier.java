package com.bilgeadam.annotation.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
    up->yukarı
    down->eğil
    left ->geri git
    right-> ateş et
 */
@Component
@Qualifier("contra")
public class ContraQualifier implements IRunableQualifier {
    @Override
    public void up() {
        System.out.println("yukari");
    }

    @Override
    public void down() {
        System.out.println("egil");
    }

    @Override
    public void left() {
        System.out.println("geri git");
    }

    @Override
    public void right() {
        System.out.println("ates et");
    }
}
