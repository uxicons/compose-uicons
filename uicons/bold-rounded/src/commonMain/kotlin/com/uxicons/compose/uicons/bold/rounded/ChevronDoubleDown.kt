package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDown: ImageVector? = null

val Icons.Br.ChevronDoubleDown: ImageVector
    get() = _ChevronDoubleDown ?: UXIcon(name = "ChevronDoubleDown") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0.44f, 10.98f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 0f)
            lineToRelative(7.67f, 7.67f)
            horizontalLineToRelative(0f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.54f, 0f)
            lineToRelative(7.67f, -7.67f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, 23.56f, 13.1f)
            lineToRelative(-7.67f, 7.67f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -7.78f, 0f)
            lineTo(0.44f, 13.1f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.12f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(0.44f, 1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 0f)
            lineToRelative(9.09f, 9.09f)
            horizontalLineToRelative(0f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0.71f, 0f)
            lineTo(21.44f, 1.44f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.12f, 2.12f)
            lineTo(14.47f, 12.64f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -4.95f, 0f)
            lineTo(0.44f, 3.56f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -2.12f)
            close()
        }
    }.also { _ChevronDoubleDown = it }
