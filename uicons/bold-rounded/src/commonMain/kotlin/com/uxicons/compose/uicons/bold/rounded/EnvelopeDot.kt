package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EnvelopeDot: ImageVector? = null

val Icons.Br.EnvelopeDot: ImageVector
    get() = _EnvelopeDot ?: UXIcon(name = "EnvelopeDot") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 10.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5.5f, 24f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 8.5f)
            curveTo(0f, 5.47f, 2.47f, 3f, 5.5f, 3f)
            lineTo(13.5f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(5.5f, 6f)
            curveToRelative(-0.96f, 0f, -1.79f, 0.54f, -2.21f, 1.33f)
            lineToRelative(6.94f, 6.94f)
            curveToRelative(0.95f, 0.95f, 2.59f, 0.95f, 3.54f, 0f)
            curveToRelative(0.02f, -0.02f, 2.75f, -2.4f, 2.75f, -2.4f)
            curveToRelative(0.62f, -0.54f, 1.57f, -0.48f, 2.12f, 0.15f)
            curveToRelative(0.54f, 0.62f, 0.48f, 1.57f, -0.15f, 2.12f)
            lineToRelative(-2.64f, 2.3f)
            curveToRelative(-1.03f, 1.01f, -2.4f, 1.57f, -3.85f, 1.57f)
            reflectiveCurveToRelative(-2.85f, -0.57f, -3.89f, -1.61f)
            lineTo(3f, 11.28f)
            verticalLineToRelative(7.22f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            lineTo(21f, 10.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(20.5f, 7f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
            reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
            reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
            close()
        }
    }.also { _EnvelopeDot = it }
