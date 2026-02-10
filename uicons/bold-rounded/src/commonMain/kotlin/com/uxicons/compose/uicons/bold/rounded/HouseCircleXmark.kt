package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleXmark: ImageVector? = null

val Icons.Br.HouseCircleXmark: ImageVector
    get() = _HouseCircleXmark ?: UXIcon(name = "HouseCircleXmark") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 12f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            close()
            moveTo(20.71f, 19.29f)
            curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
            curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
            reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
            lineToRelative(-1.29f, -1.29f)
            lineToRelative(-1.29f, 1.29f)
            curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
            reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
            lineToRelative(1.29f, -1.29f)
            lineToRelative(-1.29f, -1.29f)
            curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
            reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
            lineToRelative(1.29f, 1.29f)
            lineToRelative(1.29f, -1.29f)
            curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
            reflectiveCurveToRelative(0.39f, 1.02f, 0f, 1.41f)
            lineToRelative(-1.29f, 1.29f)
            lineToRelative(1.29f, 1.29f)
            close()
            moveTo(3f, 9.89f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-8.61f)
            curveToRelative(0f, -1.83f, 0.91f, -3.53f, 2.42f, -4.56f)
            lineTo(8.92f, 0.94f)
            curveToRelative(1.87f, -1.26f, 4.28f, -1.26f, 6.15f, 0f)
            lineToRelative(6.92f, 4.71f)
            curveToRelative(1.12f, 0.92f, 1.83f, 2.25f, 1.98f, 3.71f)
            curveToRelative(0.08f, 0.82f, -0.52f, 1.56f, -1.35f, 1.64f)
            curveToRelative(-0.81f, 0.08f, -1.56f, -0.52f, -1.64f, -1.35f)
            curveToRelative(-0.07f, -0.74f, -0.47f, -1.41f, -1.09f, -1.83f)
            lineToRelative(-6.5f, -4.39f)
            curveToRelative(-0.85f, -0.57f, -1.95f, -0.57f, -2.8f, 0f)
            lineToRelative(-6.5f, 4.39f)
            curveToRelative(-0.69f, 0.47f, -1.1f, 1.24f, -1.1f, 2.07f)
            close()
        }
    }.also { _HouseCircleXmark = it }
