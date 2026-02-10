package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HoneyPot: ImageVector? = null

val Icons.Br.HoneyPot: ImageVector
    get() = _HoneyPot ?: UXIcon(name = "HoneyPot") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(1.5f, 0f)
            curveTo(0.67f, 0f, 0f, 0.67f, 0f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.35f)
            curveTo(0.69f, 5.11f, 0f, 7.63f, 0f, 10f)
            curveToRelative(0f, 4.32f, 2.73f, 9.36f, 3.91f, 11.32f)
            curveToRelative(0.99f, 1.65f, 2.8f, 2.68f, 4.73f, 2.68f)
            horizontalLineToRelative(6.73f)
            curveToRelative(1.93f, 0f, 3.74f, -1.03f, 4.73f, -2.68f)
            curveToRelative(1.18f, -1.96f, 3.91f, -7.0f, 3.91f, -11.32f)
            curveToRelative(0f, -2.37f, -0.69f, -4.89f, -1.85f, -7f)
            horizontalLineToRelative(0.35f)
            close()
            moveTo(21f, 10f)
            curveToRelative(0f, 2.44f, -1.33f, 6.19f, -3.48f, 9.78f)
            curveToRelative(-0.45f, 0.75f, -1.27f, 1.22f, -2.15f, 1.22f)
            horizontalLineToRelative(-6.73f)
            curveToRelative(-0.88f, 0f, -1.7f, -0.47f, -2.15f, -1.22f)
            curveToRelative(-2.15f, -3.59f, -3.48f, -7.34f, -3.48f, -9.78f)
            reflectiveCurveToRelative(0.96f, -5.17f, 2.43f, -7f)
            horizontalLineToRelative(0.57f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(2.57f)
            curveToRelative(1.47f, 1.83f, 2.43f, 4.56f, 2.43f, 7f)
            close()
        }
    }.also { _HoneyPot = it }
