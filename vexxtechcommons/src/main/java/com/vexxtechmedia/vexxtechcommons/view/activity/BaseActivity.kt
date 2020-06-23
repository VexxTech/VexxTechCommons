package com.vexxtechmedia.vexxtechcommons.view.activity

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {
    protected val classTag: String by lazy { this::class.java.simpleName }
}