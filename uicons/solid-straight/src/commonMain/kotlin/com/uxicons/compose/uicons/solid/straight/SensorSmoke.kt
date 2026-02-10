package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorSmoke: ImageVector? = null

val Icons.Ss.SensorSmoke: ImageVector
    get() = _SensorSmoke ?: UXIcon(name = "SensorSmoke") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 19.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                curveToRelative(0f, -1.41f, 0.84f, -2.61f, 2.03f, -3.17f)
                curveToRelative(-0.01f, -0.11f, -0.03f, -0.22f, -0.03f, -0.33f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(2.11f, 0f, 3.91f, 1.31f, 4.64f, 3.16f)
                curveToRelative(1.93f, 0.51f, 3.36f, 2.25f, 3.36f, 4.34f)
                close()
                moveTo(8.26f, 24f)
                lineTo(0f, 24f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(24f, 14.85f)
                curveToRelative(-0.55f, -0.53f, -1.19f, -0.98f, -1.92f, -1.3f)
                curveToRelative(-1.23f, -2.19f, -3.53f, -3.55f, -6.08f, -3.55f)
                curveToRelative(-3.6f, 0f, -6.58f, 2.73f, -6.96f, 6.24f)
                curveToRelative(-1.27f, 1.03f, -2.04f, 2.59f, -2.04f, 4.26f)
                curveToRelative(0f, 1.33f, 0.47f, 2.55f, 1.26f, 3.5f)
                close()
                moveTo(7f, 4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
                moveTo(5f, 4f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _SensorSmoke = it}
