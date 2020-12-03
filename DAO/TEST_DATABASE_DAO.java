package com.kyjtheyj.myapplication.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import com.kyjtheyj.myapplication.Model.TEST_DATABASE_M;

import java.util.List;

@Dao
public interface TEST_DATABASE_DAO {
    @Query("SELECT * FROM TEST_DATABASE_M")
    List<TEST_DATABASE_DAO> getAll();

    @Query("SELECT * FROM TEST_DATABASE_M WHERE uid IN (:userIds)")
    List<TEST_DATABASE_M> loadAllByIds(int[] userIds);

    @Query("SELECT * FROM TEST_DATABASE_M WHERE first_name LIKE :first AND " +
            "last_name LIKE :last LIMIT 1")
    TEST_DATABASE_M findByName(String first, String last);

    @Insert
    void insertAll(TEST_DATABASE_M... users);

    @Delete
    void delete(TEST_DATABASE_M user);
}
