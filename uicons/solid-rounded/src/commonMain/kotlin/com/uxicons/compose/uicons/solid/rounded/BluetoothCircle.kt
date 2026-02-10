package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothCircle: ImageVector? = null

val Icons.Sr.BluetoothCircle: ImageVector
    get() = _BluetoothCircle ?: UXIcon(name = "BluetoothCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.57f, 8.06f)
                lineToRelative(-2.57f, 2.12f)
                lineTo(13.0f, 5.63f)
                reflectiveCurveToRelative(2.46f, 2.19f, 2.54f, 2.26f)
                reflectiveCurveToRelative(0.02f, 0.16f, 0.02f, 0.16f)
                close()
                moveTo(13.0f, 13.82f)
                verticalLineToRelative(4.54f)
                reflectiveCurveToRelative(2.48f, -2.19f, 2.55f, -2.26f)
                reflectiveCurveToRelative(0.03f, -0.16f, -0.0f, -0.18f)
                lineToRelative(-2.54f, -2.1f)
                close()
                moveTo(24.0f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(17.59f, 16.01f)
                curveToRelative(0f, -0.61f, -0.26f, -1.19f, -0.74f, -1.61f)
                lineToRelative(-2.92f, -2.4f)
                lineToRelative(2.94f, -2.42f)
                curveToRelative(0.95f, -0.8f, 0.95f, -2.38f, 0.01f, -3.18f)
                lineToRelative(-3.4f, -3.02f)
                curveToRelative(-0.44f, -0.39f, -1.06f, -0.48f, -1.59f, -0.24f)
                curveToRelative(-0.53f, 0.24f, -0.88f, 0.77f, -0.88f, 1.35f)
                verticalLineToRelative(5.1f)
                lineToRelative(-2.86f, -2.36f)
                curveToRelative(-0.43f, -0.35f, -1.06f, -0.29f, -1.41f, 0.14f)
                curveToRelative(-0.35f, 0.43f, -0.29f, 1.06f, 0.14f, 1.41f)
                lineToRelative(3.92f, 3.23f)
                lineToRelative(-3.92f, 3.23f)
                curveToRelative(-0.43f, 0.35f, -0.49f, 0.98f, -0.14f, 1.41f)
                curveToRelative(0.35f, 0.43f, 0.98f, 0.49f, 1.41f, 0.14f)
                lineToRelative(2.86f, -2.36f)
                verticalLineToRelative(5.1f)
                curveToRelative(-0.04f, 1.24f, 1.57f, 1.97f, 2.47f, 1.11f)
                lineToRelative(3.4f, -3.03f)
                curveToRelative(0.45f, -0.4f, 0.71f, -0.98f, 0.71f, -1.59f)
                close()
            }
        }.also { _BluetoothCircle = it}
