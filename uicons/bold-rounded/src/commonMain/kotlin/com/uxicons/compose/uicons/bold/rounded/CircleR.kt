package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleR: ImageVector? = null

val Icons.Br.CircleR: ImageVector
    get() = _CircleR ?: UXIcon(name = "CircleR") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.25f, 10.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            horizontalLineToRelative(2.32f)
            lineToRelative(1.08f, 2.17f)
            curveToRelative(0.26f, 0.53f, 0.79f, 0.83f, 1.34f, 0.83f)
            curveToRelative(0.23f, 0f, 0.45f, -0.05f, 0.67f, -0.16f)
            curveToRelative(0.74f, -0.37f, 1.04f, -1.27f, 0.67f, -2.01f)
            lineToRelative(-0.88f, -1.76f)
            curveToRelative(1.08f, -0.82f, 1.79f, -2.11f, 1.79f, -3.57f)
            close()
            moveTo(10.25f, 9.5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(2f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-2.5f)
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
    }.also { _CircleR = it }
