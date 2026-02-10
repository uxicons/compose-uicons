package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothAlt: ImageVector? = null

val Icons.Ts.BluetoothAlt: ImageVector
    get() = _BluetoothAlt ?: UXIcon(name = "BluetoothAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.81f, 6.51f)
                lineTo(11.68f, 0f)
                horizontalLineToRelative(-0.68f)
                lineTo(11f, 10.8f)
                lineTo(4.8f, 6.1f)
                lineToRelative(-0.6f, 0.8f)
                lineToRelative(6.72f, 5.1f)
                lineToRelative(-6.72f, 5.1f)
                lineToRelative(0.6f, 0.8f)
                lineToRelative(6.2f, -4.7f)
                verticalLineToRelative(10.8f)
                horizontalLineToRelative(0.76f)
                lineToRelative(8.05f, -6.51f)
                lineToRelative(-7.23f, -5.49f)
                lineToRelative(7.23f, -5.49f)
                close()
                moveTo(12f, 1.48f)
                lineToRelative(6.19f, 5.01f)
                lineToRelative(-6.19f, 4.7f)
                lineTo(12f, 1.48f)
                close()
                moveTo(18.19f, 17.51f)
                lineToRelative(-6.19f, 5.01f)
                lineTo(12f, 12.82f)
                lineToRelative(6.19f, 4.7f)
                close()
            }
        }.also { _BluetoothAlt = it}
