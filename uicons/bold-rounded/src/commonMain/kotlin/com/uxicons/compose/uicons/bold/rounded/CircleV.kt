package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleV: ImageVector? = null

val Icons.Br.CircleV: ImageVector
    get() = _CircleV ?: UXIcon(name = "CircleV") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.41f, 8.51f)
            lineToRelative(-2.78f, 7.67f)
            curveToRelative(-0.44f, 1.12f, -1.47f, 1.82f, -2.63f, 1.82f)
            reflectiveCurveToRelative(-2.19f, -0.7f, -2.62f, -1.78f)
            lineToRelative(-2.79f, -7.7f)
            curveToRelative(-0.28f, -0.78f, 0.12f, -1.64f, 0.9f, -1.92f)
            curveToRelative(0.78f, -0.28f, 1.64f, 0.12f, 1.92f, 0.9f)
            lineToRelative(2.59f, 7.15f)
            lineToRelative(2.59f, -7.15f)
            curveToRelative(0.28f, -0.78f, 1.14f, -1.18f, 1.92f, -0.9f)
            curveToRelative(0.78f, 0.28f, 1.18f, 1.14f, 0.9f, 1.92f)
            close()
            moveTo(24f, 11.5f)
            curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
            reflectiveCurveTo(0f, 18.12f, 0f, 11.5f)
            reflectiveCurveTo(5.38f, -0.5f, 12f, -0.5f)
            reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
            close()
            moveTo(21f, 11.5f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            reflectiveCurveTo(3f, 6.54f, 3f, 11.5f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
            close()
        }
    }.also { _CircleV = it }
