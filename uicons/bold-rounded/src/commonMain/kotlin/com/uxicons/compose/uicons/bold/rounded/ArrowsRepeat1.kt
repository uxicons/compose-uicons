package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsRepeat1: ImageVector? = null

val Icons.Br.ArrowsRepeat1: ImageVector
    get() = _ArrowsRepeat1 ?: UXIcon(name = "ArrowsRepeat1") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 13f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(10.5f)
            verticalLineToRelative(1.66f)
            curveToRelative(0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
            lineToRelative(3f, -3.16f)
            curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
            lineToRelative(-3f, -3.16f)
            curveToRelative(-0.63f, -0.63f, -1.71f, -0.18f, -1.71f, 0.71f)
            verticalLineToRelative(1.66f)
            lineTo(8.5f, 3f)
            curveTo(3.81f, 3f, 0f, 6.81f, 0f, 11.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(22.5f, 11f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            lineTo(5f, 18f)
            verticalLineToRelative(-1.66f)
            curveToRelative(0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
            lineTo(0.29f, 18.79f)
            curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
            lineToRelative(3f, 3.16f)
            curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f)
            verticalLineToRelative(-1.66f)
            lineTo(15.5f, 21f)
            curveToRelative(4.69f, 0f, 8.5f, -3.81f, 8.5f, -8.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.5f, 8f)
            curveToRelative(-0.34f, 0f, -0.65f, 0.12f, -0.9f, 0.3f)
            horizontalLineToRelative(-0.01f)
            lineToRelative(-2.89f, 2.41f)
            curveToRelative(-0.53f, 0.44f, -0.6f, 1.23f, -0.16f, 1.76f)
            curveToRelative(0.25f, 0.3f, 0.6f, 0.45f, 0.96f, 0.45f)
            curveToRelative(0.28f, 0f, 0.57f, -0.1f, 0.8f, -0.29f)
            lineToRelative(0.7f, -0.58f)
            verticalLineToRelative(2.45f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _ArrowsRepeat1 = it }
