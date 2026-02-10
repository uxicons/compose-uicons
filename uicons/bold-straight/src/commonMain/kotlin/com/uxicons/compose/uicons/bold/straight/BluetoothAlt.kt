package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothAlt: ImageVector? = null

val Icons.Bs.BluetoothAlt: ImageVector
    get() = _BluetoothAlt ?: UXIcon(name = "BluetoothAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.34f, 7.03f)
                lineTo(12.32f, 0f)
                horizontalLineToRelative(-2.32f)
                lineToRelative(0.03f, 8.63f)
                lineToRelative(-4.08f, -3.3f)
                lineToRelative(-1.89f, 2.33f)
                lineToRelative(5.37f, 4.33f)
                lineToRelative(-5.37f, 4.33f)
                lineToRelative(1.89f, 2.33f)
                lineToRelative(4.06f, -3.32f)
                verticalLineToRelative(8.65f)
                horizontalLineToRelative(2.21f)
                lineToRelative(8.12f, -7.04f)
                lineToRelative(-6.14f, -4.96f)
                lineToRelative(6.15f, -4.97f)
                close()
                moveTo(13.01f, 4.7f)
                lineToRelative(2.64f, 2.27f)
                lineToRelative(-2.63f, 2.12f)
                lineToRelative(-0.01f, -4.39f)
                close()
                moveTo(15.66f, 17.04f)
                lineToRelative(-2.6f, 2.25f)
                lineToRelative(-0.01f, -4.37f)
                lineToRelative(2.62f, 2.11f)
                close()
            }
        }.also { _BluetoothAlt = it}
