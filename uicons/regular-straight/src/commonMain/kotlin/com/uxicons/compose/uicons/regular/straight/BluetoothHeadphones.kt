package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothHeadphones: ImageVector? = null

val Icons.Rs.BluetoothHeadphones: ImageVector
    get() = _BluetoothHeadphones ?: UXIcon(name = "BluetoothHeadphones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 14.42f)
                verticalLineToRelative(-1.42f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.04f, -1.24f, -3.8f, -3f, -4.58f)
                close()
                moveTo(19f, 22f)
                verticalLineToRelative(-6f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(3f, 13f)
                verticalLineToRelative(1.42f)
                curveToRelative(-1.76f, 0.77f, -3f, 2.53f, -3f, 4.58f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                curveToRelative(0.69f, 0f, 1.37f, 0.1f, 2f, 0.29f)
                verticalLineToRelative(-2.06f)
                curveToRelative(-0.64f, -0.15f, -1.31f, -0.23f, -2f, -0.23f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                close()
                moveTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
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
        }.also { _BluetoothHeadphones = it}
