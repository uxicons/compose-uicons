package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle5: ImageVector? = null

val Icons.Br.Circle5: ImageVector
    get() = _Circle5 ?: UXIcon(name = "Circle5") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 24f)
            curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
            close()
            moveTo(12f, 3f)
            curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            reflectiveCurveTo(16.96f, 3f, 12f, 3f)
            close()
            moveTo(15.9f, 16.75f)
            curveToRelative(0.76f, -0.81f, 1.15f, -1.86f, 1.09f, -2.97f)
            curveToRelative(-0.11f, -2.12f, -1.93f, -3.79f, -4.14f, -3.79f)
            horizontalLineToRelative(-1.86f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3.36f)
            curveToRelative(0.59f, 0f, 1.11f, 0.43f, 1.14f, 0.94f)
            curveToRelative(0.01f, 0.28f, -0.08f, 0.54f, -0.27f, 0.74f)
            curveToRelative(-0.19f, 0.2f, -0.45f, 0.31f, -0.73f, 0.31f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(1.09f, 0f, 2.15f, -0.46f, 2.9f, -1.25f)
            close()
        }
    }.also { _Circle5 = it }
