package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChartPyramid: ImageVector? = null

val Icons.Ts.ChartPyramid: ImageVector
    get() = _ChartPyramid ?: UXIcon(name = "ChartPyramid") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.9f, 1.24f)
                curveTo(13.56f, 0.47f, 12.85f, 0.01f, 12f, 0.01f)
                reflectiveCurveToRelative(-1.56f, 0.46f, -1.91f, 1.24f)
                lineTo(0f, 24f)
                horizontalLineToRelative(24f)
                lineTo(13.9f, 1.24f)
                close()
                moveTo(19.36f, 16f)
                lineTo(4.64f, 16f)
                lineToRelative(2.66f, -6f)
                horizontalLineToRelative(9.39f)
                lineToRelative(2.66f, 6f)
                close()
                moveTo(11.01f, 1.65f)
                curveToRelative(0.18f, -0.41f, 0.55f, -0.64f, 0.99f, -0.64f)
                reflectiveCurveToRelative(0.81f, 0.23f, 0.99f, 0.64f)
                lineToRelative(3.26f, 7.35f)
                lineTo(7.75f, 9f)
                lineToRelative(3.26f, -7.35f)
                close()
                moveTo(4.2f, 17f)
                horizontalLineToRelative(15.6f)
                lineToRelative(2.66f, 6f)
                lineTo(1.54f, 23f)
                lineToRelative(2.66f, -6f)
                close()
            }
        }.also { _ChartPyramid = it}
