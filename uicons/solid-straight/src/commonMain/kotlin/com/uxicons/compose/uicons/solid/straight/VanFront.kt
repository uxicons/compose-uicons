package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VanFront: ImageVector? = null

val Icons.Ss.VanFront: ImageVector
    get() = _VanFront ?: UXIcon(name = "VanFront") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-20f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.29f)
                lineToRelative(0.52f, -5.46f)
                curveToRelative(0.12f, -1.27f, 1.02f, -2.32f, 2.26f, -2.63f)
                curveToRelative(2.15f, -0.53f, 4.64f, -0.91f, 6.93f, -0.91f)
                reflectiveCurveToRelative(4.79f, 0.38f, 6.93f, 0.91f)
                curveToRelative(1.24f, 0.3f, 2.14f, 1.36f, 2.26f, 2.63f)
                lineToRelative(0.52f, 5.46f)
                horizontalLineToRelative(2.29f)
                close()
                moveTo(2f, 14f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(17f, 17.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(4f, 17.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _VanFront = it}
