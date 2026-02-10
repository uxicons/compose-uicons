package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleDown: ImageVector? = null

val Icons.Br.AngleDown: ImageVector
    get() = _AngleDown ?: UXIcon(name = "AngleDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.51f, 6.08f)
            arcToRelative(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.06f, 0.44f)
            lineToRelative(7.67f, 7.67f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, 0f)
            lineTo(21.44f, 6.53f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 23.56f, 8.65f)
            lineTo(15.9f, 16.31f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.78f, 0f)
            lineTo(0.45f, 8.64f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 1.51f, 6.08f)
            close()
        }
    }.also { _AngleDown = it }
