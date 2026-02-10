package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bridge: ImageVector? = null

val Icons.Br.Bridge: ImageVector
    get() = _Bridge ?: UXIcon(name = "Bridge") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 0f)
            lineTo(4.5f, 0f)
            curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
            verticalLineToRelative(6.44f)
            curveToRelative(0f, 1.49f, 0.93f, 2.81f, 2.31f, 3.29f)
            curveToRelative(1.61f, 0.56f, 2.69f, 2.08f, 2.69f, 3.78f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -1.7f, 1.08f, -3.22f, 2.69f, -3.78f)
            curveToRelative(1.38f, -0.48f, 2.31f, -1.8f, 2.31f, -3.29f)
            lineTo(24f, 4.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(21f, 4.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-4f)
            lineTo(17f, 3f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(10f, 5f)
            lineTo(10f, 3f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-4f)
            close()
            moveTo(4.5f, 3f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(2f)
            lineTo(3f, 5f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(20.71f, 11.39f)
            curveToRelative(-1.3f, 0.45f, -2.39f, 1.27f, -3.2f, 2.31f)
            curveToRelative(-1.28f, -1.64f, -3.27f, -2.69f, -5.51f, -2.69f)
            reflectiveCurveToRelative(-4.22f, 1.06f, -5.51f, 2.69f)
            curveToRelative(-0.81f, -1.03f, -1.9f, -1.85f, -3.2f, -2.31f)
            curveToRelative(-0.17f, -0.06f, -0.29f, -0.24f, -0.29f, -0.45f)
            verticalLineToRelative(-2.94f)
            lineTo(21f, 8f)
            verticalLineToRelative(2.94f)
            curveToRelative(0f, 0.21f, -0.12f, 0.39f, -0.29f, 0.45f)
            close()
        }
    }.also { _Bridge = it }
