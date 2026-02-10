package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothUsb: ImageVector? = null

val Icons.Bs.BluetoothUsb: ImageVector
    get() = _BluetoothUsb ?: UXIcon(name = "BluetoothUsb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 18.5f)
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
                lineToRelative(-3f, 2.5f)
                close()
                moveTo(15f, 11f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                curveToRelative(2.42f, 0f, 4.54f, -1.46f, 5.5f, -3.53f)
                verticalLineToRelative(4.63f)
                curveToRelative(-1.52f, 1.19f, -3.42f, 1.9f, -5.5f, 1.9f)
                curveToRelative(-4.96f, -0.0f, -9f, -4.04f, -9f, -9.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.21f, 0.86f, -2.22f, 2f, -2.45f)
                verticalLineToRelative(-8.05f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(8.05f)
                curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
                verticalLineToRelative(1.14f)
                lineToRelative(-3f, 3.31f)
                close()
                moveTo(13f, 8f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _BluetoothUsb = it}
