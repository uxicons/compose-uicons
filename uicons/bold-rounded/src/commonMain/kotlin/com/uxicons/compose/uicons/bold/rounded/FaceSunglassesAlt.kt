package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaceSunglassesAlt: ImageVector? = null

val Icons.Br.FaceSunglassesAlt: ImageVector
    get() = _FaceSunglassesAlt ?: UXIcon(name = "FaceSunglassesAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 3f)
            curveToRelative(3.11f, 0f, 5.86f, 1.59f, 7.48f, 4f)
            horizontalLineToRelative(-3.83f)
            curveToRelative(-0.98f, 0f, -1.91f, 0.37f, -2.65f, 1f)
            horizontalLineToRelative(-1.99f)
            curveToRelative(-0.74f, -0.63f, -1.67f, -1f, -2.65f, -1f)
            horizontalLineToRelative(-3.83f)
            curveToRelative(1.62f, -2.41f, 4.37f, -4f, 7.48f, -4f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.86f, 0f, -8.82f, -3.88f, -8.98f, -8.7f)
            curveToRelative(0.6f, 0.43f, 1.32f, 0.7f, 2.11f, 0.7f)
            horizontalLineToRelative(2.12f)
            curveToRelative(1.39f, 0f, 2.62f, -0.8f, 3.21f, -2f)
            horizontalLineToRelative(3.09f)
            curveToRelative(0.6f, 1.2f, 1.83f, 2f, 3.21f, 2f)
            horizontalLineToRelative(2.12f)
            curveToRelative(0.78f, 0f, 1.51f, -0.26f, 2.11f, -0.7f)
            curveToRelative(-0.16f, 4.82f, -4.12f, 8.7f, -8.98f, 8.7f)
            close()
            moveTo(17.23f, 14.39f)
            curveToRelative(0.61f, 0.56f, 0.65f, 1.51f, 0.09f, 2.12f)
            curveToRelative(-2.28f, 2.49f, -4.86f, 2.49f, -5.83f, 2.49f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.78f, 0f, 2.23f, 0f, 3.62f, -1.51f)
            curveToRelative(0.56f, -0.61f, 1.51f, -0.65f, 2.12f, -0.09f)
            close()
        }
    }.also { _FaceSunglassesAlt = it }
