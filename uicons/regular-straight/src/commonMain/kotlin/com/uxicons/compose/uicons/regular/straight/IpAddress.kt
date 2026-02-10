package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IpAddress: ImageVector? = null

val Icons.Rs.IpAddress: ImageVector
    get() = _IpAddress ?: UXIcon(name = "IpAddress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.07f, 2.93f)
                curveToRelative(-1.89f, -1.89f, -4.4f, -2.93f, -7.07f, -2.93f)
                reflectiveCurveToRelative(-5.18f, 1.04f, -7.07f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0.01f, 14.15f)
                lineToRelative(7.06f, 6.91f)
                lineToRelative(7.07f, -6.92f)
                curveToRelative(1.89f, -1.89f, 2.93f, -4.4f, 2.93f, -7.07f)
                reflectiveCurveToRelative(-1.04f, -5.18f, -2.93f, -7.07f)
                close()
                moveTo(17.66f, 15.65f)
                lineToRelative(-5.66f, 5.54f)
                lineToRelative(-5.66f, -5.53f)
                curveToRelative(-1.51f, -1.51f, -2.34f, -3.52f, -2.34f, -5.66f)
                reflectiveCurveToRelative(0.83f, -4.15f, 2.34f, -5.66f)
                reflectiveCurveToRelative(3.52f, -2.34f, 5.66f, -2.34f)
                reflectiveCurveToRelative(4.15f, 0.83f, 5.66f, 2.34f)
                curveToRelative(1.51f, 1.51f, 2.34f, 3.52f, 2.34f, 5.66f)
                reflectiveCurveToRelative(-0.83f, 4.15f, -2.34f, 5.65f)
                close()
                moveTo(8.9f, 6f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-1.6f)
                lineTo(8.9f, 6f)
                close()
                moveTo(14.5f, 6f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.9f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(14.5f, 9.4f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f)
                close()
            }
        }.also { _IpAddress = it}
