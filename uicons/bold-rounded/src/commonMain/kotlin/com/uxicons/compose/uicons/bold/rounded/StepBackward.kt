package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StepBackward: ImageVector? = null

val Icons.Br.StepBackward: ImageVector
    get() = _StepBackward ?: UXIcon(name = "StepBackward") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.89f, 0.42f)
            curveToRelative(-1.3f, -0.66f, -2.85f, -0.53f, -4.03f, 0.33f)
            lineToRelative(-8.86f, 7.76f)
            lineTo(6.0f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-7.01f)
            lineToRelative(8.86f, 7.76f)
            curveToRelative(0.67f, 0.49f, 1.46f, 0.75f, 2.27f, 0.75f)
            curveToRelative(0.61f, 0f, 1.2f, -0.14f, 1.75f, -0.42f)
            curveToRelative(1.31f, -0.66f, 2.12f, -1.98f, 2.12f, -3.44f)
            lineTo(21f, 3.87f)
            curveToRelative(0f, -1.46f, -0.81f, -2.78f, -2.12f, -3.44f)
            close()
            moveTo(18f, 20.13f)
            curveToRelative(0f, 0.34f, -0.17f, 0.61f, -0.47f, 0.77f)
            curveToRelative(-0.29f, 0.15f, -0.59f, 0.13f, -0.86f, -0.04f)
            lineTo(7.35f, 12.7f)
            curveToRelative(-0.23f, -0.17f, -0.35f, -0.41f, -0.35f, -0.69f)
            reflectiveCurveToRelative(0.12f, -0.53f, 0.35f, -0.69f)
            lineTo(16.67f, 3.15f)
            curveToRelative(0.27f, -0.17f, 0.57f, -0.19f, 0.86f, -0.04f)
            curveToRelative(0.3f, 0.15f, 0.47f, 0.43f, 0.47f, 0.77f)
            verticalLineToRelative(16.27f)
            close()
        }
    }.also { _StepBackward = it }
