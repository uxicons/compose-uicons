package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothKeyboard: ImageVector? = null

val Icons.Ss.BluetoothKeyboard: ImageVector
    get() = _BluetoothKeyboard ?: UXIcon(name = "BluetoothKeyboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 11f)
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
                lineToRelative(3f, 2.5f)
                lineToRelative(-4f, 3f)
                close()
                moveTo(23.26f, 11.05f)
                lineTo(20.67f, 13f)
                horizontalLineToRelative(-2.06f)
                lineToRelative(-2.88f, -3f)
                horizontalLineToRelative(-2.72f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.75f, -0.28f, -1.42f, -0.74f, -1.95f)
                close()
                moveTo(9f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(6f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(7f, 16f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(16f, 20f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8f)
                close()
                moveTo(20f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(20f, 16f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(6f)
                close()
            }
        }.also { _BluetoothKeyboard = it}
