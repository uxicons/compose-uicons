package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleUp: ImageVector? = null

val Icons.Bs.ChevronDoubleUp: ImageVector
    get() = _ChevronDoubleUp ?: UXIcon(name = "ChevronDoubleUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.35f, 3.53f)
                lineToRelative(9.53f, 9.53f)
                lineTo(24f, 10.94f)
                lineTo(14.47f, 1.41f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, -4.93f, 0f)
                lineTo(0.01f, 10.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(9.53f, -9.53f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.69f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.88f, 23f)
                lineTo(24f, 20.88f)
                lineTo(13.07f, 9.95f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.12f, 0f)
                horizontalLineToRelative(0f)
                lineTo(0.01f, 20.88f)
                lineTo(2.13f, 23f)
                lineToRelative(9.88f, -9.87f)
                close()
            }
        }.also { _ChevronDoubleUp = it}
