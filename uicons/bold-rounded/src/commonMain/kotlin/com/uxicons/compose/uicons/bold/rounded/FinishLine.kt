package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FinishLine: ImageVector? = null

val Icons.Br.FinishLine: ImageVector
    get() = _FinishLine ?: UXIcon(name = "FinishLine") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(11f, 2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(7.39f, 17.03f)
            reflectiveCurveToRelative(-0.35f, 0.97f, -1.08f, 0.97f)
            horizontalLineToRelative(-1.81f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2.49f)
            curveToRelative(1.22f, 0f, 2.31f, -0.73f, 2.77f, -1.86f)
            lineToRelative(0.13f, -0.31f)
            lineToRelative(-1.22f, -0.69f)
            curveToRelative(-0.5f, -0.31f, -0.92f, -0.7f, -1.28f, -1.12f)
            close()
            moveTo(15.48f, 16.27f)
            lineTo(14.86f, 15.91f)
            curveToRelative(-0.92f, 0.06f, -1.88f, 0.09f, -2.86f, 0.09f)
            curveToRelative(-1.0f, 0f, -1.99f, -0.04f, -2.95f, -0.09f)
            curveToRelative(0.19f, 0.18f, 0.39f, 0.35f, 0.62f, 0.5f)
            lineToRelative(3.83f, 2.18f)
            curveToRelative(0.31f, 0.18f, 0.51f, 0.51f, 0.51f, 0.87f)
            verticalLineToRelative(3.05f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3.63f)
            curveToRelative(0f, -1.08f, -0.58f, -2.07f, -1.52f, -2.61f)
            close()
            moveTo(24.06f, 11.02f)
            curveToRelative(-0.17f, -0.81f, -0.98f, -1.32f, -1.78f, -1.15f)
            curveToRelative(-1.98f, 0.43f, -4.88f, 0.92f, -8.19f, 1.07f)
            lineToRelative(0.81f, -1.94f)
            horizontalLineToRelative(3.85f)
            curveToRelative(1.11f, 0f, 2.08f, -0.72f, 2.4f, -1.78f)
            lineToRelative(1.29f, -4.29f)
            curveToRelative(0.24f, -0.79f, -0.21f, -1.63f, -1.01f, -1.87f)
            curveToRelative(-0.79f, -0.24f, -1.63f, 0.21f, -1.87f, 1.0f)
            lineToRelative(-1.18f, 3.93f)
            horizontalLineToRelative(-11.27f)
            lineToRelative(-1.18f, -3.93f)
            curveToRelative(-0.24f, -0.79f, -1.07f, -1.25f, -1.87f, -1.0f)
            curveToRelative(-0.79f, 0.24f, -1.24f, 1.07f, -1.0f, 1.87f)
            lineToRelative(1.29f, 4.29f)
            curveToRelative(0.32f, 1.07f, 1.28f, 1.78f, 2.4f, 1.78f)
            horizontalLineToRelative(2.76f)
            lineToRelative(-0.77f, 1.88f)
            curveToRelative(-2.69f, -0.19f, -5.11f, -0.57f, -6.86f, -0.91f)
            curveToRelative(-0.82f, -0.16f, -1.6f, 0.38f, -1.76f, 1.19f)
            reflectiveCurveToRelative(0.38f, 1.6f, 1.19f, 1.76f)
            curveToRelative(2.57f, 0.49f, 6.5f, 1.08f, 10.7f, 1.08f)
            curveToRelative(4.43f, 0f, 8.38f, -0.65f, 10.91f, -1.2f)
            curveToRelative(0.81f, -0.17f, 1.32f, -0.97f, 1.15f, -1.78f)
            close()
        }
    }.also { _FinishLine = it }
