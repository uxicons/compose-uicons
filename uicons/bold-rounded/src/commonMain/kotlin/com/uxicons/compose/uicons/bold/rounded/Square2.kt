package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Square2: ImageVector? = null

val Icons.Br.Square2: ImageVector
    get() = _Square2 ?: UXIcon(name = "Square2") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 24f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            close()
            moveTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 3f)
            close()
            moveTo(17f, 17.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4.55f)
            curveToRelative(0.42f, -0.26f, 0.9f, -0.52f, 1.38f, -0.78f)
            curveToRelative(2.08f, -1.12f, 4.67f, -2.52f, 4.67f, -5.43f)
            curveToRelative(0f, -2.65f, -2.24f, -4.8f, -5.0f, -4.8f)
            reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            curveToRelative(1.08f, 0f, 2.0f, 0.82f, 2.0f, 1.8f)
            curveToRelative(0f, 1.04f, -1.22f, 1.78f, -3.09f, 2.79f)
            curveToRelative(-1.22f, 0.66f, -2.47f, 1.33f, -3.31f, 2.32f)
            curveToRelative(-0.64f, 0.75f, -0.78f, 1.78f, -0.36f, 2.67f)
            curveToRelative(0.41f, 0.88f, 1.27f, 1.43f, 2.25f, 1.43f)
            horizontalLineToRelative(6.02f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _Square2 = it }
