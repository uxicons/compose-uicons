package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothKeyboard: ImageVector? = null

val Icons.Bs.BluetoothKeyboard: ImageVector
    get() = _BluetoothKeyboard ?: UXIcon(name = "BluetoothKeyboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(13f, 11f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 16f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(5f, 19f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(-11.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-7.5f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(14.5f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(24f, 3f)
                lineTo(20f, 0f)
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
                close()
                moveTo(19f, 13.66f)
                lineTo(16.61f, 11f)
                horizontalLineToRelative(-1.61f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _BluetoothKeyboard = it}
