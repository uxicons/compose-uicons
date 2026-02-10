package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChevronDoubleDown: ImageVector? = null

val Icons.Rs.ChevronDoubleDown: ImageVector
    get() = _ChevronDoubleDown ?: UXIcon(name = "ChevronDoubleDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.3f, 20.88f)
                lineTo(1.41f, 10.99f)
                lineTo(0f, 12.41f)
                lineToRelative(9.88f, 9.88f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.24f, 0f)
                lineTo(24.02f, 12.4f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-9.89f, 9.89f)
                arcTo(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.3f, 20.88f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.01f, 11.59f)
                lineTo(1.42f, 1f)
                lineTo(0.01f, 2.42f)
                lineTo(11.3f, 13.71f)
                arcToRelative(1f, 1f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.41f, 0f)
                lineToRelative(11.29f, -11.29f)
                lineTo(22.59f, 1f)
                close()
            }
        }.also { _ChevronDoubleDown = it}
