package com.bilgeadam.xml.database;

import javax.xml.crypto.Data;

public class DatabaseService {

    Database database;

    public DatabaseService(Database database) {
        this.database = database;
    }

    public void  logToDatabase(){
        database.log();
    }

}
