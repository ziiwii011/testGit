package com.example.silver_desk.interfactest.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by silver-desk on 06/04/2018.
 */
@Entity(tableName = "evenment_table")
public class Evenment {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    private int id ;
    @ColumnInfo(name = "libelé")
    @NonNull
    private String libelé ;

    @ColumnInfo(name = "jour")
    @NonNull
    private String jour ;

    @ColumnInfo(name = "heure_debut")
    @NonNull
    private String heure_debut ;

    @ColumnInfo(name = "heure_fin")
    private String heure_fin;


    @ColumnInfo(name = "lieu")
    private String lieu;

    public Evenment() {
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getLibelé() {
        return libelé;
    }

    public void setLibelé(@NonNull String libelé) {
        this.libelé = libelé;
    }

    @NonNull
    public String getJour() {
        return jour;
    }

    public void setJour(@NonNull String jour) {
        this.jour = jour;
    }

    @NonNull
    public String getHeure_debut() {
        return heure_debut;
    }

    public void setHeure_debut(@NonNull String heure_debut) {
        this.heure_debut = heure_debut;
    }

    public String getHeure_fin() {
        return heure_fin;
    }

    public void setHeure_fin(String heure_fin) {
        this.heure_fin = heure_fin;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRecurrence() {
        return recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    @ColumnInfo(name = "description")
    private String description;

    @ColumnInfo(name = "recurrence")
    private String recurrence;



}
