package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VanFront: ImageVector? = null

val Icons.Rr.VanFront: ImageVector
    get() = _VanFront ?: UXIcon(name = "VanFront") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-0.26f)
                lineToRelative(-0.52f, -5.97f)
                curveToRelative(-0.19f, -2.17f, -1.74f, -3.95f, -3.87f, -4.44f)
                curveToRelative(-3.38f, -0.78f, -7.33f, -0.78f, -10.71f, -0.0f)
                curveToRelative(-2.13f, 0.49f, -3.68f, 2.27f, -3.87f, 4.44f)
                lineToRelative(-0.52f, 5.97f)
                horizontalLineToRelative(-0.26f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                curveToRelative(1.21f, 0f, 2.22f, -0.86f, 2.45f, -2f)
                horizontalLineToRelative(10.1f)
                curveToRelative(0.23f, 1.14f, 1.24f, 2f, 2.45f, 2f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(4f, 20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                close()
                moveTo(7.1f, 2.54f)
                curveToRelative(3.09f, -0.71f, 6.72f, -0.71f, 9.81f, 0f)
                curveToRelative(1.28f, 0.29f, 2.21f, 1.37f, 2.33f, 2.67f)
                lineToRelative(0.68f, 7.79f)
                horizontalLineToRelative(-15.82f)
                lineToRelative(0.68f, -7.8f)
                curveToRelative(0.11f, -1.3f, 1.05f, -2.37f, 2.33f, -2.67f)
                close()
            }
        }.also { _VanFront = it}
