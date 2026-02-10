package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothAlt: ImageVector? = null

val Icons.Ss.BluetoothAlt: ImageVector
    get() = _BluetoothAlt ?: UXIcon(name = "BluetoothAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.59f, 7.06f)
                lineTo(12.37f, 0f)
                horizontalLineToRelative(-1.37f)
                lineTo(11f, 9.75f)
                lineTo(5.6f, 5.7f)
                lineToRelative(-1.2f, 1.6f)
                lineToRelative(6.27f, 4.7f)
                lineToRelative(-6.27f, 4.7f)
                lineToRelative(1.2f, 1.6f)
                lineToRelative(5.4f, -4.05f)
                verticalLineToRelative(9.75f)
                horizontalLineToRelative(1.46f)
                lineToRelative(8.13f, -7.06f)
                lineToRelative(-6.59f, -4.94f)
                lineToRelative(6.59f, -4.94f)
                close()
                moveTo(13f, 3.12f)
                lineToRelative(4.41f, 3.82f)
                lineToRelative(-4.41f, 3.31f)
                lineTo(13f, 3.12f)
                close()
                moveTo(17.41f, 17.06f)
                lineToRelative(-4.41f, 3.82f)
                verticalLineToRelative(-7.13f)
                lineToRelative(4.41f, 3.31f)
                close()
            }
        }.also { _BluetoothAlt = it}
