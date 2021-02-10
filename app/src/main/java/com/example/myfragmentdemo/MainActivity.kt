package com.example.myfragmentdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Object obj = new WelcomeFragment
        val welcomeFg = WelcomeFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.mainFrame, welcomeFg)
            commit()
        }
    }
}