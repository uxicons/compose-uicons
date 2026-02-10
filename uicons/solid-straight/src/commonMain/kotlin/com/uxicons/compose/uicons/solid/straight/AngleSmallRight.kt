package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallRight: ImageVector? = null

val Icons.Ss.AngleSmallRight: ImageVector
    get() = _AngleSmallRight ?: UXIcon(name = "AngleSmallRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.81f, 18.71f)
                lineTo(9.4f, 17.29f)
                lineTo(14.69f, 12f)
                lineTo(9.4f, 6.71f)
                lineToRelative(1.42f, -1.41f)
                lineTo(16.1f, 10.59f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 2.83f)
                close()
            }
        }.also { _AngleSmallRight = it}
