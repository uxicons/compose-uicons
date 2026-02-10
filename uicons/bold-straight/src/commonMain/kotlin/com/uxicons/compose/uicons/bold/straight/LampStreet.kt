package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LampStreet: ImageVector? = null

val Icons.Bs.LampStreet: ImageVector
    get() = _LampStreet ?: UXIcon(name = "LampStreet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15.5f)
                curveToRelative(0f, -4.21f, -3.08f, -7.72f, -7.11f, -8.39f)
                curveTo(16.22f, 3.08f, 12.71f, 0f, 8.5f, 0f)
                curveTo(3.81f, 0f, 0f, 3.81f, 0f, 8.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-15.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                curveToRelative(2.57f, 0f, 4.74f, 1.77f, 5.34f, 4.16f)
                curveToRelative(-3.89f, 0.78f, -6.84f, 4.22f, -6.84f, 8.34f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.5f)
                close()
                moveTo(10.21f, 14f)
                curveToRelative(0.65f, -2.31f, 2.78f, -4f, 5.29f, -4f)
                reflectiveCurveToRelative(4.64f, 1.69f, 5.29f, 4f)
                horizontalLineToRelative(-10.58f)
                close()
            }
        }.also { _LampStreet = it}
