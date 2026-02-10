package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleUp: ImageVector? = null

val Icons.Br.ChevronDoubleUp: ImageVector
    get() = _ChevronDoubleUp ?: UXIcon(name = "ChevronDoubleUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 11.96f)
            arcTo(1.49f, 1.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, 10.9f)
            lineTo(8.11f, 3.22f)
            arcToRelative(5.5f, 5.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 7.78f, 0f)
            lineTo(23.56f, 10.9f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = true, isPositiveArc = true, -2.12f, 2.12f)
            lineTo(13.77f, 5.34f)
            arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.54f, 0f)
            horizontalLineToRelative(0f)
            lineTo(2.56f, 13.02f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 11.96f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(0f, 21.5f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.44f, -1.06f)
            lineTo(9.53f, 11.36f)
            arcToRelative(3.5f, 3.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 4.95f, 0f)
            lineToRelative(9.09f, 9.08f)
            arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, -2.12f, 2.12f)
            lineToRelative(-9.09f, -9.09f)
            arcToRelative(0.5f, 0.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.71f, 0f)
            horizontalLineToRelative(0f)
            lineTo(2.56f, 22.56f)
            arcTo(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 21.5f)
            close()
        }
    }.also { _ChevronDoubleUp = it }
