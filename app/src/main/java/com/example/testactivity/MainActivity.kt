package com.example.testactivity

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.gson.Gson
import android.widget.Adapter
import androidx.lifecycle.ReportFragment.Companion.reportFragment
const val PRACTICUM_EXAMPLE_PREFERENCES = "practicum_example_preferences"
const val EDIT_TEXT_KEY = "key_for_edit_text"

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val sharedPrefs = getSharedPreferences(PRACTICUM_EXAMPLE_PREFERENCES, MODE_PRIVATE)

        val editText = findViewById<EditText>(R.id.editText)
        val saveButton = findViewById<Button>(R.id.saveButton)
        val restoreButton = findViewById<Button>(R.id.syncButton)
        val text = findViewById<EditText>(R.id.subjectEditText)
        editText.setText(sharedPrefs.getString(EDIT_TEXT_KEY, ""))

        saveButton.setOnClickListener {
            sharedPrefs.edit()
                .putString(EDIT_TEXT_KEY, editText.editableText.toString())
                .apply()

          //  Toast.makeText(this, "Сохранили значение ${editText.editableText}", Toast.LENGTH_SHORT)
           //     .show()
        }

        restoreButton.setOnClickListener {
            text.setText(sharedPrefs.getString(EDIT_TEXT_KEY, ""))
        }
    }
}

data class User(val name: String, val age: Int)

class UserPreferences {

    // чтение
    fun read(sharedPreferences: SharedPreferences): User? {
        val json = sharedPreferences.getString(EDIT_TEXT_KEY, null) ?: return null
        return Gson().fromJson(json, User::class.java)
    }

    // запись
    fun write(sharedPreferences: SharedPreferences, user: User) {
        val json = Gson().toJson(user)
        sharedPreferences.edit()
            .putString(EDIT_TEXT_KEY, json)
            .apply()
    }
}