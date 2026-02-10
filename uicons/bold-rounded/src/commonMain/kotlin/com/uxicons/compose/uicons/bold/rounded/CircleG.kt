package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleG: ImageVector? = null

val Icons.Br.CircleG: ImageVector
    get() = _CircleG ?: UXIcon(name = "CircleG") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(16.4f, 11.57f)
            curveToRelative(0.56f, 0.56f, 0.59f, 1.27f, 0.59f, 1.47f)
            curveToRelative(0f, 2.89f, -2.13f, 5.14f, -4.95f, 5.23f)
            curveToRelative(-0.05f, 0.0f, -0.1f, 0.0f, -0.15f, 0.0f)
            curveToRelative(-0.45f, 0f, -0.9f, -0.07f, -1.34f, -0.19f)
            curveToRelative(-2.09f, -0.61f, -3.55f, -2.6f, -3.55f, -4.83f)
            verticalLineToRelative(-2.4f)
            curveToRelative(0f, -1.38f, 0.57f, -2.72f, 1.57f, -3.69f)
            curveToRelative(0.98f, -0.95f, 2.27f, -1.45f, 3.6f, -1.41f)
            curveToRelative(1.11f, 0.04f, 2.16f, 0.43f, 3.02f, 1.13f)
            curveToRelative(0.64f, 0.52f, 0.74f, 1.47f, 0.22f, 2.11f)
            curveToRelative(-0.52f, 0.64f, -1.47f, 0.74f, -2.11f, 0.22f)
            curveToRelative(-0.35f, -0.28f, -0.77f, -0.44f, -1.23f, -0.46f)
            curveToRelative(-0.53f, -0.02f, -1.03f, 0.18f, -1.42f, 0.56f)
            curveToRelative(-0.42f, 0.4f, -0.66f, 0.96f, -0.66f, 1.53f)
            verticalLineToRelative(2.4f)
            curveToRelative(0f, 0.91f, 0.57f, 1.71f, 1.4f, 1.96f)
            curveToRelative(0.18f, 0.05f, 0.37f, 0.07f, 0.56f, 0.07f)
            curveToRelative(0.77f, -0.02f, 1.54f, -0.43f, 1.88f, -1.28f)
            horizontalLineToRelative(-0.33f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.54f, 0f, 1.04f, 0.2f, 1.4f, 0.57f)
            close()
        }
    }.also { _CircleG = it }
