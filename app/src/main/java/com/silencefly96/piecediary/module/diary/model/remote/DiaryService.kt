package com.silencefly96.piecediary.module.diary.model.remote

import com.silencefly96.piecediary.module.diary.model.Diary

interface DiaryService {

    fun insert(diary: Diary)

    fun delete(diary: Diary)

    fun delete(ids: LongArray)

    fun query(id: Long)

    fun query(ids: LongArray)

    fun update(diary: Diary)
}