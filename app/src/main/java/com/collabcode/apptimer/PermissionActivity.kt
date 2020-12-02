package com.collabcode.apptimer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class PermissionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_permission)

        val permissionBtn = findViewById<Button>(R.id.permissionButton)

        permissionBtn.setOnClickListener(View.OnClickListener {
            val usageActivity = Intent(this,UsageGoalActivity::class.java)
            startActivity(usageActivity)
        })
    }
}