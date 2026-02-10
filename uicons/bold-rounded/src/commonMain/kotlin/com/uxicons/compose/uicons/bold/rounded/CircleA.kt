package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleA: ImageVector? = null

val Icons.Br.CircleA: ImageVector
    get() = _CircleA ?: UXIcon(name = "CircleA") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.62f, 7.29f)
            curveToRelative(-0.43f, -1.08f, -1.46f, -1.79f, -2.62f, -1.79f)
            reflectiveCurveToRelative(-2.19f, 0.7f, -2.63f, 1.82f)
            lineToRelative(-2.78f, 7.67f)
            curveToRelative(-0.28f, 0.78f, 0.12f, 1.64f, 0.9f, 1.92f)
            curveToRelative(0.78f, 0.28f, 1.64f, -0.12f, 1.92f, -0.9f)
            lineToRelative(0.37f, -1.01f)
            horizontalLineToRelative(4.45f)
            lineToRelative(0.37f, 1.01f)
            curveToRelative(0.22f, 0.61f, 0.8f, 0.99f, 1.41f, 0.99f)
            curveToRelative(0.17f, 0f, 0.34f, -0.03f, 0.51f, -0.09f)
            curveToRelative(0.78f, -0.28f, 1.18f, -1.14f, 0.9f, -1.92f)
            lineToRelative(-2.79f, -7.7f)
            close()
            moveTo(10.86f, 12f)
            lineToRelative(1.14f, -3.14f)
            lineToRelative(1.14f, 3.14f)
            horizontalLineToRelative(-2.27f)
            close()
            moveTo(12f, 0f)
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
        }
    }.also { _CircleA = it }
