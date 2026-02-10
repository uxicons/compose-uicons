package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorFire: ImageVector? = null

val Icons.Bs.SensorFire: ImageVector
    get() = _SensorFire ?: UXIcon(name = "SensorFire") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(13f, 6.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(11.36f, 24f)
                curveToRelative(-1.0f, -0.81f, -1.82f, -1.83f, -2.41f, -3f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5.51f)
                curveToRelative(1.01f, 0.82f, 2.1f, 1.76f, 3f, 2.87f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(24f, 17f)
                curveToRelative(0f, 3.87f, -3.13f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.13f, -7f, -7f)
                curveToRelative(0f, -2.01f, 1.17f, -3.57f, 2.33f, -4.77f)
                curveToRelative(0f, 0f, 0.79f, 2.44f, 1.5f, 2.44f)
                curveToRelative(1.47f, 0f, 1.05f, -3.95f, 3.17f, -6.4f)
                curveToRelative(2.21f, 2.21f, 7f, 4.68f, 7f, 8.73f)
                close()
                moveTo(18.77f, 17.77f)
                lineToRelative(-1.77f, -1.77f)
                lineToRelative(-1.77f, 1.77f)
                curveToRelative(-0.98f, 0.98f, -0.98f, 2.56f, 0f, 3.54f)
                curveToRelative(0.98f, 0.98f, 2.56f, 0.98f, 3.54f, 0f)
                curveToRelative(0.98f, -0.98f, 0.98f, -2.56f, 0f, -3.54f)
                close()
            }
        }.also { _SensorFire = it}
