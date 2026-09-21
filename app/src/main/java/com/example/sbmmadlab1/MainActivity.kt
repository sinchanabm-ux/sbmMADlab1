package com.example.lifecycleapp

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.sbmmadlab1.R

class MainActivity : AppCompatActivity() {

    private val TAG = "ActivityLifecycle"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "ON CREATE")
        Toast.makeText(this, "ON CREATE", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()

        Log.d(TAG, "ON START")
        Toast.makeText(this, "ON START", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()

        Log.d(TAG, "ON RESUME")
        Toast.makeText(this, "ON RESUME", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()

        Log.d(TAG, "ON PAUSE")
        Toast.makeText(this, "ON PAUSE", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()

        Log.d(TAG, "ON STOP")
        Toast.makeText(this, "ON STOP", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()

        Log.d(TAG, "ON RESTART")
        Toast.makeText(this, "ON RESTART", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        Log.e(TAG, "ON DESTROY")
        Toast.makeText(this, "ON DESTROY", Toast.LENGTH_SHORT).show()

        super.onDestroy()
    }
}