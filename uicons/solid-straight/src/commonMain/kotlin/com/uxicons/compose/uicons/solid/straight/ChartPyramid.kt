package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPyramid: ImageVector? = null

val Icons.Ss.ChartPyramid: ImageVector
    get() = _ChartPyramid ?: UXIcon(name = "ChartPyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.35f, 9f)
                lineTo(13.9f, 1.24f)
                arcToRelative(2.09f, 2.09f, 0f, isMoreThanHalf = false, isPositiveArc = false, -3.81f, 0f)
                lineTo(6.65f, 9f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.45f, 16f)
                lineToRelative(-2.22f, -5f)
                lineToRelative(-12.47f, 0f)
                lineToRelative(-2.22f, 5f)
                lineToRelative(16.9f, 0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.34f, 18f)
                lineToRelative(-18.68f, 0f)
                lineToRelative(-2.66f, 6f)
                lineToRelative(24f, 0f)
                lineToRelative(-2.66f, -6f)
                close()
            }
        }.also { _ChartPyramid = it}
