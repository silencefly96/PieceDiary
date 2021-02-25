package com.silencefly96.piecediary.module.diary.model.remote

import com.silencefly96.piecediary.common.net.ServiceCreator
import com.silencefly96.piecediary.module.diary.model.Diary
import com.silencefly96.piecediary.module.diary.model.DiaryDataSource

class DiaryRemoteDataSource : DiaryDataSource {

    companion object {
        val diaryService: DiaryService = ServiceCreator.create(DiaryService::class.java)
    }

    override fun save(diary: Diary) {
       diaryService.insert(diary)
    }

    override fun delete(diary: Diary) {
        diaryService.delete(diary)
    }

    override fun delete(vararg ids: Long) {
        diaryService.delete(ids)
    }

    override fun query(id: Long) {
        diaryService.query(id)
    }

    override fun query(vararg ids: Long) {
        diaryService.query(ids)
    }

    override fun update(diary: Diary) {
        diaryService.update(diary)
    }

}