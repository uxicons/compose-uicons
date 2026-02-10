package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallUp: ImageVector? = null

val Icons.Rs.AngleSmallUp: ImageVector
    get() = _AngleSmallUp ?: UXIcon(name = "AngleSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.29f, 15.21f)
                lineTo(12f, 9.91f)
                lineTo(6.71f, 15.21f)
                lineTo(5.29f, 13.79f)
                lineTo(10.59f, 8.5f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.83f, 0f)
                lineToRelative(5.29f, 5.29f)
                close()
            }
        }.also { _AngleSmallUp = it}
