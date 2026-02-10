package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMoon: ImageVector? = null

val Icons.Br.YogaMoon: ImageVector
    get() = _YogaMoon ?: UXIcon(name = "YogaMoon") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 11.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(16.5f, 2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(-6.03f)
            curveToRelative(-2.1f, 0f, -3.98f, 1.17f, -4.92f, 3.04f)
            lineTo(0.16f, 19.83f)
            curveToRelative(-0.37f, 0.74f, -0.07f, 1.64f, 0.67f, 2.01f)
            curveToRelative(0.72f, 0.37f, 1.64f, 0.08f, 2.01f, -0.67f)
            lineToRelative(3.58f, -7.17f)
            horizontalLineToRelative(0.7f)
            lineToRelative(4.07f, 7.24f)
            curveToRelative(0.41f, 0.73f, 1.33f, 0.97f, 2.04f, 0.57f)
            curveToRelative(0.72f, -0.41f, 0.98f, -1.32f, 0.57f, -2.04f)
            lineToRelative(-3.24f, -5.76f)
            horizontalLineToRelative(4.43f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineTo(3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _YogaMoon = it }
