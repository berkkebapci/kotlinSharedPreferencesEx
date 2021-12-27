package com.example.sharedpreferencesexample

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.textView
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    lateinit var sharedPreferences : SharedPreferences
    var getUserName = ""
    var getUserSurname = ""
    var getUserAge = ""
    var getUserJob = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        sharedPreferences = this.getSharedPreferences("com.example.sharedpreferencesexample",
            Context.MODE_PRIVATE)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        getUserName = sharedPreferences.getString("name","").toString()
        getUserSurname = sharedPreferences.getString("surname","").toString()
        getUserAge = sharedPreferences.getString("age","").toString()
        getUserJob = sharedPreferences.getString("job","").toString()
        textView3.text = "Name: " + getUserName
        textView4.text = "Surname: " + getUserSurname
        textView5.text = "Age: " + getUserAge
        textView6.text = "Job: " + getUserJob
    }
}