package com.silencefly96.piecediary.module.diary.model.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.silencefly96.piecediary.module.diary.model.Diary


@Database(entities = [Diary::class], version = 1)
abstract class DiaryDatabase : RoomDatabase() {
    abstract fun diaryDao(): DiaryDao
}