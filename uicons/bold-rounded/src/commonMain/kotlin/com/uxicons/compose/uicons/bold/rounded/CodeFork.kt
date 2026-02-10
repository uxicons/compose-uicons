package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeFork: ImageVector? = null

val Icons.Br.CodeFork: ImageVector
    get() = _CodeFork ?: UXIcon(name = "CodeFork") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 6.66f)
            verticalLineToRelative(1.84f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1.84f)
            curveToRelative(1.18f, 0.56f, 2f, 1.77f, 2f, 3.16f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
            curveToRelative(0f, -1.4f, 0.82f, -2.6f, 2f, -3.16f)
            verticalLineToRelative(-1.84f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-1.84f)
            curveTo(0.82f, 6.1f, 0f, 4.9f, 0f, 3.5f)
            curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 1.4f, -0.82f, 2.6f, -2f, 3.16f)
            verticalLineToRelative(1.84f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.15f, 0f, 2.2f, 0.43f, 3f, 1.15f)
            curveToRelative(0.8f, -0.71f, 1.85f, -1.15f, 3f, -1.15f)
            horizontalLineToRelative(1.5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-1.84f)
            curveToRelative(-1.18f, -0.56f, -2f, -1.77f, -2f, -3.16f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
            curveToRelative(0f, 1.4f, -0.82f, 2.6f, -2f, 3.16f)
            close()
        }
    }.also { _CodeFork = it }
