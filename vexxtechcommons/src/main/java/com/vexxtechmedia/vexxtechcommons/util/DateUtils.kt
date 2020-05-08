package com.vexxtechmedia.vexxtechcommons.util

import java.text.SimpleDateFormat
import java.util.*

object DateUtils {

    fun getFormattedDate(dateString: String, includeTime: Boolean, isSlash: Boolean): Date? = getFormatter(includeTime, isSlash).parse(dateString)

    fun getFormattedDateString(date: Date, includeTime: Boolean, isSlash: Boolean): String = getFormatter(includeTime, isSlash).format(date)

    private fun getFormatter(includeTime: Boolean, isSlash: Boolean): SimpleDateFormat {
        return when {
            includeTime && isSlash -> SimpleDateFormat("dd/MM/yyyy hh:mm:ss", Locale.ENGLISH)
            includeTime && !isSlash -> SimpleDateFormat("dd-mm-yyyy hh:mm:ss", Locale.ENGLISH)
            !includeTime && isSlash -> SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
            else -> SimpleDateFormat("dd-MM-yyyy", Locale.ENGLISH)
        }
    }
}