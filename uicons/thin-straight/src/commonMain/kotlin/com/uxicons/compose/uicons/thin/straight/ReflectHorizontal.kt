package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ReflectHorizontal: ImageVector? = null

val Icons.Ts.ReflectHorizontal: ImageVector
    get() = _ReflectHorizontal ?: UXIcon(name = "ReflectHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.35f, 10.53f)
                lineTo(0f, 2.89f)
                lineTo(0f, 21.11f)
                lineToRelative(8.34f, -7.63f)
                curveToRelative(0.42f, -0.38f, 0.66f, -0.91f, 0.66f, -1.48f)
                reflectiveCurveToRelative(-0.24f, -1.1f, -0.66f, -1.47f)
                close()
                moveTo(7.68f, 12.74f)
                lineTo(1.01f, 18.84f)
                lineTo(1.01f, 5.16f)
                lineToRelative(6.67f, 6.11f)
                curveToRelative(0.21f, 0.19f, 0.33f, 0.45f, 0.33f, 0.73f)
                reflectiveCurveToRelative(-0.12f, 0.54f, -0.33f, 0.73f)
                close()
                moveTo(15.66f, 10.53f)
                curveToRelative(-0.42f, 0.38f, -0.66f, 0.91f, -0.66f, 1.48f)
                reflectiveCurveToRelative(0.24f, 1.1f, 0.65f, 1.47f)
                lineToRelative(8.35f, 7.63f)
                lineTo(24f, 2.89f)
                lineToRelative(-8.34f, 7.63f)
                close()
                moveTo(11.5f, 0f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 24f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 0f)
                close()
            }
        }.also { _ReflectHorizontal = it}
