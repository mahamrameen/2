package com.example.liberary

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    companion object {
        const val REQUEST_FROM_CAMERA = 1001;
        const val REQUEST_FROM_GALLERY = 1002;
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

    private fun initUI() {
        btnSelectImage.setOnClickListner {
            captureImageUsingCamera()
        }

        btnShowSavedImage.setOnClickListner {
            pickImageFromGallery()
        }
    }

    private fun pickImageFromGallery() {
        ImagePicker.with(this).galleryOnly().start(REQUEST_FROM_GALLERY)
    }

    private fun captureImageUsingCamera() {
        ImagePicker.with(this).cameraOnly().start(REQUEST_FROM_CAMERA)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(resultCode == Activity.RESULT_OK) {
            when (requestCode) {
                REQUEST_FROM_CAMERA -> {


                }
                REQUEST_FROM_GALLERY -> {


                }
            }
        }
    }
}