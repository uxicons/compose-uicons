package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampStreet: ImageVector? = null

val Icons.Ts.LampStreet: ImageVector
    get() = _LampStreet ?: UXIcon(name = "LampStreet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15.5f)
                curveToRelative(0f, -4.56f, -3.58f, -8.29f, -8.06f, -8.52f)
                curveToRelative(-0.5f, -3.93f, -3.87f, -6.98f, -7.93f, -6.98f)
                curveTo(3.59f, 0f, 0f, 3.59f, 0f, 8f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(1f)
                lineTo(1f, 8f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                curveToRelative(3.52f, 0f, 6.43f, 2.61f, 6.93f, 5.99f)
                curveToRelative(-4.42f, 0.3f, -7.93f, 4.0f, -7.93f, 8.51f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-0.5f)
                close()
                moveTo(17f, 16.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(8.02f, 15f)
                curveToRelative(0.25f, -3.76f, 3.25f, -6.77f, 6.98f, -7.02f)
                curveToRelative(0f, 0.01f, 0f, 0.01f, 0f, 0.02f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -0.01f, 0f, -0.01f, 0f, -0.02f)
                curveToRelative(3.74f, 0.25f, 6.74f, 3.26f, 6.98f, 7.02f)
                horizontalLineToRelative(-14.97f)
                close()
            }
        }.also { _LampStreet = it}
