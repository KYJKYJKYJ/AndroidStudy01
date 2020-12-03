package com.kyjtheyj.myapplication.Model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class TEST_DATABASE_M {
    @PrimaryKey
    public int uid;

    public String first_Name;

    public String last_Name;
}