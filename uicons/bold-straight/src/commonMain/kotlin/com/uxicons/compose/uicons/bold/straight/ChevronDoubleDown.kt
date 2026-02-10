package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDown: ImageVector? = null

val Icons.Bs.ChevronDoubleDown: ImageVector
    get() = _ChevronDoubleDown ?: UXIcon(name = "ChevronDoubleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.65f, 20.47f)
                lineTo(2.13f, 10.94f)
                lineTo(0.01f, 13.06f)
                lineTo(9.53f, 22.59f)
                arcToRelative(3.49f, 3.49f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.93f, 0f)
                lineTo(24f, 13.06f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(12.35f, 20.47f)
                arcToRelative(0.49f, 0.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.69f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.13f, 1f)
                lineTo(0.01f, 3.12f)
                lineTo(10.94f, 14.06f)
                arcToRelative(1.5f, 1.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.12f, 0f)
                horizontalLineToRelative(0f)
                lineTo(24f, 3.12f)
                lineTo(21.88f, 1f)
                lineTo(12f, 10.87f)
                close()
            }
        }.also { _ChevronDoubleDown = it}
