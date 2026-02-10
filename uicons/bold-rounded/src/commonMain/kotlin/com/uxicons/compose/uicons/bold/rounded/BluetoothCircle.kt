package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothCircle: ImageVector? = null

val Icons.Br.BluetoothCircle: ImageVector
    get() = _BluetoothCircle ?: UXIcon(name = "BluetoothCircle") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(13.86f, 12.0f)
            lineToRelative(2.47f, -2.02f)
            curveToRelative(0.43f, -0.37f, 0.67f, -0.91f, 0.67f, -1.48f)
            curveToRelative(0.0f, -0.57f, -0.24f, -1.11f, -0.66f, -1.48f)
            lineToRelative(-2.97f, -2.64f)
            curveToRelative(-0.42f, -0.37f, -1.02f, -0.46f, -1.53f, -0.23f)
            curveToRelative(-0.51f, 0.23f, -0.84f, 0.74f, -0.84f, 1.3f)
            verticalLineToRelative(4.22f)
            lineToRelative(-2.37f, -1.93f)
            curveToRelative(-0.43f, -0.35f, -1.06f, -0.29f, -1.41f, 0.14f)
            curveToRelative(-0.35f, 0.43f, -0.29f, 1.06f, 0.14f, 1.41f)
            lineToRelative(3.34f, 2.72f)
            lineToRelative(-3.34f, 2.73f)
            curveToRelative(-0.43f, 0.35f, -0.49f, 0.98f, -0.14f, 1.41f)
            curveToRelative(0.35f, 0.43f, 0.98f, 0.49f, 1.41f, 0.14f)
            lineToRelative(2.37f, -1.94f)
            verticalLineToRelative(4.22f)
            curveToRelative(0f, 0.56f, 0.33f, 1.07f, 0.84f, 1.3f)
            curveToRelative(0.19f, 0.08f, 0.39f, 0.12f, 0.58f, 0.12f)
            curveToRelative(0.34f, 0f, 0.68f, -0.12f, 0.95f, -0.36f)
            lineToRelative(2.97f, -2.64f)
            curveToRelative(0.42f, -0.38f, 0.66f, -0.92f, 0.66f, -1.48f)
            curveToRelative(0f, -0.56f, -0.24f, -1.1f, -0.7f, -1.5f)
            lineToRelative(-2.44f, -2.0f)
            close()
            moveTo(13f, 6.7f)
            lineToRelative(2.04f, 1.75f)
            lineToRelative(-2.04f, 1.67f)
            verticalLineToRelative(-3.42f)
            close()
            moveTo(13f, 17.27f)
            verticalLineToRelative(-3.42f)
            lineToRelative(2.01f, 1.63f)
            lineToRelative(-2.01f, 1.79f)
            close()
        }
    }.also { _BluetoothCircle = it }
