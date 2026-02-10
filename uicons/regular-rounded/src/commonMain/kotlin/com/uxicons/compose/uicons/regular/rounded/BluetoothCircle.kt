package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothCircle: ImageVector? = null

val Icons.Rr.BluetoothCircle: ImageVector
    get() = _BluetoothCircle ?: UXIcon(name = "BluetoothCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.65f, 12.0f)
                lineToRelative(2.68f, -2.02f)
                curveToRelative(0.89f, -0.74f, 0.89f, -2.22f, 0.01f, -2.96f)
                lineToRelative(-2.97f, -2.64f)
                curveToRelative(-0.86f, -0.82f, -2.41f, -0.13f, -2.37f, 1.06f)
                verticalLineToRelative(4.56f)
                lineToRelative(-2.4f, -1.8f)
                curveToRelative(-0.44f, -0.33f, -1.07f, -0.24f, -1.4f, 0.2f)
                curveToRelative(-0.33f, 0.44f, -0.24f, 1.07f, 0.2f, 1.4f)
                lineToRelative(2.93f, 2.2f)
                lineToRelative(-2.93f, 2.2f)
                curveToRelative(-0.44f, 0.33f, -0.53f, 0.96f, -0.2f, 1.4f)
                curveToRelative(0.33f, 0.44f, 0.96f, 0.53f, 1.4f, 0.2f)
                lineToRelative(2.4f, -1.81f)
                verticalLineToRelative(4.56f)
                curveToRelative(-0.04f, 1.19f, 1.5f, 1.88f, 2.37f, 1.06f)
                lineToRelative(2.97f, -2.64f)
                curveToRelative(0.9f, -0.79f, 0.89f, -2.22f, -0.07f, -3.01f)
                lineToRelative(-2.62f, -1.97f)
                close()
                moveTo(13f, 6.68f)
                lineToRelative(2.07f, 1.75f)
                lineToRelative(-2.07f, 1.56f)
                verticalLineToRelative(-3.3f)
                close()
                moveTo(13f, 17.27f)
                verticalLineToRelative(-3.26f)
                lineToRelative(1.99f, 1.5f)
                lineToRelative(-1.99f, 1.77f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                reflectiveCurveTo(6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                close()
            }
        }.also { _BluetoothCircle = it}
