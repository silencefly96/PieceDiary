package com.silencefly96.piecediary.module.diary.model

interface DiaryDataSource {

    fun save(diary: Diary)

    fun delete(diary: Diary)

    fun delete(vararg ids: Long)

    fun query(id: Long)

    fun query(vararg ids: Long)

    fun update(diary: Diary)
}