package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassAlt: ImageVector? = null

val Icons.Br.CompassAlt: ImageVector
    get() = _CompassAlt ?: UXIcon(name = "CompassAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 2.12f)
            verticalLineToRelative(-0.61f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.61f)
            curveTo(5.14f, 2.85f, 1f, 7.45f, 1f, 13f)
            curveToRelative(0f, 6.07f, 4.93f, 11f, 11f, 11f)
            reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
            curveToRelative(0f, -5.55f, -4.14f, -10.15f, -9.5f, -10.88f)
            close()
            moveTo(13.5f, 20.85f)
            verticalLineToRelative(-0.35f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.35f)
            curveToRelative(-3.21f, -0.61f, -5.74f, -3.15f, -6.35f, -6.35f)
            horizontalLineToRelative(0.35f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-0.35f)
            curveToRelative(0.61f, -3.21f, 3.15f, -5.74f, 6.35f, -6.35f)
            verticalLineToRelative(0.35f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.35f)
            curveToRelative(3.21f, 0.61f, 5.74f, 3.15f, 6.35f, 6.35f)
            horizontalLineToRelative(-0.35f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.35f)
            curveToRelative(-0.61f, 3.21f, -3.15f, 5.74f, -6.35f, 6.35f)
            close()
            moveTo(16.48f, 16.5f)
            curveToRelative(0.27f, 0.62f, -0.36f, 1.25f, -0.98f, 0.98f)
            lineToRelative(-4.84f, -2.47f)
            curveToRelative(-0.3f, -0.13f, -0.54f, -0.37f, -0.67f, -0.67f)
            lineToRelative(-2.43f, -4.84f)
            curveToRelative(-0.27f, -0.62f, 0.36f, -1.25f, 0.98f, -0.98f)
            lineToRelative(4.79f, 2.47f)
            curveToRelative(0.3f, 0.13f, 0.54f, 0.37f, 0.67f, 0.67f)
            lineToRelative(2.47f, 4.84f)
            close()
        }
    }.also { _CompassAlt = it }
