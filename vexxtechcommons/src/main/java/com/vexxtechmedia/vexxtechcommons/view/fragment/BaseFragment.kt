package com.vexxtechmedia.vexxtechcommons.view.fragment

import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    protected val classTag: String by lazy { this::class.java.simpleName }
}