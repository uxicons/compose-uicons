package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LunchBox: ImageVector? = null

val Icons.Br.LunchBox: ImageVector
    get() = _LunchBox ?: UXIcon(name = "LunchBox") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 16.5f)
            curveToRelative(0f, -0.61f, -0.36f, -1.13f, -0.89f, -1.37f)
            lineToRelative(-0.15f, -1.28f)
            curveToRelative(-0.33f, -2.77f, -2.67f, -4.86f, -5.46f, -4.86f)
            horizontalLineToRelative(-11.0f)
            curveToRelative(-2.79f, 0f, -5.14f, 2.09f, -5.46f, 4.86f)
            lineToRelative(-0.15f, 1.28f)
            curveToRelative(-0.52f, 0.23f, -0.89f, 0.76f, -0.89f, 1.37f)
            reflectiveCurveToRelative(0.36f, 1.13f, 0.89f, 1.37f)
            lineToRelative(0.15f, 1.28f)
            curveToRelative(0.33f, 2.77f, 2.67f, 4.86f, 5.46f, 4.86f)
            horizontalLineToRelative(11.0f)
            curveToRelative(2.79f, 0f, 5.14f, -2.09f, 5.46f, -4.86f)
            lineToRelative(0.15f, -1.28f)
            curveToRelative(0.52f, -0.23f, 0.89f, -0.76f, 0.89f, -1.37f)
            close()
            moveTo(6.5f, 12f)
            horizontalLineToRelative(11.0f)
            curveToRelative(1.27f, 0f, 2.33f, 0.95f, 2.48f, 2.21f)
            lineToRelative(0.09f, 0.79f)
            horizontalLineToRelative(-16.16f)
            lineToRelative(0.09f, -0.79f)
            curveToRelative(0.15f, -1.26f, 1.22f, -2.21f, 2.48f, -2.21f)
            close()
            moveTo(17.5f, 21f)
            horizontalLineToRelative(-11.0f)
            curveToRelative(-1.27f, 0f, -2.33f, -0.95f, -2.48f, -2.21f)
            lineToRelative(-0.09f, -0.79f)
            horizontalLineToRelative(5.37f)
            curveToRelative(0.46f, 0.61f, 1.19f, 1f, 1.99f, 1f)
            horizontalLineToRelative(1.44f)
            curveToRelative(0.81f, 0f, 1.53f, -0.39f, 1.99f, -1f)
            horizontalLineToRelative(5.37f)
            lineToRelative(-0.09f, 0.79f)
            curveToRelative(-0.15f, 1.26f, -1.22f, 2.21f, -2.48f, 2.21f)
            close()
            moveTo(2f, 4f)
            curveToRelative(0f, -2.21f, 3.79f, -4f, 6f, -4f)
            curveToRelative(1.68f, 0f, 3.11f, 1.03f, 3.7f, 2.5f)
            horizontalLineToRelative(8.8f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-8.8f)
            curveToRelative(-0.59f, 1.47f, -2.03f, 2.5f, -3.7f, 2.5f)
            curveToRelative(-2.21f, 0f, -6f, -1.79f, -6f, -4f)
            close()
        }
    }.also { _LunchBox = it }
