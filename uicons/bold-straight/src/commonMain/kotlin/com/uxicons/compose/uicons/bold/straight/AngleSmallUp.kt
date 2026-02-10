package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallUp: ImageVector? = null

val Icons.Bs.AngleSmallUp: ImageVector
    get() = _AngleSmallUp ?: UXIcon(name = "AngleSmallUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.94f, 15.56f)
                lineTo(12f, 10.62f)
                lineToRelative(-4.94f, 4.94f)
                lineTo(4.94f, 13.44f)
                lineToRelative(5.29f, -5.29f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3.54f, 0f)
                lineToRelative(5.29f, 5.29f)
                close()
            }
        }.also { _AngleSmallUp = it}
