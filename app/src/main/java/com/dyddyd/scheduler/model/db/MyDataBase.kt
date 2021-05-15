package com.dyddyd.scheduler.model.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.dyddyd.scheduler.model.db.dao.TaskDao
import com.dyddyd.scheduler.model.db.entity.Task

@Database(entities = [Task::class], version = 1)
abstract class MyDataBase : RoomDatabase() {
    abstract fun taskDao(): TaskDao

    companion object {
        private var INSTANCE: MyDataBase? = null

        fun getInstance(context: Context): MyDataBase {
            if (INSTANCE == null) {
                INSTANCE = Room.databaseBuilder(context.applicationContext, MyDataBase::class.java, "Scheduler_database.db").build()
            }

            return INSTANCE!!
        }
    }
}