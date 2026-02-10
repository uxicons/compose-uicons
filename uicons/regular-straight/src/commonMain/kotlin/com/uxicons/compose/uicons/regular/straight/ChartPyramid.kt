package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPyramid: ImageVector? = null

val Icons.Rs.ChartPyramid: ImageVector
    get() = _ChartPyramid ?: UXIcon(name = "ChartPyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.9f, 1.24f)
                arcToRelative(2.09f, 2.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.81f, 0f)
                lineTo(0f, 24f)
                horizontalLineTo(24f)
                close()
                moveTo(18.26f, 16f)
                horizontalLineTo(5.74f)
                lineToRelative(1.77f, -4f)
                horizontalLineToRelative(8.98f)
                close()
                moveTo(11.92f, 2.06f)
                curveToRelative(0.02f, -0.04f, 0.02f, -0.05f, 0.08f, -0.05f)
                reflectiveCurveToRelative(0.07f, 0.02f, 0.08f, 0.04f)
                lineTo(15.6f, 10f)
                horizontalLineTo(8.4f)
                close()
                moveTo(4.85f, 18f)
                horizontalLineToRelative(14.3f)
                lineToRelative(1.77f, 4f)
                horizontalLineTo(3.08f)
                close()
            }
        }.also { _ChartPyramid = it}
