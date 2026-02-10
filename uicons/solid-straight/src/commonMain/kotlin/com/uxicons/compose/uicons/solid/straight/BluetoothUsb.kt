package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothUsb: ImageVector? = null

val Icons.Ss.BluetoothUsb: ImageVector
    get() = _BluetoothUsb ?: UXIcon(name = "BluetoothUsb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14f, 0f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(12f)
                close()
                moveTo(7f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(21f, 18.5f)
                lineTo(24f, 21f)
                lineTo(20f, 24f)
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
                lineToRelative(-3f, 2.5f)
                close()
                moveTo(16f, 11.0f)
                verticalLineToRelative(2.68f)
                lineToRelative(-2f, 2.25f)
                verticalLineToRelative(5.21f)
                curveToRelative(-1.51f, 1.75f, -3.74f, 2.86f, -6.23f, 2.86f)
                curveToRelative(-4.38f, -0.12f, -7.77f, -3.9f, -7.77f, -8.28f)
                verticalLineToRelative(-4.72f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _BluetoothUsb = it}
