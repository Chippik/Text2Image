package com.example.text2image

import android.app.Activity
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.io.File
import java.security.MessageDigest
import javax.crypto.Cipher
import javax.crypto.spec.SecretKeySpec

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnEncrypt).setOnClickListener {
            Toast.makeText(this, "Заглушка: Encrypt", Toast.LENGTH_SHORT).show()
        }

        findViewById<Button>(R.id.btnDecrypt).setOnClickListener {
            Toast.makeText(this, "Заглушка: Decrypt", Toast.LENGTH_SHORT).show()
        }
    }
}