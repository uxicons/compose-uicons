package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleM: ImageVector? = null

val Icons.Br.CircleM: ImageVector
    get() = _CircleM ?: UXIcon(name = "CircleM") {
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
            moveTo(18f, 8.65f)
            verticalLineToRelative(7.6f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4.9f)
            lineToRelative(-1.71f, 2.91f)
            curveToRelative(-0.27f, 0.46f, -0.76f, 0.74f, -1.29f, 0.74f)
            horizontalLineToRelative(-0.01f)
            curveToRelative(-0.54f, -0.0f, -1.03f, -0.29f, -1.29f, -0.75f)
            lineToRelative(-1.7f, -2.95f)
            verticalLineToRelative(4.95f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-7.44f)
            curveToRelative(0f, -1.24f, 0.72f, -2.25f, 1.8f, -2.5f)
            curveToRelative(1.01f, -0.24f, 2.03f, 0.29f, 2.54f, 1.31f)
            lineToRelative(1.67f, 2.9f)
            lineToRelative(1.7f, -2.89f)
            curveToRelative(0.5f, -1.0f, 1.57f, -1.56f, 2.6f, -1.32f)
            curveToRelative(1.01f, 0.24f, 1.69f, 1.18f, 1.69f, 2.35f)
            close()
        }
    }.also { _CircleM = it }
