package com.collabcode.apptimer

import android.app.Application
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class Dashboard : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        val reportBtn = findViewById<Button>(R.id.reportBtn)
        reportBtn.setOnClickListener(View.OnClickListener {
            //val mActivity = Intent(this,MonitorActivity::class.java)
            //startActivity(mActivity)
            Toast.makeText(applicationContext,"Wait for the page ",Toast.LENGTH_LONG).show()
        })
    }
}