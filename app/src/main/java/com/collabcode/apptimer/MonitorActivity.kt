package com.collabcode.apptimer

import android.content.Intent
import android.content.pm.ApplicationInfo
import android.content.pm.PackageInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ListView
import com.collabcode.apptimer.adapters.monitorAdapter

class MonitorActivity : AppCompatActivity() {

    val mList:ArrayList<AppInfo> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monitor)

        val nextBtn = findViewById<Button>(R.id.nextBtn)
        val backBtn = findViewById<Button>(R.id.backBtn)
        val listView  = findViewById<ListView>(R.id.listView)
        listView.isNestedScrollingEnabled = true

        nextBtn.setOnClickListener(View.OnClickListener {
            val mActivity = Intent(this,Dashboard::class.java)
            startActivity(mActivity)
        })
        backBtn.setOnClickListener(View.OnClickListener {
            val nActivity = Intent(this,UsageGoalActivity::class.java)
            startActivity(nActivity)
        })

        ScanningInstalled()
        var arrayAdapter:monitorAdapter?=null
        arrayAdapter = monitorAdapter(this,mList)
        listView.adapter=arrayAdapter
    }

    public fun ScanningInstalled(){
        var appinfo = packageManager.getInstalledPackages(0)
        for(i in 0 until appinfo.size){
            //this is for retrieving installed packages only. remove ! to retrieve all packages in if logic
            if(!packageManager(appinfo[i])) {
                val appName = appinfo[i].applicationInfo.loadLabel(packageManager).toString()
                val appVer = appinfo[i].versionName;
                val appIcon = appinfo[i].applicationInfo.loadIcon(packageManager)
                mList.add(AppInfo(appName,appVer,appIcon))
                Log.v("Debug", appName )

            }
        }
    }
    fun packageManager(appinfo: PackageInfo):Boolean{
        return ((appinfo.applicationInfo.flags and ApplicationInfo.FLAG_SYSTEM)!=0)
    }
}