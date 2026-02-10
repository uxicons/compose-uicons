package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCrackAlt: ImageVector? = null

val Icons.Br.HouseCrackAlt: ImageVector
    get() = _HouseCrackAlt ?: UXIcon(name = "HouseCrackAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 5.65f)
            lineTo(15.08f, 0.94f)
            curveToRelative(-1.87f, -1.26f, -4.28f, -1.26f, -6.15f, 0f)
            lineTo(2.42f, 5.33f)
            curveToRelative(-1.52f, 1.02f, -2.42f, 2.73f, -2.42f, 4.56f)
            verticalLineToRelative(8.61f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            verticalLineToRelative(-8.61f)
            curveToRelative(0f, -1.65f, -0.74f, -3.19f, -2f, -4.23f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-2.62f)
            lineToRelative(-3.76f, -3.99f)
            lineToRelative(2.09f, -1.95f)
            curveToRelative(0.51f, -0.51f, 0.79f, -1.19f, 0.79f, -1.91f)
            reflectiveCurveToRelative(-0.28f, -1.4f, -0.76f, -1.88f)
            lineToRelative(-2.65f, -2.81f)
            curveToRelative(-0.57f, -0.6f, -1.52f, -0.63f, -2.12f, -0.06f)
            curveToRelative(-0.6f, 0.57f, -0.63f, 1.52f, -0.06f, 2.12f)
            lineToRelative(2.46f, 2.61f)
            lineToRelative(-2.09f, 1.95f)
            curveToRelative(-1.05f, 1.05f, -1.05f, 2.76f, -0.03f, 3.78f)
            lineToRelative(2.0f, 2.12f)
            horizontalLineToRelative(-6.26f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-8.61f)
            curveToRelative(0f, -0.83f, 0.41f, -1.61f, 1.1f, -2.07f)
            lineToRelative(6.5f, -4.39f)
            curveToRelative(0.42f, -0.29f, 0.91f, -0.43f, 1.4f, -0.43f)
            reflectiveCurveToRelative(0.97f, 0.14f, 1.4f, 0.43f)
            lineToRelative(6.5f, 4.39f)
            curveToRelative(0.69f, 0.47f, 1.1f, 1.24f, 1.1f, 2.07f)
            verticalLineToRelative(8.61f)
            close()
        }
    }.also { _HouseCrackAlt = it }
