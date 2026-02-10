package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothSpeaker: ImageVector? = null

val Icons.Ss.BluetoothSpeaker: ImageVector
    get() = _BluetoothSpeaker ?: UXIcon(name = "BluetoothSpeaker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(23.5f, 7.87f)
                lineTo(22.5f, 6.13f)
                lineTo(19.0f, 8.13f)
                lineTo(20.0f, 9.87f)
                close()
                moveTo(23.5f, 18.13f)
                lineTo(20.0f, 16.13f)
                lineTo(19.0f, 17.87f)
                lineTo(22.5f, 19.87f)
                close()
                moveTo(18f, 5.46f)
                verticalLineToRelative(15.04f)
                curveToRelative(0f, 2.76f, -5.66f, 3.5f, -9f, 3.5f)
                reflectiveCurveToRelative(-9f, -0.74f, -9f, -3.5f)
                verticalLineToRelative(-15.04f)
                curveToRelative(2.18f, 1.21f, 5.78f, 1.53f, 9f, 1.53f)
                reflectiveCurveToRelative(6.82f, -0.33f, 9f, -1.53f)
                close()
                moveTo(10f, 15.5f)
                lineTo(13f, 13f)
                lineTo(9f, 10f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3.28f)
                lineToRelative(-1.44f, -1.34f)
                lineToRelative(-1.33f, 1.49f)
                lineToRelative(2.27f, 2.08f)
                lineToRelative(-2.25f, 2.08f)
                lineToRelative(1.34f, 1.49f)
                lineToRelative(1.41f, -1.33f)
                verticalLineToRelative(3.24f)
                horizontalLineToRelative(1f)
                lineToRelative(4f, -3f)
                lineToRelative(-3f, -2.5f)
                close()
                moveTo(18f, 2.5f)
                curveToRelative(0f, -1.97f, -5.66f, -2.5f, -9f, -2.5f)
                reflectiveCurveToRelative(-9f, 0.53f, -9f, 2.5f)
                reflectiveCurveToRelative(5.66f, 2.5f, 9f, 2.5f)
                reflectiveCurveToRelative(9f, -0.53f, 9f, -2.5f)
                close()
            }
        }.also { _BluetoothSpeaker = it}
