package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleN: ImageVector? = null

val Icons.Br.CircleN: ImageVector
    get() = _CircleN ?: UXIcon(name = "CircleN") {
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
            moveTo(17f, 7.75f)
            verticalLineToRelative(7.51f)
            curveToRelative(0f, 1.21f, -0.79f, 2.21f, -1.92f, 2.45f)
            curveToRelative(-0.16f, 0.03f, -0.32f, 0.05f, -0.47f, 0.05f)
            curveToRelative(-0.94f, 0f, -1.81f, -0.58f, -2.21f, -1.51f)
            lineToRelative(-2.39f, -4.82f)
            verticalLineToRelative(4.83f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -1.21f, 0.78f, -2.22f, 1.89f, -2.45f)
            curveToRelative(1.09f, -0.23f, 2.17f, 0.38f, 2.64f, 1.47f)
            lineToRelative(2.47f, 4.97f)
            verticalLineToRelative(-4.99f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _CircleN = it }
