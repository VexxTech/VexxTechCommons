package com.vexxtechmedia.vexxtechcommons.viewmodel

import androidx.lifecycle.ViewModel

abstract class BaseViewModel : ViewModel() {
    protected val classTag: String by lazy { this::class.java.simpleName }
}