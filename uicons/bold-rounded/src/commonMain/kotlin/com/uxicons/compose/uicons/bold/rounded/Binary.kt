package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Binary: ImageVector? = null

val Icons.Br.Binary: ImageVector
    get() = _Binary ?: UXIcon(name = "Binary") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 4.5f)
            curveTo(12f, 2.02f, 9.98f, 0f, 7.5f, 0f)
            reflectiveCurveTo(3f, 2.02f, 3f, 4.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-2f)
            close()
            moveTo(9f, 6.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            close()
            moveTo(15.5f, 13f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(17f, 19.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2f)
            close()
            moveTo(14.44f, 4.56f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
            lineTo(16.44f, 0.44f)
            curveToRelative(0.43f, -0.43f, 1.08f, -0.56f, 1.63f, -0.33f)
            curveToRelative(0.56f, 0.23f, 0.93f, 0.78f, 0.93f, 1.39f)
            lineTo(19f, 9.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(16f, 4.91f)
            curveToRelative(-0.53f, 0.19f, -1.14f, 0.07f, -1.56f, -0.35f)
            close()
            moveTo(9f, 14.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-4.59f)
            curveToRelative(-0.53f, 0.19f, -1.14f, 0.07f, -1.56f, -0.35f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.54f, 0f, -2.12f)
            lineToRelative(2f, -2f)
            curveToRelative(0.43f, -0.43f, 1.08f, -0.56f, 1.63f, -0.33f)
            curveToRelative(0.56f, 0.23f, 0.93f, 0.78f, 0.93f, 1.39f)
            close()
        }
    }.also { _Binary = it }
