package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDown: ImageVector? = null

val Icons.Rs.AngleDown: ImageVector
    get() = _AngleDown ?: UXIcon(name = "AngleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.59f, 5.93f)
                lineToRelative(-9.88f, 9.88f)
                arcToRelative(1.02f, 1.02f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.41f, 0f)
                lineTo(1.42f, 5.93f)
                lineTo(0.01f, 7.35f)
                lineToRelative(9.87f, 9.87f)
                arcToRelative(3.08f, 3.08f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(24f, 7.34f)
                close()
            }
        }.also { _AngleDown = it}
