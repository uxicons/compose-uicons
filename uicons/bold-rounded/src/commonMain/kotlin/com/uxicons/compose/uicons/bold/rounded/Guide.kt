package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Guide: ImageVector? = null

val Icons.Br.Guide: ImageVector
    get() = _Guide ?: UXIcon(name = "Guide") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(7f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.31f)
            curveToRelative(-1.04f, -1.79f, -2.97f, -3f, -5.19f, -3f)
            curveTo(3.69f, 0f, 1f, 2.69f, 1f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(7f, 9f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            horizontalLineToRelative(6f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            close()
            moveTo(14.9f, 20.25f)
            curveToRelative(0.07f, 0.41f, 0.1f, 0.83f, 0.1f, 1.25f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.25f, -0.02f, -0.51f, -0.06f, -0.75f)
            curveToRelative(-0.14f, -0.82f, 0.41f, -1.59f, 1.23f, -1.73f)
            curveToRelative(0.81f, -0.13f, 1.59f, 0.41f, 1.73f, 1.23f)
            close()
            moveTo(23.52f, 3.36f)
            lineToRelative(-3.52f, 1.64f)
            verticalLineToRelative(4.35f)
            curveToRelative(0f, 1.11f, -0.41f, 2.18f, -1.16f, 3.01f)
            lineToRelative(-2.83f, 3.15f)
            curveToRelative(-0.85f, 0.95f, -2.07f, 1.49f, -3.35f, 1.49f)
            horizontalLineToRelative(-5.16f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
            horizontalLineToRelative(5.16f)
            curveToRelative(0.42f, 0f, 0.83f, -0.18f, 1.11f, -0.5f)
            lineToRelative(2.84f, -3.15f)
            curveToRelative(0.25f, -0.28f, 0.39f, -0.63f, 0.39f, -1.0f)
            lineTo(17f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            curveToRelative(0.66f, 0f, 1.31f, 0.13f, 1.93f, 0.38f)
            lineToRelative(3.1f, 1.26f)
            curveToRelative(0.64f, 0.4f, 0.64f, 1.33f, 0f, 1.73f)
            close()
        }
    }.also { _Guide = it }
