package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothMouse: ImageVector? = null

val Icons.Bs.BluetoothMouse: ImageVector
    get() = _BluetoothMouse ?: UXIcon(name = "BluetoothMouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 5.5f)
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
                moveTo(15.7f, 10f)
                lineTo(18f, 12.57f)
                verticalLineToRelative(2.42f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveToRelative(-9f, -4.04f, -9f, -9f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(2f)
                curveToRelative(0.52f, 0f, 1.02f, 0.08f, 1.5f, 0.21f)
                verticalLineToRelative(3.3f)
                curveToRelative(-0.42f, -0.32f, -0.94f, -0.51f, -1.5f, -0.51f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(5.2f)
                close()
                moveTo(3f, 8.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(15f, 13f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                close()
            }
        }.also { _BluetoothMouse = it}
