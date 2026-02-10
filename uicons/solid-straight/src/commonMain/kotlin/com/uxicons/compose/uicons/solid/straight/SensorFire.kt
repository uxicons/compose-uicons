package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorFire: ImageVector? = null

val Icons.Ss.SensorFire: ImageVector
    get() = _SensorFire ?: UXIcon(name = "SensorFire") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 9f)
                curveToRelative(-1.97f, 2.28f, -1.58f, 6.33f, -2.94f, 6.33f)
                curveToRelative(-0.66f, 0f, -1.39f, -2.26f, -1.39f, -2.26f)
                curveToRelative(-1.08f, 1.11f, -2.16f, 2.56f, -2.16f, 4.43f)
                curveToRelative(0f, 3.59f, 2.91f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.91f, 6.5f, -6.5f)
                curveToRelative(0f, -3.76f, -4.45f, -6.45f, -6.5f, -8.5f)
                close()
                moveTo(19.27f, 21.27f)
                curveToRelative(-0.98f, 0.98f, -2.56f, 0.98f, -3.54f, 0f)
                reflectiveCurveToRelative(-0.98f, -2.56f, 0f, -3.54f)
                lineToRelative(1.77f, -1.77f)
                lineToRelative(1.77f, 1.77f)
                curveToRelative(0.98f, 0.98f, 0.98f, 2.56f, 0f, 3.54f)
                close()
                moveTo(9f, 17.5f)
                curveToRelative(0f, -2.7f, 1.56f, -4.61f, 2.73f, -5.82f)
                curveToRelative(0f, 0f, 3.52f, -3.13f, 4.26f, -3.99f)
                lineToRelative(1.41f, -1.62f)
                lineToRelative(1.52f, 1.52f)
                curveToRelative(0.4f, 0.4f, 0.95f, 0.87f, 1.54f, 1.37f)
                curveToRelative(1.13f, 0.96f, 2.47f, 2.1f, 3.54f, 3.45f)
                lineTo(24.0f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(12.03f, 24f)
                curveToRelative(-1.85f, -1.56f, -3.03f, -3.89f, -3.03f, -6.5f)
                close()
                moveTo(4f, 5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(8f, 5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _SensorFire = it}
