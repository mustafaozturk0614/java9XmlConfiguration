package com.bilgeadam.xml.database;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public abstract class Database {

    String password;
    String username;
    String url;
    public abstract  void log();
}
