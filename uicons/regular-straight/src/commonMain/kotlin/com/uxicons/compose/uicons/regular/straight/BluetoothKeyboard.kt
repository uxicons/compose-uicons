package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothKeyboard: ImageVector? = null

val Icons.Rs.BluetoothKeyboard: ImageVector
    get() = _BluetoothKeyboard ?: UXIcon(name = "BluetoothKeyboard") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(8f, 20f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-8f)
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
                moveTo(4f, 20f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(9f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                close()
                moveTo(21.66f, 12.26f)
                curveToRelative(0.21f, 0.18f, 0.34f, 0.44f, 0.34f, 0.74f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-20f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-0.68f)
                lineToRelative(-1.22f, -1.32f)
                horizontalLineToRelative(-2.78f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-8f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-11f)
                curveToRelative(0f, -0.75f, -0.28f, -1.42f, -0.74f, -1.95f)
                lineToRelative(-1.61f, 1.21f)
                close()
            }
        }.also { _BluetoothKeyboard = it}
