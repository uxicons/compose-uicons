package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsbWifi: ImageVector? = null

val Icons.Ss.UsbWifi: ImageVector
    get() = _UsbWifi ?: UXIcon(name = "UsbWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.78f, 19.88f)
                curveToRelative(-1.13f, -1.13f, -3.11f, -1.13f, -4.24f, 0f)
                lineToRelative(-1.41f, -1.41f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.47f, 3.54f, -1.47f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.47f)
                close()
                moveTo(24.02f, 15.64f)
                curveToRelative(-3.51f, -3.51f, -9.22f, -3.51f, -12.73f, 0f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(2.73f, -2.73f, 7.17f, -2.73f, 9.9f, 0f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(16.16f, 22.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(14.0f, 7f)
                horizontalLineToRelative(-12.0f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(7f)
                close()
                moveTo(7f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(11f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                close()
                moveTo(8.46f, 15.64f)
                lineTo(9.88f, 14.22f)
                curveToRelative(1.68f, -1.68f, 3.81f, -2.73f, 6.12f, -3.08f)
                verticalLineToRelative(-0.14f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-12.0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                curveToRelative(2.42f, 0f, 4.58f, -1.08f, 6.05f, -2.78f)
                close()
            }
        }.also { _UsbWifi = it}
