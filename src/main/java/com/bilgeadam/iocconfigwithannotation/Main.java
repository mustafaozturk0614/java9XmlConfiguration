package com.bilgeadam.iocconfigwithannotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(IocConfig.class);

//        IRunable game=context.getBean(IRunable.class);
//
//        IRunable game2=context.getBean("getPacman", IRunable.class);
//        System.out.println(game.hashCode());
//        System.out.println(game2.hashCode());

      GameRunner gameRunner2=context.getBean(GameRunner.class);
       gameRunner2.run();
    }
}
