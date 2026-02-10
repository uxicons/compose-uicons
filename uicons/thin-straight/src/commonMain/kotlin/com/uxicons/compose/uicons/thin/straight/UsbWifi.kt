package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UsbWifi: ImageVector? = null

val Icons.Ts.UsbWifi: ImageVector
    get() = _UsbWifi ?: UXIcon(name = "UsbWifi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 23f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.56f)
                curveToRelative(0.33f, -0.03f, 0.67f, -0.05f, 1f, -0.05f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                verticalLineToRelative(-8.05f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(8.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                verticalLineToRelative(4.5f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                curveToRelative(2.02f, 0f, 3.87f, -0.67f, 5.37f, -1.8f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(-1.31f, 0.95f, -2.92f, 1.51f, -4.66f, 1.51f)
                close()
                moveTo(15f, 1f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-12f)
                verticalLineToRelative(-7f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                close()
                moveTo(12f, 6f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                close()
                moveTo(19f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(20.83f, 20.17f)
                lineTo(20.12f, 20.88f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(1.56f, -1.56f, 4.1f, -1.56f, 5.66f, 0f)
                close()
                moveTo(23.66f, 17.34f)
                lineTo(22.95f, 18.05f)
                curveToRelative(-2.73f, -2.73f, -7.17f, -2.73f, -9.9f, 0f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(3.12f, -3.12f, 8.19f, -3.12f, 11.31f, 0f)
                close()
            }
        }.also { _UsbWifi = it}
