package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepForward: ImageVector? = null

val Icons.Br.StepForward: ImageVector
    get() = _StepForward ?: UXIcon(name = "StepForward") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7.01f)
            lineTo(9.14f, 0.75f)
            curveTo(7.96f, -0.11f, 6.42f, -0.24f, 5.12f, 0.42f)
            curveToRelative(-1.3f, 0.66f, -2.12f, 1.98f, -2.12f, 3.44f)
            verticalLineToRelative(16.27f)
            curveToRelative(0f, 1.46f, 0.81f, 2.78f, 2.12f, 3.44f)
            curveToRelative(0.56f, 0.28f, 1.15f, 0.42f, 1.75f, 0.42f)
            curveToRelative(0.81f, 0f, 1.6f, -0.26f, 2.27f, -0.75f)
            lineToRelative(8.86f, -7.76f)
            verticalLineToRelative(7.01f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(21.0f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(16.65f, 12.7f)
            lineToRelative(-9.32f, 8.16f)
            curveToRelative(-0.27f, 0.17f, -0.57f, 0.19f, -0.86f, 0.04f)
            curveToRelative(-0.3f, -0.15f, -0.47f, -0.43f, -0.47f, -0.77f)
            lineTo(6f, 3.87f)
            curveToRelative(0f, -0.34f, 0.17f, -0.61f, 0.47f, -0.77f)
            curveToRelative(0.13f, -0.07f, 0.26f, -0.1f, 0.4f, -0.1f)
            curveToRelative(0.16f, 0f, 0.32f, 0.05f, 0.46f, 0.14f)
            lineToRelative(9.32f, 8.16f)
            curveToRelative(0.23f, 0.17f, 0.35f, 0.41f, 0.35f, 0.69f)
            reflectiveCurveToRelative(-0.12f, 0.53f, -0.35f, 0.69f)
            close()
        }
    }.also { _StepForward = it }
