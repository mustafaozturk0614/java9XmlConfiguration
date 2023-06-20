package com.bilgeadam.xml.database;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 1- Postgre ve mysql  loglama metotlarımız olsun (postgres loglandı ,mysqle loglandı gibi)
 2- databse sevicede logTodatabse diye bir metodum olsun buda hangi databse i kullanıyorsak o databse e veri loglasın
 3- bunun bir databse.context.xml  dosyası yazıp databse test sınıfındada deneyelim

 */
public class DatabaseTest {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("databaseContext.xml");

        DatabaseService service=context.getBean("databaseservice", DatabaseService.class);
        service.logToDatabase();
    }
}
