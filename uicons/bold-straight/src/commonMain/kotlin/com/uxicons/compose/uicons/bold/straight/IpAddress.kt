package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IpAddress: ImageVector? = null

val Icons.Bs.IpAddress: ImageVector
    get() = _IpAddress ?: UXIcon(name = "IpAddress") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.07f, 2.94f)
                horizontalLineToRelative(0f)
                curveTo(17.18f, 1.05f, 14.67f, 0.01f, 12f, 0.01f)
                reflectiveCurveToRelative(-5.18f, 1.04f, -7.07f, 2.93f)
                curveToRelative(-3.9f, 3.9f, -3.9f, 10.24f, 0.01f, 14.15f)
                lineToRelative(7.06f, 6.91f)
                lineToRelative(7.07f, -6.92f)
                curveToRelative(3.9f, -3.9f, 3.9f, -10.24f, 0f, -14.14f)
                close()
                moveTo(16.96f, 14.95f)
                lineToRelative(-4.96f, 4.85f)
                lineToRelative(-4.95f, -4.84f)
                curveToRelative(-2.73f, -2.73f, -2.73f, -7.17f, 0f, -9.9f)
                curveToRelative(1.32f, -1.32f, 3.08f, -2.05f, 4.95f, -2.05f)
                reflectiveCurveToRelative(3.63f, 0.73f, 4.95f, 2.05f)
                curveToRelative(2.73f, 2.73f, 2.73f, 7.17f, 0.01f, 9.89f)
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
