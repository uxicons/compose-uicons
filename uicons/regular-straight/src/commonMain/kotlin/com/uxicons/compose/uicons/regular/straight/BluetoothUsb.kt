package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothUsb: ImageVector? = null

val Icons.Rs.BluetoothUsb: ImageVector
    get() = _BluetoothUsb ?: UXIcon(name = "BluetoothUsb") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 8.18f)
                verticalLineToRelative(-8.18f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(8.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                curveToRelative(1.85f, 0f, 3.57f, -0.56f, 5f, -1.52f)
                verticalLineToRelative(-2.59f)
                curveToRelative(-1.27f, 1.3f, -3.04f, 2.11f, -5f, 2.11f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                close()
                moveTo(14f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(-6f)
                close()
                moveTo(8f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(12f, 6f)
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
            }
        }.also { _BluetoothUsb = it}
