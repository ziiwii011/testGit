package com.example.silver_desk.interfactest.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by silver-desk on 06/04/2018.
 */
@Entity(tableName = "alert_table")
public class Alerte {@PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id ;
    @ColumnInfo(name = "description")

    private String description ;

    public Alerte() {
    }

    @ColumnInfo(name = "heure")
    @NonNull
    private String heure ;

    @ColumnInfo(name = "sonnrie")

    private String sonnrie ;

    @ColumnInfo(name = "delait")
    private String delait;

    @ColumnInfo(name = "etat")
    private String etat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @NonNull
    public String getHeure() {
        return heure;
    }

    public void setHeure(@NonNull String heure) {
        this.heure = heure;
    }

    public String getSonnrie() {
        return sonnrie;
    }

    public void setSonnrie(String sonnrie) {
        this.sonnrie = sonnrie;
    }

    public String getDelait() {
        return delait;
    }

    public void setDelait(String delait) {
        this.delait = delait;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
}
