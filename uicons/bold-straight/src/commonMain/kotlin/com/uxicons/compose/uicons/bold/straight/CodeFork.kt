package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CodeFork: ImageVector? = null

val Icons.Bs.CodeFork: ImageVector
    get() = _CodeFork ?: UXIcon(name = "CodeFork") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.57f, -3.5f, 3.5f)
                curveToRelative(0f, 1.4f, 0.82f, 2.6f, 2f, 3.16f)
                verticalLineToRelative(2.84f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-1.15f, 0f, -2.2f, 0.43f, -3f, 1.15f)
                curveToRelative(-0.8f, -0.71f, -1.85f, -1.15f, -3f, -1.15f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2.84f)
                curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveTo(0f, 1.57f, 0f, 3.5f)
                curveToRelative(0f, 1.4f, 0.82f, 2.6f, 2f, 3.16f)
                verticalLineToRelative(2.84f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.84f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.4f, -0.82f, -2.6f, -2f, -3.16f)
                verticalLineToRelative(-2.84f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-2.84f)
                curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
                close()
            }
        }.also { _CodeFork = it}
