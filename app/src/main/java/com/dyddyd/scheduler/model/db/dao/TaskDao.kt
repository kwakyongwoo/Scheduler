package com.dyddyd.scheduler.model.db.dao

import androidx.room.*
import com.dyddyd.scheduler.model.db.entity.Task

@Dao
interface TaskDao {
    @Query("SELECT * FROM task")
    fun getAllTask() : List<Task>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertTask(task: Task)

    @Update
    fun updateTask(task: Task)

    @Delete
    fun deleteAllTask()
}