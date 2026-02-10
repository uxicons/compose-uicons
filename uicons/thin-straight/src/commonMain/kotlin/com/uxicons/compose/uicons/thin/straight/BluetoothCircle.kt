package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothCircle: ImageVector? = null

val Icons.Ts.BluetoothCircle: ImageVector
    get() = _BluetoothCircle ?: UXIcon(name = "BluetoothCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(16.76f, 8.26f)
                lineToRelative(-4.89f, -4.26f)
                horizontalLineToRelative(-0.87f)
                verticalLineToRelative(6.8f)
                lineToRelative(-3.67f, -3.18f)
                lineToRelative(-0.65f, 0.76f)
                lineToRelative(4.2f, 3.63f)
                lineToRelative(-4.2f, 3.61f)
                lineToRelative(0.65f, 0.76f)
                lineToRelative(3.67f, -3.16f)
                verticalLineToRelative(6.78f)
                horizontalLineToRelative(0.87f)
                lineToRelative(4.9f, -4.2f)
                lineToRelative(-4.37f, -3.78f)
                lineToRelative(4.37f, -3.76f)
                close()
                moveTo(12f, 5.44f)
                lineToRelative(3.24f, 2.82f)
                lineToRelative(-3.24f, 2.79f)
                lineTo(12f, 5.44f)
                close()
                moveTo(15.23f, 15.79f)
                lineToRelative(-3.23f, 2.78f)
                verticalLineToRelative(-5.58f)
                lineToRelative(3.23f, 2.8f)
                close()
            }
        }.also { _BluetoothCircle = it}
