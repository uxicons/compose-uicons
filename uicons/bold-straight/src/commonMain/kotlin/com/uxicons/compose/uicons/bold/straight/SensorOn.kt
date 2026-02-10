package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SensorOn: ImageVector? = null

val Icons.Bs.SensorOn: ImageVector
    get() = _SensorOn ?: UXIcon(name = "SensorOn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.5f, 9f)
                lineTo(3.5f, 9f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(11.5f)
                lineTo(15f, 24f)
                lineTo(15f, 12.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(12f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 12.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(11.5f, 12f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(8.5f)
                close()
                moveTo(24f, 10f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                lineTo(14f, 0f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(8f, 15.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _SensorOn = it}
