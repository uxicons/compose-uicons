package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clock: ImageVector? = null

val Icons.Rs.Clock: ImageVector
    get() = _Clock ?: UXIcon(name = "Clock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 2f)
                arcTo(10f, 10f, 0f, isMoreThanHalf = true, isPositiveArc = false, 22f, 12f)
                arcTo(10.01f, 10.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.95f, 15.6f)
                lineToRelative(-1.06f, -1.7f)
                lineToRelative(4.11f, -2.58f)
                lineToRelative(0f, -5.33f)
                lineToRelative(2f, 0f)
                lineToRelative(0f, 6.43f)
                lineToRelative(-5.05f, 3.17f)
                close()
            }
        }.also { _Clock = it}
