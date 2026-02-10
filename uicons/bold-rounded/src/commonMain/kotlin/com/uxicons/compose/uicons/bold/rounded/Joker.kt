package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joker: ImageVector? = null

val Icons.Br.Joker: ImageVector
    get() = _Joker ?: UXIcon(name = "Joker") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15.5f, 0f)
            horizontalLineToRelative(-7f)
            curveTo(5.47f, 0f, 3f, 2.47f, 3f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(21f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(18f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(6f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(7f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(18f, 10.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            curveToRelative(-0.33f, 0f, -0.64f, -0.11f, -0.89f, -0.3f)
            curveToRelative(-0.28f, 0.58f, -0.61f, 1.43f, -0.61f, 2.3f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.86f, -0.33f, -1.72f, -0.61f, -2.3f)
            curveToRelative(-0.25f, 0.18f, -0.55f, 0.3f, -0.89f, 0.3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            curveToRelative(0f, 0.3f, -0.09f, 0.58f, -0.24f, 0.81f)
            curveToRelative(0.63f, 0.31f, 1.48f, 0.84f, 1.89f, 1.67f)
            curveToRelative(0.27f, -1.08f, 0.81f, -2.34f, 1.12f, -3.01f)
            curveToRelative(-0.72f, -0.11f, -1.27f, -0.73f, -1.27f, -1.48f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            curveToRelative(0f, 0.75f, -0.55f, 1.37f, -1.27f, 1.48f)
            curveToRelative(0.31f, 0.67f, 0.86f, 1.93f, 1.12f, 3.01f)
            curveToRelative(0.41f, -0.83f, 1.26f, -1.37f, 1.89f, -1.67f)
            curveToRelative(-0.15f, -0.23f, -0.24f, -0.51f, -0.24f, -0.81f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _Joker = it }
