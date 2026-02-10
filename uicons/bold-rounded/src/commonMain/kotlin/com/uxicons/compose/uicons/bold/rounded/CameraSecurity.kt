package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CameraSecurity: ImageVector? = null

val Icons.Br.CameraSecurity: ImageVector
    get() = _CameraSecurity ?: UXIcon(name = "CameraSecurity") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(16.5f, 0f)
            lineTo(7.5f, 0f)
            curveTo(4.47f, 0f, 2f, 2.47f, 2f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 2.57f, 1.77f, 4.73f, 4.16f, 5.33f)
            curveToRelative(-0.46f, 0.59f, -0.83f, 1.26f, -1.07f, 1.98f)
            curveToRelative(-0.37f, 1.08f, 0.48f, 2.19f, 1.66f, 2.19f)
            horizontalLineToRelative(10.5f)
            curveToRelative(1.18f, 0f, 2.03f, -1.11f, 1.66f, -2.19f)
            curveToRelative(-0.25f, -0.72f, -0.61f, -1.38f, -1.07f, -1.98f)
            curveToRelative(2.39f, -0.6f, 4.16f, -2.76f, 4.16f, -5.33f)
            lineTo(22f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(19f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(7.5f, 17f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(5f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(12f, 5f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
            reflectiveCurveToRelative(-2.24f, -5f, -5f, -5f)
            close()
            moveTo(12f, 12f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            close()
        }
    }.also { _CameraSecurity = it }
