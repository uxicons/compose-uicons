package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightCeiling: ImageVector? = null

val Icons.Br.LightCeiling: ImageVector
    get() = _LightCeiling ?: UXIcon(name = "LightCeiling") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.74f, 13.98f)
            curveToRelative(-1.49f, -4.25f, -5.58f, -7.33f, -10.24f, -7.89f)
            lineTo(13.5f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(4.6f)
            curveTo(5.83f, 6.65f, 1.74f, 9.73f, 0.26f, 13.98f)
            curveToRelative(-0.48f, 1.39f, -0.27f, 2.93f, 0.58f, 4.12f)
            curveToRelative(0.85f, 1.2f, 2.19f, 1.89f, 3.66f, 1.89f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.48f, 0f, 2.81f, -0.69f, 3.66f, -1.89f)
            curveToRelative(0.85f, -1.2f, 1.06f, -2.74f, 0.58f, -4.12f)
            close()
            moveTo(20.72f, 16.37f)
            curveToRelative(-0.28f, 0.4f, -0.73f, 0.63f, -1.22f, 0.63f)
            lineTo(4.5f, 17f)
            curveToRelative(-0.49f, 0f, -0.93f, -0.23f, -1.22f, -0.63f)
            curveToRelative(-0.29f, -0.41f, -0.36f, -0.92f, -0.19f, -1.4f)
            curveToRelative(1.23f, -3.52f, 4.89f, -5.97f, 8.91f, -5.97f)
            reflectiveCurveToRelative(7.68f, 2.46f, 8.91f, 5.97f)
            curveToRelative(0.17f, 0.48f, 0.1f, 0.99f, -0.19f, 1.4f)
            close()
        }
    }.also { _LightCeiling = it }
