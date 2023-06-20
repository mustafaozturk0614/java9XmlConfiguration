package com.bilgeadam.xml.database;

public class PostgreSql extends Database {

    @Override
    public void log() {
        System.out.println(url+"e bağlanıldı");
        System.out.println("username===> "+ username);
        System.out.println("Postgresql'e  loglandı");
    }
}
