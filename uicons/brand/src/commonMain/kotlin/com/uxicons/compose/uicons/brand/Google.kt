package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Google: ImageVector? = null

val Icons.Brand.Google: ImageVector
    get() = _Google ?: UXIcon(name = "Google") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.48f, 14.27f)
            verticalLineToRelative(-3.28f)
            horizontalLineToRelative(11.05f)
            curveToRelative(0.11f, 0.57f, 0.16f, 1.25f, 0.16f, 1.98f)
            curveToRelative(0f, 2.46f, -0.67f, 5.5f, -2.84f, 7.67f)
            curveTo(18.74f, 22.83f, 16.05f, 24f, 12.48f, 24f)
            curveTo(5.87f, 24f, 0.31f, 18.61f, 0.31f, 12f)
            reflectiveCurveTo(5.87f, 0f, 12.48f, 0f)
            curveToRelative(3.66f, 0f, 6.26f, 1.44f, 8.22f, 3.31f)
            lineTo(18.39f, 5.62f)
            curveToRelative(-1.4f, -1.32f, -3.31f, -2.34f, -5.91f, -2.34f)
            curveTo(7.65f, 3.28f, 3.87f, 7.17f, 3.87f, 12f)
            reflectiveCurveToRelative(3.78f, 8.72f, 8.61f, 8.72f)
            curveToRelative(3.13f, 0f, 4.92f, -1.26f, 6.06f, -2.4f)
            curveToRelative(0.93f, -0.93f, 1.54f, -2.25f, 1.78f, -4.06f)
            lineTo(12.48f, 14.27f)
            close()
        }
    }.also { _Google = it }
