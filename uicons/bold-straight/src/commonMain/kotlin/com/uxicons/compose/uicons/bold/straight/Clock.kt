package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Clock: ImageVector? = null

val Icons.Bs.Clock: ImageVector
    get() = _Clock ?: UXIcon(name = "Clock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                arcTo(12f, 12f, 0f, isMoreThanHalf = true, isPositiveArc = true, 24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 24f)
                close()
                moveTo(12f, 3f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, 9f, 9f)
                arcTo(9.01f, 9.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 3f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.42f, 15.9f)
                lineToRelative(-1.59f, -2.54f)
                lineToRelative(3.67f, -2.3f)
                lineToRelative(0f, -4.78f)
                lineToRelative(3f, 0f)
                lineToRelative(0f, 6.44f)
                lineToRelative(-5.08f, 3.18f)
                close()
            }
        }.also { _Clock = it}
