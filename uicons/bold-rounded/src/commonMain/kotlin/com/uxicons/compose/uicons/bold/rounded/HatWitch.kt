package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HatWitch: ImageVector? = null

val Icons.Br.HatWitch: ImageVector
    get() = _HatWitch ?: UXIcon(name = "HatWitch") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 21f)
            horizontalLineToRelative(-0.26f)
            lineToRelative(-3.86f, -11.23f)
            curveToRelative(-0.69f, -2.0f, -0.3f, -4.22f, 1.0f, -5.87f)
            curveToRelative(0.43f, 0.33f, 0.81f, 0.73f, 1.11f, 1.21f)
            lineToRelative(0.74f, 1.18f)
            curveToRelative(0.44f, 0.7f, 1.36f, 0.92f, 2.07f, 0.48f)
            curveToRelative(0.7f, -0.44f, 0.92f, -1.36f, 0.48f, -2.07f)
            lineToRelative(-0.74f, -1.18f)
            curveToRelative(-1.38f, -2.21f, -3.76f, -3.52f, -6.36f, -3.52f)
            horizontalLineToRelative(-1.66f)
            curveToRelative(-3.64f, 0f, -6.88f, 2.32f, -8.06f, 5.76f)
            lineTo(1.76f, 21f)
            horizontalLineToRelative(-0.26f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(9.8f, 6.73f)
            curveToRelative(0.76f, -2.23f, 2.86f, -3.73f, 5.22f, -3.73f)
            horizontalLineToRelative(1.35f)
            curveToRelative(-1.39f, 2.31f, -1.72f, 5.15f, -0.82f, 7.75f)
            lineToRelative(3.52f, 10.25f)
            horizontalLineToRelative(-4.07f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-4.07f)
            lineToRelative(4.87f, -14.27f)
            close()
        }
    }.also { _HatWitch = it }
