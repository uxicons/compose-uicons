package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Humidity: ImageVector? = null

val Icons.Ts.Humidity: ImageVector
    get() = _Humidity ?: UXIcon(name = "Humidity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-2.67f, 0f, -5.18f, -1.04f, -7.07f, -2.93f)
                curveToRelative(-3.9f, -3.9f, -3.9f, -10.24f, 0f, -14.14f)
                lineTo(12f, 0.01f)
                lineToRelative(7.07f, 6.91f)
                curveToRelative(3.9f, 3.9f, 3.9f, 10.25f, 0.0f, 14.15f)
                horizontalLineToRelative(0f)
                curveToRelative(-1.89f, 1.89f, -4.4f, 2.93f, -7.07f, 2.93f)
                close()
                moveTo(12f, 1.41f)
                lineTo(5.63f, 7.64f)
                curveToRelative(-3.5f, 3.5f, -3.5f, 9.21f, 0.0f, 12.72f)
                curveToRelative(1.7f, 1.7f, 3.96f, 2.64f, 6.36f, 2.64f)
                reflectiveCurveToRelative(4.66f, -0.94f, 6.36f, -2.64f)
                horizontalLineToRelative(0f)
                curveToRelative(3.51f, -3.51f, 3.51f, -9.22f, 0f, -12.73f)
                lineTo(12f, 1.41f)
                close()
                moveTo(9f, 10f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(15f, 16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(9.05f, 18f)
                horizontalLineToRelative(1.15f)
                lineToRelative(4.8f, -8f)
                horizontalLineToRelative(-1.15f)
                lineToRelative(-4.8f, 8f)
                close()
            }
        }.also { _Humidity = it}
