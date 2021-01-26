package com.silencefly96.piecediary.data.local.model

import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import androidx.room.Relation

/**
 * @author: fdk
 * @date: 20210126
 * @description: 碎片日记数据类
 */

@Entity
data class PieceDiary constructor(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    var time: String = "",
    var location: String = "",
    var weather: String = "",
    var temperature: Double = 0.0,

    var title: String = "",
    var content : String = "",

    @Ignore
    var localUrl : String = "",

    @Relation(parentColumn = "id", entityColumn = "diaryId")
    var photos : List<Photo>
)

@Entity
data class Photo constructor(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0,

    var diaryId: Long = 0,
    var url: String = ""
)