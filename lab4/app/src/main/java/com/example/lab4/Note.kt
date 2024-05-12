package com.example.lab4

import android.icu.text.CaseMap.Title
import android.webkit.WebSettings.RenderPriority

data class Note(
    val id: Int,
    val title: String,
    val content:String,
    val priority: String
)
