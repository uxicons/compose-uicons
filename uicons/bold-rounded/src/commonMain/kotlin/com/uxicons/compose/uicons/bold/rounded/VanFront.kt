package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VanFront: ImageVector? = null

val Icons.Br.VanFront: ImageVector
    get() = _VanFront ?: UXIcon(name = "VanFront") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 13.0f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-0.23f)
            lineToRelative(-0.53f, -5.58f)
            curveToRelative(-0.22f, -2.34f, -1.91f, -4.28f, -4.19f, -4.83f)
            curveToRelative(-3.28f, -0.79f, -6.82f, -0.79f, -10.1f, 0f)
            curveToRelative(-2.28f, 0.55f, -3.97f, 2.49f, -4.19f, 4.83f)
            lineToRelative(-0.53f, 5.58f)
            horizontalLineToRelative(-0.23f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            verticalLineToRelative(5.5f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            horizontalLineToRelative(12f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-1.5f)
            reflectiveCurveToRelative(0f, 0f, 0f, -0.0f)
            verticalLineToRelative(-5.5f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            close()
            moveTo(5f, 15.0f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-14f)
            close()
            moveTo(7.66f, 3.51f)
            curveToRelative(2.81f, -0.68f, 5.87f, -0.68f, 8.69f, 0f)
            curveToRelative(1.04f, 0.25f, 1.81f, 1.13f, 1.91f, 2.2f)
            lineToRelative(0.6f, 6.29f)
            horizontalLineToRelative(-13.7f)
            lineToRelative(0.6f, -6.29f)
            curveToRelative(0.1f, -1.06f, 0.87f, -1.95f, 1.91f, -2.2f)
            close()
        }
    }.also { _VanFront = it }
