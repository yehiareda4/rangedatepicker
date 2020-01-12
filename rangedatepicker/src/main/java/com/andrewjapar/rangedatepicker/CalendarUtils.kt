package com.andrewjapar.rangedatepicker

import java.util.*

fun Calendar.toPrettyMonthString(style: Int = Calendar.LONG, locale: Locale = Locale.getDefault()): String {
    val month = getDisplayName(Calendar.MONTH, style, locale)
    val year = get(Calendar.YEAR).toString()
    return if (month == null) throw IllegalStateException("Cannot get pretty name")
    else "$month $year"
}

fun Calendar.toPrettyDateString(locale: Locale = Locale.getDefault()): String {
    val day = get(Calendar.DAY_OF_MONTH).toString()
    return "$day ${this.toPrettyMonthString(Calendar.SHORT, locale)}"
}