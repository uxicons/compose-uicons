package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleSmallUp: ImageVector? = null

val Icons.Br.AngleSmallUp: ImageVector
    get() = _AngleSmallUp ?: UXIcon(name = "AngleSmallUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.06f, 13.44f)
            lineTo(14.47f, 8.85f)
            arcToRelative(3.58f, 3.58f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.95f, 0f)
            lineTo(4.94f, 13.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 2.12f)
            lineToRelative(4.59f, -4.59f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.71f, 0f)
            lineToRelative(4.58f, 4.59f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, -2.12f)
            close()
        }
    }.also { _AngleSmallUp = it }
