package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDown: ImageVector? = null

val Icons.Bs.AngleDown: ImageVector
    get() = _AngleDown ?: UXIcon(name = "AngleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8.06f)
                lineToRelative(9.52f, 9.51f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
                lineTo(24f, 8.05f)
                lineTo(21.88f, 5.93f)
                lineToRelative(-9.53f, 9.52f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
                lineTo(2.12f, 5.94f)
                close()
            }
        }.also { _AngleDown = it}
