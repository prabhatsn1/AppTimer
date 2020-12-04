package com.collabcode.apptimer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MonitorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monitor)

        val nextBtn = findViewById<Button>(R.id.nextBtn)
        val backBtn = findViewById<Button>(R.id.backBtn)

        nextBtn.setOnClickListener(View.OnClickListener {
            val mActivity = Intent(this,Dashboard::class.java)
            startActivity(mActivity)
        })
        backBtn.setOnClickListener(View.OnClickListener {
            val nActivity = Intent(this,UsageGoalActivity::class.java)
            startActivity(nActivity)
        })
    }
}