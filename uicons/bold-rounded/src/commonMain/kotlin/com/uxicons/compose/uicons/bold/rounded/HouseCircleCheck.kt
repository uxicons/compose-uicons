package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleCheck: ImageVector? = null

val Icons.Br.HouseCircleCheck: ImageVector
    get() = _HouseCircleCheck ?: UXIcon(name = "HouseCircleCheck") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 12f)
            curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
            reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
            close()
            moveTo(21.68f, 17.71f)
            lineToRelative(-2.7f, 2.61f)
            curveToRelative(-0.45f, 0.45f, -1.05f, 0.67f, -1.65f, 0.67f)
            reflectiveCurveToRelative(-1.2f, -0.23f, -1.66f, -0.67f)
            lineToRelative(-1.35f, -1.33f)
            curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
            curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
            lineToRelative(1.35f, 1.33f)
            curveToRelative(0.14f, 0.14f, 0.38f, 0.14f, 0.52f, -0.0f)
            lineToRelative(2.71f, -2.62f)
            curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
            curveToRelative(0.38f, 0.4f, 0.37f, 1.03f, -0.03f, 1.41f)
            close()
            moveTo(11f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-8.61f)
            curveToRelative(0f, -1.83f, 0.91f, -3.53f, 2.42f, -4.56f)
            lineTo(8.92f, 0.94f)
            curveToRelative(1.87f, -1.26f, 4.28f, -1.26f, 6.15f, 0f)
            lineToRelative(6.92f, 4.71f)
            curveToRelative(1.12f, 0.92f, 1.83f, 2.25f, 1.98f, 3.71f)
            curveToRelative(0.08f, 0.82f, -0.52f, 1.56f, -1.35f, 1.64f)
            curveToRelative(-0.82f, 0.08f, -1.56f, -0.52f, -1.64f, -1.35f)
            curveToRelative(-0.07f, -0.74f, -0.47f, -1.41f, -1.09f, -1.83f)
            lineToRelative(-6.5f, -4.39f)
            curveToRelative(-0.85f, -0.57f, -1.95f, -0.57f, -2.8f, 0f)
            lineToRelative(-6.5f, 4.39f)
            curveToRelative(-0.69f, 0.47f, -1.1f, 1.24f, -1.1f, 2.07f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _HouseCircleCheck = it }
