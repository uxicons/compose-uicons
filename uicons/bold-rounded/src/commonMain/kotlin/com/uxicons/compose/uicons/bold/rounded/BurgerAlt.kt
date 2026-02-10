package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BurgerAlt: ImageVector? = null

val Icons.Br.BurgerAlt: ImageVector
    get() = _BurgerAlt ?: UXIcon(name = "BurgerAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.5f, 17f)
            lineTo(2.5f, 17f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            lineTo(21.5f, 14f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            close()
            moveTo(23f, 21f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(2.5f, 19f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            lineTo(20f, 24f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            close()
            moveTo(22.42f, 11.1f)
            curveToRelative(0.48f, -0.57f, 0.67f, -1.31f, 0.54f, -2.04f)
            curveTo(22.03f, 3.81f, 17.42f, 0f, 12f, 0f)
            reflectiveCurveTo(1.99f, 3.81f, 1.03f, 9.06f)
            curveToRelative(-0.13f, 0.73f, 0.06f, 1.47f, 0.54f, 2.04f)
            curveToRelative(0.48f, 0.57f, 1.18f, 0.9f, 1.93f, 0.9f)
            lineTo(20.5f, 12f)
            curveToRelative(0.74f, 0f, 1.44f, -0.33f, 1.92f, -0.9f)
            close()
            moveTo(12f, 3f)
            curveToRelative(3.76f, 0f, 6.98f, 2.49f, 7.89f, 6f)
            lineTo(4.12f, 9f)
            curveToRelative(0.92f, -3.46f, 4.21f, -6f, 7.88f, -6f)
            close()
        }
    }.also { _BurgerAlt = it }
