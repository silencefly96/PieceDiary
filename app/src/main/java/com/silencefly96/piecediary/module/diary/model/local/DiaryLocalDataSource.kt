package com.silencefly96.piecediary.module.diary.model.local

import androidx.room.Room
import com.silencefly96.piecediary.PieceApplication
import com.silencefly96.piecediary.module.diary.model.Diary
import com.silencefly96.piecediary.module.diary.model.DiaryDataSource

class DiaryLocalDataSource : DiaryDataSource {

    companion object {
       val db = Room.databaseBuilder(
               PieceApplication.context,
               DiaryDatabase::class.java, "diary"
       ).build()
    }

    override fun save(diary: Diary) {
        db.diaryDao().insert(diary)
    }

    override fun delete(diary: Diary) {
        db.diaryDao().delete(diary)
    }

    override fun delete(vararg ids: Long) {
        db.diaryDao().delete(ids)
    }

    override fun query(id: Long) {
        db.diaryDao().query(id)
    }

    override fun query(vararg ids: Long) {
        db.diaryDao().query(ids)
    }

    override fun update(diary: Diary) {
       db.diaryDao().update(diary)
    }
}