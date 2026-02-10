package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothCircle: ImageVector? = null

val Icons.Tr.BluetoothCircle: ImageVector
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
                moveTo(12.72f, 12.0f)
                lineToRelative(3.75f, -2.6f)
                curveToRelative(0.7f, -0.61f, 0.7f, -1.74f, -0.03f, -2.35f)
                lineToRelative(-3.85f, -2.8f)
                curveToRelative(-0.58f, -0.55f, -1.62f, -0.09f, -1.59f, 0.71f)
                verticalLineToRelative(5.86f)
                lineToRelative(-3.22f, -2.22f)
                curveToRelative(-0.53f, -0.38f, -1.11f, 0.46f, -0.57f, 0.82f)
                lineToRelative(3.75f, 2.59f)
                lineToRelative(-3.75f, 2.59f)
                curveToRelative(-0.54f, 0.36f, 0.04f, 1.2f, 0.57f, 0.82f)
                lineToRelative(3.22f, -2.23f)
                verticalLineToRelative(5.86f)
                curveToRelative(-0.04f, 0.77f, 0.98f, 1.26f, 1.55f, 0.74f)
                lineToRelative(3.93f, -2.87f)
                curveToRelative(0.7f, -0.62f, 0.7f, -1.74f, -0.05f, -2.36f)
                lineToRelative(-3.71f, -2.56f)
                close()
                moveTo(11.96f, 5.02f)
                lineToRelative(3.85f, 2.8f)
                curveToRelative(0.23f, 0.18f, 0.23f, 0.62f, 0.04f, 0.79f)
                lineToRelative(-3.88f, 2.68f)
                lineToRelative(-0.02f, -6.28f)
                close()
                moveTo(15.85f, 16.14f)
                lineToRelative(-3.85f, 2.9f)
                lineToRelative(-0.02f, -6.34f)
                lineToRelative(3.83f, 2.65f)
                curveToRelative(0.23f, 0.18f, 0.24f, 0.62f, 0.04f, 0.8f)
                close()
            }
        }.also { _BluetoothCircle = it}
