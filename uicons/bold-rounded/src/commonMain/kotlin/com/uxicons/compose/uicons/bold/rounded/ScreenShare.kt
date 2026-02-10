package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShare: ImageVector? = null

val Icons.Br.ScreenShare: ImageVector
    get() = _ScreenShare ?: UXIcon(name = "ScreenShare") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22f, 16f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            lineTo(7.5f, 3f)
            curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(7.5f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(1.15f)
            curveToRelative(0f, 1.02f, 0.83f, 1.85f, 1.85f, 1.85f)
            lineTo(22.15f, 21f)
            curveToRelative(1.02f, 0f, 1.85f, -0.83f, 1.85f, -1.85f)
            verticalLineToRelative(-1.15f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            close()
            moveTo(14.77f, 17f)
            horizontalLineToRelative(-5.54f)
            lineToRelative(-0.92f, -1f)
            horizontalLineToRelative(-3.31f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(9f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-3.31f)
            lineToRelative(-0.92f, 1f)
            close()
            moveTo(15.72f, 10.52f)
            curveToRelative(0.6f, 0.6f, 0.18f, 1.64f, -0.68f, 1.64f)
            horizontalLineToRelative(-1.54f)
            verticalLineToRelative(2.34f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-2.34f)
            horizontalLineToRelative(-1.54f)
            curveToRelative(-0.86f, 0f, -1.28f, -1.03f, -0.68f, -1.64f)
            lineToRelative(3.04f, -3.04f)
            curveToRelative(0.38f, -0.38f, 0.98f, -0.38f, 1.36f, 0f)
            lineToRelative(3.04f, 3.04f)
            close()
        }
    }.also { _ScreenShare = it }
