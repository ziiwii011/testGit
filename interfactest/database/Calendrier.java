package com.example.silver_desk.interfactest.database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

/**
 * Created by silver-desk on 01/04/2018.
 */
@Entity(tableName = "calendrier_table")
public class Calendrier {@PrimaryKey(autoGenerate = true)
@ColumnInfo(name = "id")
private int id ;
    @ColumnInfo(name = "titre")
    @NonNull
    private String titre ;

    @ColumnInfo(name = "visibilité")
    @NonNull
    private String visibilité ;

    @ColumnInfo(name = "activité")
    @NonNull
    private String activité ;

    @ColumnInfo(name = "couleur")
    private String couleur;



    public Calendrier(int id, @NonNull String titre, @NonNull String visibilité, @NonNull String activité, String couleur, String priorité) {
        this.id = id;
        this.titre = titre;
        this.visibilité = visibilité;
        this.activité = activité;
        this.couleur = couleur;
        this.priorité = priorité;
    }

    @NonNull

    public String getVisibilité() {
        return visibilité;
    }

    public void setVisibilité(@NonNull String visibilité) {
        this.visibilité = visibilité;
    }

    @NonNull
    public String getActivité() {
        return activité;
    }

    public void setActivité(@NonNull String activité) {
        this.activité = activité;
    }

    @ColumnInfo(name = "priorité")
    private String priorité ;



    public Calendrier() {
    }

    public Calendrier(String titre) {
this.titre=titre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NonNull
    public String getTitre() {
        return titre;
    }

    public void setTitre(@NonNull String titre) {
        this.titre = titre;
    }


    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getPriorité() {
        return priorité;
    }

    public void setPriorité(String priorité) {
        this.priorité = priorité;
    }
}
