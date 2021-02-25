package com.silencefly96.piecediary.module.diary.model.local

import androidx.room.*
import com.silencefly96.piecediary.module.diary.model.Diary

@Dao
interface DiaryDao {

    @Query("SELECT * FROM diary")
    fun getAll(): List<Diary>

    @Query("SELECT * FROM diary WHERE id LIKE :id LIMIT 1")
    fun query(id: Long): Diary

    @Query("SELECT * FROM diary WHERE id IN (:ids)")
    fun query(ids: LongArray): List<Diary>

    @Insert
    fun insert(diary: Diary)

    @Insert
    fun insert(vararg diaries: Diary)

    @Update
    fun update(diary: Diary)

    @Update
    fun update(vararg diaries: Diary)

    @Delete
    fun delete(diary: Diary)

    @Delete
    fun delete(vararg diaries: Diary)

    @Query("DELETE FROM diary WHERE id IN (:ids)")
    fun delete(ids: LongArray)
}