package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BluetoothHeadphones: ImageVector? = null

val Icons.Bs.BluetoothHeadphones: ImageVector
    get() = _BluetoothHeadphones ?: UXIcon(name = "BluetoothHeadphones") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 13f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(2.5f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                reflectiveCurveToRelative(-2.47f, -5.5f, -5.5f, -5.5f)
                close()
                moveTo(19f, 20.95f)
                verticalLineToRelative(-4.9f)
                curveToRelative(1.14f, 0.23f, 2f, 1.24f, 2f, 2.45f)
                reflectiveCurveToRelative(-0.86f, 2.22f, -2f, 2.45f)
                close()
                moveTo(3f, 12f)
                verticalLineToRelative(1.61f)
                curveToRelative(-1.78f, 0.91f, -3f, 2.76f, -3f, 4.89f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                curveToRelative(0.7f, 0f, 1.37f, 0.14f, 2f, 0.36f)
                verticalLineToRelative(-3.12f)
                curveToRelative(-0.64f, -0.15f, -1.31f, -0.24f, -2f, -0.24f)
                curveToRelative(-4.96f, 0f, -9f, 4.04f, -9f, 9f)
                close()
                moveTo(5f, 20.95f)
                curveToRelative(-1.14f, -0.23f, -2f, -1.24f, -2f, -2.45f)
                reflectiveCurveToRelative(0.86f, -2.22f, 2f, -2.45f)
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
