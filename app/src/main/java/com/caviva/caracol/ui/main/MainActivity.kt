package com.caviva.caracol.ui.main

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.caviva.caracol.R

class MainActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}