package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPyramid: ImageVector? = null

val Icons.Sr.ChartPyramid: ImageVector
    get() = _ChartPyramid ?: UXIcon(name = "ChartPyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0.59f, 18.24f)
                arcTo(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4.18f, 24f)
                horizontalLineTo(19.82f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, 3.59f, -5.76f)
                lineTo(22.81f, 17f)
                horizontalLineTo(1.19f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.38f, 10f)
                lineToRelative(-14.75f, 0f)
                lineToRelative(-2.45f, 5f)
                lineToRelative(19.65f, 0f)
                lineToRelative(-2.45f, -5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.59f, 2.27f)
                arcToRelative(4f, 4f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.18f, 0f)
                lineTo(5.6f, 8f)
                horizontalLineTo(18.4f)
                close()
            }
        }.also { _ChartPyramid = it}
