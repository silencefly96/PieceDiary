package com.silencefly96.piecediary.module.diary.model

class DiaryRepository (
        val mTasksRemoteDataSource: DiaryDataSource,
        val mTasksLocalDataSource: DiaryDataSource
) : DiaryDataSource {

    var cacheIsDirty = false

    fun refreshTasks() {
        cacheIsDirty = true
    }

    override fun save(diary: Diary) {

    }

    override fun delete(diary: Diary) {

    }

    override fun delete(vararg ids: Long) {

    }

    override fun query(id: Long) {

    }

    override fun query(vararg ids: Long) {

    }

    override fun update(diary: Diary) {

    }
}