package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleStar: ImageVector? = null

val Icons.Br.CircleStar: ImageVector
    get() = _CircleStar ?: UXIcon(name = "CircleStar") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.44f, 10.6f)
            curveToRelative(0.13f, 0.36f, 0.02f, 0.77f, -0.27f, 1.02f)
            lineToRelative(-2.17f, 1.77f)
            lineToRelative(0.9f, 2.73f)
            curveToRelative(0.12f, 0.37f, 0f, 0.78f, -0.31f, 1.01f)
            curveToRelative(-0.31f, 0.24f, -0.73f, 0.25f, -1.06f, 0.04f)
            lineToRelative(-2.52f, -1.64f)
            lineToRelative(-2.48f, 1.66f)
            curveToRelative(-0.15f, 0.1f, -0.33f, 0.15f, -0.51f, 0.15f)
            curveToRelative(-0.19f, 0f, -0.39f, -0.06f, -0.55f, -0.18f)
            curveToRelative(-0.31f, -0.23f, -0.44f, -0.64f, -0.32f, -1.01f)
            lineToRelative(0.86f, -2.76f)
            lineToRelative(-2.18f, -1.77f)
            curveToRelative(-0.29f, -0.25f, -0.4f, -0.65f, -0.27f, -1.01f)
            curveToRelative(0.13f, -0.36f, 0.48f, -0.6f, 0.86f, -0.6f)
            horizontalLineToRelative(2.75f)
            lineToRelative(0.97f, -2.61f)
            curveToRelative(0.13f, -0.36f, 0.48f, -0.6f, 0.86f, -0.6f)
            reflectiveCurveToRelative(0.73f, 0.24f, 0.86f, 0.6f)
            lineToRelative(0.97f, 2.61f)
            horizontalLineToRelative(2.75f)
            curveToRelative(0.38f, 0f, 0.73f, 0.24f, 0.86f, 0.6f)
            close()
            moveTo(24f, 12f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.62f, 0f, 12f)
            reflectiveCurveTo(5.38f, 0f, 12f, 0f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            reflectiveCurveTo(3f, 7.04f, 3f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            close()
        }
    }.also { _CircleStar = it }
