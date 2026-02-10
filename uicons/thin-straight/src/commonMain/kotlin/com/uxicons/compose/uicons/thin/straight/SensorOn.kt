package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorOn: ImageVector? = null

val Icons.Ts.SensorOn: ImageVector
    get() = _SensorOn ?: UXIcon(name = "SensorOn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.5f, 8f)
                lineTo(2.5f, 8f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                lineTo(16f, 24f)
                lineTo(16f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(15f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(13.5f, 9f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                close()
                moveTo(24f, 11f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                lineTo(13f, 0f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                close()
                moveTo(20f, 11f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                verticalLineToRelative(-1f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                close()
                moveTo(5f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _SensorOn = it}
