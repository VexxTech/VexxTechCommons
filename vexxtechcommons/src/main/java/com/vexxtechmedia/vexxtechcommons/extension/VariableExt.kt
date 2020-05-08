package com.vexxtechmedia.vexxtechcommons.extension

fun Boolean.toInt() = if (this) 1 else 0

fun Int.toBoolean() = this == 1