package com.example.silver_desk.interfactest.database.Daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.silver_desk.interfactest.database.Calendrier;
import com.example.silver_desk.interfactest.database.Evenment;

import java.util.List;


@Dao
public interface EvenmentDao {
    @Insert
    public void insert(Evenment evenment);

    @Update
    public void upDateEvenment(Evenment evenment);

    @Delete
    public void deletEvenment(Evenment evenment);

    @Query("SELECT * FROM evenment_table")
    List<Calendrier> loadAllevenment();

    @Query("DELETE FROM evenment_table ")
    void deleteAllEvenment();

}
