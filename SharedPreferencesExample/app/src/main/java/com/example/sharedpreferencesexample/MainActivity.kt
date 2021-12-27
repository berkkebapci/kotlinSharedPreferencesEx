package com.example.sharedpreferencesexample

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var sharedPreferences : SharedPreferences
    var getUserName = ""
    var getUserSurname = ""
    var getUserAge = ""
    var getUserJob = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sharedPreferences = this.getSharedPreferences("com.example.sharedpreferencesexample",
            Context.MODE_PRIVATE)
    }

    fun kaydet(view: View){
        var name = editText1.text.toString()
        var surname = editText2.text.toString()
        var age = editText3.text.toString()
        var job = editText4.text.toString()
        if(name == "" || surname == "" || age == "" || job == ""){
            Toast.makeText(this,"Bir Değer Giriniz",Toast.LENGTH_LONG).show()
        }
        else {
            sharedPreferences.edit().putString("name", name).apply()
            sharedPreferences.edit().putString("surname", surname).apply()
            sharedPreferences.edit().putString("age", age).apply()
            sharedPreferences.edit().putString("job", job).apply()
            val intent = Intent(applicationContext, MainActivity2::class.java)
            intent.putExtra("name", name)
            intent.putExtra("surname", surname)
            intent.putExtra("age", age)
            intent.putExtra("job", job)
            startActivity(intent)

        }
        }
}