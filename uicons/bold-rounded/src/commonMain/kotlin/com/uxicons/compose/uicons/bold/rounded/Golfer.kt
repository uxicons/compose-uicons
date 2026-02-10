package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Golfer: ImageVector? = null

val Icons.Br.Golfer: ImageVector
    get() = _Golfer ?: UXIcon(name = "Golfer") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(5.91f, 3.47f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(20.9f, 9.96f)
            lineTo(17.51f, 1.15f)
            curveToRelative(-0.43f, -0.96f, -1.57f, -1.41f, -2.54f, -1.0f)
            lineToRelative(-1.55f, 0.66f)
            curveToRelative(-0.76f, 0.32f, -1.12f, 1.2f, -0.79f, 1.97f)
            reflectiveCurveToRelative(1.21f, 1.12f, 1.97f, 0.8f)
            lineToRelative(0.55f, -0.23f)
            lineToRelative(2.18f, 5.66f)
            horizontalLineToRelative(-0.95f)
            curveToRelative(-0.43f, 0f, -0.86f, -0.06f, -1.28f, -0.18f)
            lineToRelative(-5.65f, -1.67f)
            curveToRelative(-0.91f, -0.32f, -1.91f, -0.1f, -2.62f, 0.55f)
            curveToRelative(-0.7f, 0.66f, -0.99f, 1.64f, -0.71f, 2.65f)
            curveToRelative(0f, 0f, 1.73f, 5.24f, 1.74f, 5.28f)
            lineToRelative(-3.19f, 6.19f)
            curveToRelative(-0.38f, 0.74f, -0.09f, 1.64f, 0.65f, 2.02f)
            curveToRelative(0.72f, 0.38f, 1.64f, 0.1f, 2.02f, -0.65f)
            curveToRelative(0f, 0f, 3.55f, -6.92f, 3.58f, -7.0f)
            curveToRelative(0.06f, 0.31f, 0.09f, 0.63f, 0.09f, 0.95f)
            verticalLineToRelative(5.36f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5.36f)
            curveToRelative(0f, -0.92f, -0.15f, -1.82f, -0.44f, -2.69f)
            lineToRelative(-1.09f, -3.28f)
            lineToRelative(1.77f, 0.52f)
            curveToRelative(0.69f, 0.2f, 1.41f, 0.31f, 2.13f, 0.31f)
            horizontalLineToRelative(3.13f)
            curveToRelative(0.49f, 0f, 0.96f, -0.24f, 1.24f, -0.65f)
            curveToRelative(0.28f, -0.41f, 0.34f, -0.93f, 0.16f, -1.39f)
            close()
        }
    }.also { _Golfer = it }
