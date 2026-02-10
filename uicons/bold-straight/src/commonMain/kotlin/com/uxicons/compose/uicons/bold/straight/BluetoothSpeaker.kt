package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothSpeaker: ImageVector? = null

val Icons.Bs.BluetoothSpeaker: ImageVector
    get() = _BluetoothSpeaker ?: UXIcon(name = "BluetoothSpeaker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11f)
                lineToRelative(-3f, 2.5f)
                lineToRelative(3f, 2.5f)
                lineToRelative(-4f, 3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-3.24f)
                lineToRelative(-1.41f, 1.33f)
                lineToRelative(-1.34f, -1.49f)
                lineToRelative(2.25f, -2.08f)
                lineToRelative(-2.27f, -2.08f)
                lineToRelative(1.33f, -1.49f)
                lineToRelative(1.44f, 1.34f)
                verticalLineToRelative(-3.28f)
                horizontalLineToRelative(1f)
                lineToRelative(4f, 3f)
                close()
                moveTo(18f, 4f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.82f, -1.56f, 4f, -9f, 4f)
                reflectiveCurveToRelative(-9f, -2.17f, -9f, -4f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -1.82f, 1.56f, -4f, 9f, -4f)
                reflectiveCurveToRelative(9f, 2.17f, 9f, 4f)
                close()
                moveTo(15f, 19.91f)
                verticalLineToRelative(-14.69f)
                curveToRelative(-1.21f, 0.47f, -3.17f, 0.77f, -6f, 0.77f)
                reflectiveCurveToRelative(-4.79f, -0.3f, -6f, -0.77f)
                verticalLineToRelative(14.69f)
                curveToRelative(0.28f, 0.32f, 1.84f, 1.09f, 6f, 1.09f)
                reflectiveCurveToRelative(5.72f, -0.77f, 6f, -1.09f)
                close()
                moveTo(20f, 10.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                close()
                moveTo(23.74f, 7.3f)
                lineTo(22.26f, 4.7f)
                lineTo(18.76f, 6.7f)
                lineTo(20.24f, 9.3f)
                close()
                moveTo(18.76f, 17.3f)
                lineTo(22.26f, 19.3f)
                lineTo(23.74f, 16.7f)
                lineTo(20.24f, 14.7f)
                close()
            }
        }.also { _BluetoothSpeaker = it}
