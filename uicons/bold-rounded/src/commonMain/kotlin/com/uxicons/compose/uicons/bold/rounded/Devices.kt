package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Devices: ImageVector? = null

val Icons.Br.Devices: ImageVector
    get() = _Devices ?: UXIcon(name = "Devices") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 16.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(6.5f, 23f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 6.5f)
            curveTo(0f, 3.47f, 2.47f, 1f, 5.5f, 1f)
            horizontalLineToRelative(11f)
            curveToRelative(2.51f, 0f, 4.7f, 1.7f, 5.33f, 4.13f)
            curveToRelative(0.21f, 0.8f, -0.28f, 1.62f, -1.08f, 1.83f)
            curveToRelative(-0.8f, 0.2f, -1.62f, -0.28f, -1.83f, -1.08f)
            curveToRelative(-0.28f, -1.1f, -1.28f, -1.87f, -2.42f, -1.87f)
            lineTo(5.5f, 4.01f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 13f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            horizontalLineToRelative(-2f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
            horizontalLineToRelative(2f)
            curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
            close()
            moveTo(21f, 13f)
            curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
            horizontalLineToRelative(2f)
            curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
            verticalLineToRelative(-7f)
            close()
        }
    }.also { _Devices = it }
