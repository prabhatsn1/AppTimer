package com.collabcode.apptimer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class UsageGoalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usage_goal)
        val doneBtn = findViewById<Button>(R.id.doneBtn)
        doneBtn.setOnClickListener(View.OnClickListener {
            val mActivity = Intent(this,MonitorActivity::class.java)
            startActivity(mActivity)
        })
    }
}