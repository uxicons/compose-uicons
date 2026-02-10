package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DocumentCircleArrowUp: ImageVector? = null

val Icons.Br.DocumentCircleArrowUp: ImageVector
    get() = _DocumentCircleArrowUp ?: UXIcon(name = "DocumentCircleArrowUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(6.34f)
            curveToRelative(1.47f, 0f, 2.85f, 0.57f, 3.89f, 1.61f)
            lineToRelative(2.66f, 2.66f)
            curveToRelative(0.81f, 0.81f, 1.35f, 1.85f, 1.54f, 2.98f)
            curveToRelative(0.14f, 0.82f, -0.42f, 1.74f, -1.43f, 1.74f)
            reflectiveCurveToRelative(-5.5f, 0.01f, -5.5f, 0.01f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(11f, 3f)
            lineTo(5.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 17.5f)
            curveToRelative(0f, 3.59f, -2.91f, 6.5f, -6.5f, 6.5f)
            reflectiveCurveToRelative(-6.5f, -2.91f, -6.5f, -6.5f)
            reflectiveCurveToRelative(2.91f, -6.5f, 6.5f, -6.5f)
            reflectiveCurveToRelative(6.5f, 2.91f, 6.5f, 6.5f)
            close()
            moveTo(21.25f, 16.35f)
            lineToRelative(-3.06f, -3.06f)
            curveToRelative(-0.38f, -0.38f, -0.99f, -0.38f, -1.37f, 0f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.61f, 0.61f, -0.18f, 1.65f, 0.69f, 1.65f)
            horizontalLineToRelative(1.56f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            horizontalLineToRelative(1.56f)
            curveToRelative(0.86f, 0f, 1.29f, -1.04f, 0.69f, -1.65f)
            close()
        }
    }.also { _DocumentCircleArrowUp = it }
