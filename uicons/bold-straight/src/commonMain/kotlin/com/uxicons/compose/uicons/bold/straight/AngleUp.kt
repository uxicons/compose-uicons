package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleUp: ImageVector? = null

val Icons.Bs.AngleUp: ImageVector
    get() = _AngleUp ?: UXIcon(name = "AngleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 16.02f)
                lineTo(9.52f, 6.51f)
                arcToRelative(3.51f, 3.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.95f, 0f)
                lineTo(24f, 16.03f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(12.35f, 8.63f)
                arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 0f)
                lineToRelative(-9.52f, 9.51f)
                close()
            }
        }.also { _AngleUp = it}
