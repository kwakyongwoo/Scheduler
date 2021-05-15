package com.dyddyd.scheduler.model.db.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class Task(
    @PrimaryKey(autoGenerate = true) val uid: Int,
    var name: String,
    var dueDate: String,
    var checked: Boolean,
    var category: String,
    var expectedTime: String
)
