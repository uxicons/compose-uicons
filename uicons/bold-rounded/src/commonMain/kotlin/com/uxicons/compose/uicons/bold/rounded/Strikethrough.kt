package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Strikethrough: ImageVector? = null

val Icons.Br.Strikethrough: ImageVector
    get() = _Strikethrough ?: UXIcon(name = "Strikethrough") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 12f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(1.5f, 13.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.49f)
            curveToRelative(-1.18f, -1.13f, -1.89f, -2.71f, -1.89f, -4.4f)
            curveTo(2.1f, 2.73f, 4.83f, 0f, 8.19f, 0f)
            horizontalLineToRelative(7.81f)
            curveToRelative(3.36f, 0f, 6.09f, 2.73f, 6.09f, 6.1f)
            verticalLineToRelative(0.4f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.4f)
            curveToRelative(0f, -1.71f, -1.39f, -3.1f, -3.1f, -3.1f)
            horizontalLineToRelative(-7.81f)
            curveToRelative(-1.71f, 0f, -3.1f, 1.39f, -3.1f, 3.1f)
            curveToRelative(0f, 1.37f, 0.92f, 2.6f, 2.24f, 2.98f)
            lineToRelative(4.97f, 1.43f)
            horizontalLineToRelative(10.19f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(20.45f, 16.01f)
            curveToRelative(-0.82f, 0.07f, -1.44f, 0.8f, -1.36f, 1.62f)
            curveToRelative(0.01f, 0.09f, 0.01f, 0.18f, 0.01f, 0.27f)
            curveToRelative(0f, 1.71f, -1.39f, 3.1f, -3.1f, 3.1f)
            horizontalLineToRelative(-7.81f)
            curveToRelative(-1.71f, 0f, -3.1f, -1.39f, -3.1f, -3.1f)
            verticalLineToRelative(-0.4f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.4f)
            curveToRelative(0f, 3.36f, 2.73f, 6.1f, 6.1f, 6.1f)
            horizontalLineToRelative(7.81f)
            curveToRelative(3.36f, 0f, 6.09f, -2.73f, 6.09f, -6.1f)
            curveToRelative(0f, -0.18f, -0.01f, -0.36f, -0.02f, -0.54f)
            curveToRelative(-0.07f, -0.82f, -0.79f, -1.44f, -1.62f, -1.36f)
            close()
        }
    }.also { _Strikethrough = it }
