package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioWaves: ImageVector? = null

val Icons.Br.RadioWaves: ImageVector
    get() = _RadioWaves ?: UXIcon(name = "RadioWaves") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 13f)
            lineTo(22.5f, 13f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5.66f)
            curveTo(15.77f, 2.83f, 14.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(-3.77f, 2.83f, -4.84f, 10f)
            lineTo(1.5f, 10f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(12f, 3.2f)
            curveToRelative(0.37f, 0.54f, 1.08f, 2.15f, 1.81f, 6.8f)
            horizontalLineToRelative(-3.62f)
            curveToRelative(0.72f, -4.65f, 1.44f, -6.26f, 1.81f, -6.8f)
            close()
            moveTo(8.97f, 16.8f)
            curveToRelative(-0.76f, 3.74f, -1.81f, 7.2f, -4.35f, 7.2f)
            curveTo(1.91f, 24f, 0.78f, 20.36f, 0.03f, 16.81f)
            curveToRelative(-0.17f, -0.81f, 0.35f, -1.61f, 1.16f, -1.78f)
            curveToRelative(0.81f, -0.17f, 1.61f, 0.35f, 1.78f, 1.16f)
            curveToRelative(0.66f, 3.13f, 1.29f, 4.26f, 1.6f, 4.65f)
            curveToRelative(0.29f, -0.42f, 0.85f, -1.58f, 1.47f, -4.63f)
            curveToRelative(0.17f, -0.81f, 0.95f, -1.34f, 1.77f, -1.17f)
            curveToRelative(0.81f, 0.16f, 1.34f, 0.96f, 1.17f, 1.77f)
            close()
            moveTo(23.97f, 16.8f)
            curveToRelative(-0.76f, 3.74f, -1.81f, 7.2f, -4.35f, 7.2f)
            curveToRelative(-2.7f, 0f, -3.83f, -3.63f, -4.58f, -7.19f)
            curveToRelative(-0.17f, -0.81f, 0.35f, -1.61f, 1.16f, -1.78f)
            curveToRelative(0.81f, -0.17f, 1.61f, 0.35f, 1.78f, 1.16f)
            curveToRelative(0.66f, 3.13f, 1.29f, 4.26f, 1.6f, 4.65f)
            curveToRelative(0.29f, -0.42f, 0.85f, -1.58f, 1.47f, -4.63f)
            curveToRelative(0.16f, -0.81f, 0.95f, -1.34f, 1.77f, -1.17f)
            curveToRelative(0.81f, 0.16f, 1.34f, 0.96f, 1.17f, 1.77f)
            close()
        }
    }.also { _RadioWaves = it }
