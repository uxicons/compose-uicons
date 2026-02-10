package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothSpeaker: ImageVector? = null

val Icons.Rs.BluetoothSpeaker: ImageVector
    get() = _BluetoothSpeaker ?: UXIcon(name = "BluetoothSpeaker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                close()
                moveTo(23.5f, 6.87f)
                lineTo(22.5f, 5.13f)
                lineTo(19.0f, 7.13f)
                lineTo(20.0f, 8.87f)
                close()
                moveTo(19.0f, 16.87f)
                lineTo(22.5f, 18.87f)
                lineTo(23.5f, 17.13f)
                lineTo(20.0f, 15.13f)
                close()
                moveTo(9f, 9f)
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
                lineToRelative(3f, -2.5f)
                lineToRelative(-4f, -3f)
                close()
                moveTo(18f, 3.5f)
                verticalLineToRelative(17f)
                curveToRelative(0f, 2.76f, -5.66f, 3.5f, -9f, 3.5f)
                reflectiveCurveToRelative(-9f, -0.74f, -9f, -3.5f)
                verticalLineToRelative(-17f)
                curveToRelative(0f, -2.76f, 5.66f, -3.5f, 9f, -3.5f)
                reflectiveCurveToRelative(9f, 0.74f, 9f, 3.5f)
                close()
                moveTo(2.03f, 3.5f)
                curveToRelative(0.36f, 0.48f, 2.73f, 1.5f, 6.97f, 1.5f)
                reflectiveCurveToRelative(6.61f, -1.02f, 6.97f, -1.5f)
                curveToRelative(-0.37f, -0.48f, -2.73f, -1.5f, -6.97f, -1.5f)
                reflectiveCurveToRelative(-6.61f, 1.02f, -6.97f, 1.5f)
                close()
                moveTo(16.01f, 20.44f)
                lineTo(16.0f, 5.83f)
                curveToRelative(-1.95f, 0.88f, -4.92f, 1.17f, -7.0f, 1.17f)
                reflectiveCurveToRelative(-5.05f, -0.29f, -7f, -1.17f)
                verticalLineToRelative(14.66f)
                curveToRelative(0.19f, 0.39f, 2.57f, 1.5f, 7f, 1.5f)
                reflectiveCurveToRelative(6.81f, -1.11f, 7.01f, -1.56f)
                close()
            }
        }.also { _BluetoothSpeaker = it}
