package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AngleRight: ImageVector? = null

val Icons.Br.AngleRight: ImageVector
    get() = _AngleRight ?: UXIcon(name = "AngleRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.08f, 22.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, -1.06f)
            lineToRelative(7.67f, -7.67f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -3.54f)
            lineTo(6.53f, 2.56f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 8.65f, 0.44f)
            lineToRelative(7.66f, 7.66f)
            arcToRelative(5.51f, 5.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 7.78f)
            lineTo(8.64f, 23.56f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 6.08f, 22.5f)
            close()
        }
    }.also { _AngleRight = it }
