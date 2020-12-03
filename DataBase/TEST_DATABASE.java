package com.kyjtheyj.myapplication.DataBase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.kyjtheyj.myapplication.Model.TEST_DATABASE_M;

@Database(entities = {TEST_DATABASE.class}, version = 1)
public abstract class TEST_DATABASE extends RoomDatabase {

    //데이터베이스를 매번 생성하는건 리소스를 많이사용하므로 싱글톤이 권장된다고한다.
    private static TEST_DATABASE INSTANCE;

    public abstract TEST_DATABASE test_databaseDao();

    //디비 객체생성 가져오기
    public static TEST_DATABASE getAppDatabase(Context context){
        if(INSTANCE == null){
            INSTANCE = Room.databaseBuilder(context, TEST_DATABASE.class, "test-db").build();
        }
        return  INSTANCE;
    }

    //디비 객체제거
    public static void destroyInstance() {
        INSTANCE = null;
    }

}
