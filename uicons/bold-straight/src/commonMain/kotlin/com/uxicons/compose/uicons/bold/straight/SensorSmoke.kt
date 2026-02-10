package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorSmoke: ImageVector? = null

val Icons.Bs.SensorSmoke: ImageVector
    get() = _SensorSmoke ?: UXIcon(name = "SensorSmoke") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.5f, 5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(11.5f, 8f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 24f)
                lineTo(8.26f, 24f)
                curveToRelative(-0.69f, -0.83f, -1.13f, -1.87f, -1.24f, -3f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                lineTo(20.5f, 3f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                lineTo(21f, 12.11f)
                curveToRelative(0.42f, 0.43f, 0.78f, 0.91f, 1.08f, 1.45f)
                curveToRelative(0.72f, 0.31f, 1.36f, 0.76f, 1.92f, 1.3f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(20.64f, 15.16f)
                curveToRelative(-0.73f, -1.85f, -2.53f, -3.16f, -4.64f, -3.16f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 0.11f, 0.03f, 0.22f, 0.03f, 0.33f)
                curveToRelative(-1.2f, 0.56f, -2.03f, 1.76f, -2.03f, 3.17f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                curveToRelative(0f, -2.09f, -1.43f, -3.83f, -3.36f, -4.34f)
                close()
            }
        }.also { _SensorSmoke = it}
