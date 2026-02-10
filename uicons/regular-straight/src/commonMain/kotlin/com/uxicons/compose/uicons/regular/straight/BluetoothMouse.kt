package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothMouse: ImageVector? = null

val Icons.Rs.BluetoothMouse: ImageVector
    get() = _BluetoothMouse ?: UXIcon(name = "BluetoothMouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(-3.74f)
                curveToRelative(-0.72f, -0.48f, -1.57f, -0.76f, -2.5f, -0.76f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(2f, 7.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(14f, 16f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(12f)
                close()
                moveTo(21f, 5.5f)
                lineTo(24f, 8f)
                lineTo(20f, 11f)
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
        }.also { _BluetoothMouse = it}
