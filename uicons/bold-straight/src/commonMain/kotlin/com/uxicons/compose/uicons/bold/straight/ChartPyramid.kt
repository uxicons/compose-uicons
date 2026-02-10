package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPyramid: ImageVector? = null

val Icons.Bs.ChartPyramid: ImageVector
    get() = _ChartPyramid ?: UXIcon(name = "ChartPyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.9f, 1.24f)
                arcToRelative(2.09f, 2.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.81f, 0f)
                lineTo(0f, 24f)
                horizontalLineTo(24f)
                close()
                moveTo(12f, 4.35f)
                lineTo(15.4f, 12f)
                horizontalLineTo(8.61f)
                close()
                moveTo(7.27f, 15f)
                horizontalLineToRelative(9.45f)
                lineToRelative(2.66f, 6f)
                horizontalLineTo(4.61f)
                close()
            }
        }.also { _ChartPyramid = it}
