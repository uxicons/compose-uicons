package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Power: ImageVector? = null

val Icons.Br.Power: ImageVector
    get() = _Power ?: UXIcon(name = "Power", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(256.06f, 0f)
            lineTo(256.06f, 0f)
            curveToRelative(17.67f, 0f, 32f, 14.33f, 32f, 32f)
            verticalLineToRelative(106.67f)
            curveToRelative(0f, 17.67f, -14.33f, 32f, -32f, 32f)
            lineToRelative(0f, 0f)
            curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
            verticalLineTo(32f)
            curveTo(224.06f, 14.33f, 238.39f, 0f, 256.06f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(330.73f, 105.39f)
            lineTo(330.73f, 105.39f)
            curveToRelative(-0.16f, 10.74f, 5.26f, 20.8f, 14.31f, 26.58f)
            curveToRelative(80.43f, 49.14f, 105.8f, 154.18f, 56.65f, 234.62f)
            reflectiveCurveTo(247.51f, 472.38f, 167.08f, 423.24f)
            reflectiveCurveTo(61.28f, 269.05f, 110.43f, 188.62f)
            curveToRelative(14.04f, -22.98f, 33.32f, -42.31f, 56.27f, -56.42f)
            curveToRelative(9.21f, -5.78f, 14.77f, -15.92f, 14.7f, -26.8f)
            lineToRelative(0f, 0f)
            curveToRelative(0.05f, -17.67f, -14.24f, -32.04f, -31.91f, -32.09f)
            curveToRelative(-6.07f, -0.02f, -12.02f, 1.69f, -17.16f, 4.93f)
            curveTo(22.23f, 146.63f, -11.58f, 291.32f, 56.8f, 401.41f)
            reflectiveCurveToRelative(213.07f, 143.91f, 323.16f, 75.52f)
            reflectiveCurveToRelative(143.91f, -213.07f, 75.52f, -323.16f)
            curveToRelative(-19.03f, -30.65f, -44.88f, -56.49f, -75.52f, -75.52f)
            curveToRelative(-15f, -9.46f, -34.82f, -4.97f, -44.28f, 10.02f)
            curveTo(332.45f, 93.4f, 330.73f, 99.33f, 330.73f, 105.39f)
            close()
        }
    }.also { _Power = it }
