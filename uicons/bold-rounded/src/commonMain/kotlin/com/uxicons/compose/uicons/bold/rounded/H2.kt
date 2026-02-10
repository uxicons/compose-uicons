package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H2: ImageVector? = null

val Icons.Br.H2: ImageVector
    get() = _H2 ?: UXIcon(name = "H2") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.5f)
            lineTo(3f, 13f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(0f, 5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(22.5f, 17f)
            horizontalLineToRelative(-4.77f)
            curveToRelative(0.37f, -0.33f, 0.79f, -0.68f, 1.22f, -1.04f)
            curveToRelative(2.25f, -1.88f, 5.04f, -4.22f, 5.04f, -7.16f)
            curveToRelative(0f, -2.65f, -2.24f, -4.8f, -5.0f, -4.8f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            curveToRelative(1.08f, 0f, 2.0f, 0.82f, 2.0f, 1.8f)
            curveToRelative(0f, 1.53f, -2.2f, 3.38f, -3.97f, 4.86f)
            curveToRelative(-0.94f, 0.78f, -1.82f, 1.52f, -2.43f, 2.24f)
            curveToRelative(-0.64f, 0.75f, -0.78f, 1.78f, -0.36f, 2.67f)
            curveToRelative(0.41f, 0.88f, 1.27f, 1.43f, 2.25f, 1.43f)
            horizontalLineToRelative(6.02f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _H2 = it }
