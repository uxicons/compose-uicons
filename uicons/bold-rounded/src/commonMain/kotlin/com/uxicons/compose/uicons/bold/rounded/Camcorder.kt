package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Camcorder: ImageVector? = null

val Icons.Br.Camcorder: ImageVector
    get() = _Camcorder ?: UXIcon(name = "Camcorder") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 11f)
            lineTo(6.5f, 11f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(11f, 16f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2f)
            close()
            moveTo(22.6f, 8.77f)
            curveToRelative(-0.86f, -0.43f, -1.88f, -0.34f, -2.65f, 0.24f)
            lineToRelative(-1.19f, 0.89f)
            curveToRelative(-0.67f, -2.19f, -2.68f, -3.81f, -5.07f, -3.89f)
            lineToRelative(-3.54f, -3.98f)
            curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.48f, -1.02f)
            lineTo(1.5f, 1f)
            curveTo(0.67f, 1f, 0f, 1.67f, 0f, 2.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(7.68f, 4f)
            curveToRelative(0.13f, 0f, 0.26f, 0.05f, 0.29f, 0.08f)
            lineToRelative(1.7f, 1.92f)
            lineTo(5.5f, 6f)
            curveTo(2.47f, 6f, 0f, 8.47f, 0f, 11.5f)
            verticalLineToRelative(7f)
            curveTo(0f, 21.53f, 2.47f, 24f, 5.5f, 24f)
            lineTo(13.5f, 24f)
            curveToRelative(2.48f, 0f, 4.58f, -1.65f, 5.26f, -3.9f)
            lineToRelative(1.19f, 0.9f)
            curveToRelative(0.45f, 0.34f, 0.98f, 0.51f, 1.51f, 0.51f)
            curveToRelative(0.39f, 0f, 0.77f, -0.09f, 1.13f, -0.27f)
            curveToRelative(0.86f, -0.43f, 1.4f, -1.3f, 1.4f, -2.26f)
            verticalLineToRelative(-7.94f)
            curveToRelative(0f, -0.96f, -0.54f, -1.83f, -1.4f, -2.26f)
            close()
            moveTo(16f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            lineTo(13.5f, 9f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(7f)
            close()
        }
    }.also { _Camcorder = it }
