package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallRight: ImageVector? = null

val Icons.Bs.AngleSmallRight: ImageVector
    get() = _AngleSmallRight ?: UXIcon(name = "AngleSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.16f, 19.06f)
                lineTo(9.04f, 16.94f)
                lineTo(13.98f, 12f)
                lineTo(9.04f, 7.06f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(5.29f, 5.29f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 3.54f)
                close()
            }
        }.also { _AngleSmallRight = it}
