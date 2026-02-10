package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothMouse: ImageVector? = null

val Icons.Ss.BluetoothMouse: ImageVector
    get() = _BluetoothMouse ?: UXIcon(name = "BluetoothMouse") {
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
                moveTo(7f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(2.56f)
                horizontalLineToRelative(7f)
                close()
                moveTo(15.77f, 10.06f)
                lineTo(14f, 8.09f)
                verticalLineToRelative(-4.32f)
                curveToRelative(-0.72f, -0.48f, -1.57f, -0.76f, -2.5f, -0.76f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(7.06f)
                close()
                moveTo(0f, 16f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-3.94f)
                horizontalLineToRelative(-16f)
                close()
            }
        }.also { _BluetoothMouse = it}
