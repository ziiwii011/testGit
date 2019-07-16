package com.example.silver_desk.interfactest.database.Daos;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.silver_desk.interfactest.database.Alerte;
import com.example.silver_desk.interfactest.database.Calendrier;
import com.example.silver_desk.interfactest.database.Evenment;

import java.util.List;

/**
 * Created by silver-desk on 08/04/2018.
 */

public interface AlerteDao {


        @Insert
        public void insert(Alerte alerte);

        @Update
        public void upDateAlerte(Alerte alerte);

        @Delete
        public void deletAlert(Alerte alerte);

        @Query("SELECT * FROM alert_table")
        List<Alerte> loadAllAlerte();

        @Query("DELETE FROM alert_table ")
        void deleteAllAlerte();
}
