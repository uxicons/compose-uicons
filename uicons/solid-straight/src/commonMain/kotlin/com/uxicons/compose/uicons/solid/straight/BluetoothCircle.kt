package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothCircle: ImageVector? = null

val Icons.Ss.BluetoothCircle: ImageVector
    get() = _BluetoothCircle ?: UXIcon(name = "BluetoothCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.12f, 8.01f)
                lineToRelative(-2.1f, 1.96f)
                verticalLineToRelative(-3.87f)
                lineToRelative(2.1f, 1.92f)
                close()
                moveTo(13.02f, 17.91f)
                lineToRelative(2.1f, -1.92f)
                lineToRelative(-2.1f, -1.97f)
                verticalLineToRelative(3.89f)
                close()
                moveTo(24f, 12.0f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(13.78f, 11.99f)
                lineToRelative(4.29f, -4.0f)
                lineTo(12.61f, 3f)
                horizontalLineToRelative(-1.58f)
                verticalLineToRelative(6.4f)
                lineToRelative(-3.19f, -3.0f)
                lineToRelative(-1.37f, 1.46f)
                lineToRelative(4.39f, 4.12f)
                lineToRelative(-4.45f, 4.14f)
                lineToRelative(1.36f, 1.46f)
                lineToRelative(3.25f, -3.03f)
                verticalLineToRelative(6.44f)
                horizontalLineToRelative(1.58f)
                lineToRelative(5.46f, -4.99f)
                lineToRelative(-4.28f, -4.02f)
                close()
            }
        }.also { _BluetoothCircle = it}
