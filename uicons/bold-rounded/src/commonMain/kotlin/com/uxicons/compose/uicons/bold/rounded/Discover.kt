package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Discover: ImageVector? = null

val Icons.Br.Discover: ImageVector
    get() = _Discover ?: UXIcon(name = "Discover") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.42f, 19.3f)
            curveToRelative(0.36f, -0.69f, 0.58f, -1.46f, 0.58f, -2.29f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            curveToRelative(0.83f, 0f, 1.6f, -0.22f, 2.29f, -0.58f)
            lineToRelative(2.15f, 2.15f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(-2.15f, -2.15f)
            close()
            moveTo(17f, 19f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            close()
            moveTo(18.5f, 1f)
            lineTo(5.5f, 1f)
            curveTo(2.46f, 1f, 0f, 3.46f, 0f, 6.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.04f, 2.46f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(4.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(18f)
            verticalLineToRelative(2.48f)
            curveToRelative(0f, 0.82f, 0.66f, 1.49f, 1.48f, 1.5f)
            curveToRelative(0.84f, 0.01f, 1.52f, -0.66f, 1.52f, -1.5f)
            verticalLineToRelative(-3.98f)
            curveToRelative(0f, -3.04f, -2.46f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(4.5f, 6f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(9.5f, 6f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _Discover = it }
