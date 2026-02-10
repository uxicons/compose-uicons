package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IpAddress: ImageVector? = null

val Icons.Ss.IpAddress: ImageVector
    get() = _IpAddress ?: UXIcon(name = "IpAddress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.4f, 8.5f)
                curveToRelative(0f, 0.5f, -0.4f, 0.9f, -0.9f, 0.9f)
                horizontalLineToRelative(-0.9f)
                verticalLineToRelative(-1.8f)
                horizontalLineToRelative(0.9f)
                curveToRelative(0.5f, 0f, 0.9f, 0.4f, 0.9f, 0.9f)
                close()
                moveTo(22f, 10f)
                curveToRelative(0f, 2.67f, -1.04f, 5.18f, -2.93f, 7.07f)
                lineToRelative(-7.07f, 6.92f)
                lineToRelative(-7.06f, -6.91f)
                curveToRelative(-3.91f, -3.91f, -3.91f, -10.25f, -0.01f, -14.15f)
                curveToRelative(1.89f, -1.89f, 4.4f, -2.93f, 7.07f, -2.93f)
                reflectiveCurveToRelative(5.18f, 1.04f, 7.07f, 2.93f)
                curveToRelative(1.89f, 1.89f, 2.93f, 4.4f, 2.93f, 7.07f)
                close()
                moveTo(10.5f, 6f)
                horizontalLineToRelative(-1.6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                lineTo(10.5f, 6f)
                close()
                moveTo(17f, 8.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(1.6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.9f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                close()
            }
        }.also { _IpAddress = it}
