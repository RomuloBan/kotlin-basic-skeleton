package com.codely.demo

import java.time.LocalDate
import kotlin.reflect.jvm.internal.impl.descriptors.Visibilities.Local

fun main() {
    println("Please enter a date with the format <yyyy-MM-dd>")
    val input = LocalDate.parse(readLine())
    println("You wrote $input ${input.dayOfWeek}")
}
