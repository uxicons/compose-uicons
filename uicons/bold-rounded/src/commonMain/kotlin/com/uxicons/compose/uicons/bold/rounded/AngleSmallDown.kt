package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallDown: ImageVector? = null

val Icons.Br.AngleSmallDown: ImageVector
    get() = _AngleSmallDown ?: UXIcon(name = "AngleSmallDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.06f, 7.85f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0f)
            lineToRelative(-4.59f, 4.58f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.71f, 0f)
            lineTo(7.06f, 7.85f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.94f, 9.97f)
            lineToRelative(4.59f, 4.59f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.95f, 0f)
            lineToRelative(4.59f, -4.59f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 19.06f, 7.85f)
            close()
        }
    }.also { _AngleSmallDown = it }
