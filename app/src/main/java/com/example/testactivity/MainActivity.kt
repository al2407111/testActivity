package com.example.testactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {  companion object {
    const val SEARCH_EDIT_TEXT = "SEARCH_EDIT_TEXT"
    const val SEARCH_EDIT_TEXT_RETAIN = ""
    const val SEARCH_EDIT_TEXT_RETAIN3 = ""
    const val SEARCH_EDIT_TEXT_RETAIN44 = ""
}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}