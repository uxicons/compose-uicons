package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleS: ImageVector? = null

val Icons.Br.CircleS: ImageVector
    get() = _CircleS ?: UXIcon(name = "CircleS") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveTo(18.62f, 0f, 12f, 0f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            reflectiveCurveTo(7.04f, 3f, 12f, 3f)
            reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
            reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
            close()
            moveTo(17f, 14.53f)
            curveToRelative(0f, 1.91f, -1.56f, 3.47f, -3.47f, 3.47f)
            horizontalLineToRelative(-2.53f)
            curveToRelative(-0.95f, 0f, -2.93f, 0f, -3.84f, -1.83f)
            curveToRelative(-0.37f, -0.74f, -0.07f, -1.64f, 0.67f, -2.01f)
            curveToRelative(0.74f, -0.37f, 1.64f, -0.07f, 2.01f, 0.67f)
            curveToRelative(0.09f, 0.17f, 0.84f, 0.17f, 1.16f, 0.17f)
            horizontalLineToRelative(2.53f)
            curveToRelative(0.26f, 0f, 0.47f, -0.21f, 0.47f, -0.47f)
            curveToRelative(0f, -0.21f, -0.14f, -0.39f, -0.34f, -0.45f)
            lineToRelative(-4.17f, -1.29f)
            curveToRelative(-1.45f, -0.41f, -2.49f, -1.78f, -2.49f, -3.33f)
            curveToRelative(0f, -1.91f, 1.56f, -3.47f, 3.47f, -3.47f)
            horizontalLineToRelative(2.53f)
            curveToRelative(0.95f, 0f, 2.93f, 0f, 3.84f, 1.83f)
            curveToRelative(0.37f, 0.74f, 0.07f, 1.64f, -0.67f, 2.01f)
            curveToRelative(-0.74f, 0.37f, -1.64f, 0.07f, -2.01f, -0.67f)
            curveToRelative(-0.09f, -0.17f, -0.84f, -0.17f, -1.16f, -0.17f)
            horizontalLineToRelative(-2.53f)
            curveToRelative(-0.26f, 0f, -0.47f, 0.21f, -0.47f, 0.47f)
            curveToRelative(0f, 0.21f, 0.14f, 0.39f, 0.34f, 0.45f)
            lineToRelative(4.18f, 1.29f)
            curveToRelative(1.45f, 0.42f, 2.48f, 1.79f, 2.48f, 3.33f)
            close()
        }
    }.also { _CircleS = it }
