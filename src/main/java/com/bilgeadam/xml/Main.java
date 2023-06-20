package com.bilgeadam.xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
    1-mario bir sınıfımız olsun içinde 4 adet metot bulundursun
    -up()- Zıpla
    -down()-bir deliğe gir
    -left()-geri don
    -right()-hızlan
    gameRunner diye bir sınıf yaratacağız bu sınıfta bir run metodumuz olsun
    bu run metodu mario sınıfndaki 4 metodu sırayla calıstırsın
 */
public class Main {


    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
//        GameRunner gameRunner=new GameRunner(context.getBean("mygame", IRunable.class));
//        gameRunner.run();
        GameRunner gameRunner=context.getBean("gamerunner", GameRunner.class);
        gameRunner.run();
        GameRunner gameRunner2=context.getBean("gamerunner", GameRunner.class);
        gameRunner2.run();
    }
}
