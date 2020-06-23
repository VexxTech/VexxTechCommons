package com.vexxtechmedia.vexxtechcommons.view.dialog

import androidx.fragment.app.DialogFragment

abstract class BaseDialogFragment : DialogFragment() {
    protected val classTag: String by lazy { this::class.java.simpleName }
}