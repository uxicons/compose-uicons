package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThreeDirection: ImageVector? = null

val Icons.Br.ThreeDirection: ImageVector
    get() = _ThreeDirection ?: UXIcon(name = "ThreeDirection") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.1f, 11.97f)
            curveToRelative(1.23f, 1.23f, 1.9f, 2.86f, 1.9f, 4.6f)
            verticalLineToRelative(5.93f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.93f)
            curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
            lineToRelative(-0.77f, -0.77f)
            lineToRelative(-1.36f, 1.36f)
            curveToRelative(-0.68f, 0.68f, -1.84f, 0.2f, -1.84f, -0.76f)
            verticalLineToRelative(-4.84f)
            curveToRelative(0f, -0.6f, 0.48f, -1.08f, 1.08f, -1.08f)
            lineTo(5.92f, 8f)
            curveToRelative(0.96f, 0f, 1.45f, 1.16f, 0.76f, 1.84f)
            lineToRelative(-1.36f, 1.36f)
            lineToRelative(0.77f, 0.77f)
            close()
            moveTo(16.12f, 4.18f)
            lineTo(12.75f, 0.81f)
            curveToRelative(-0.42f, -0.42f, -1.09f, -0.42f, -1.51f, 0f)
            lineToRelative(-3.37f, 3.37f)
            curveToRelative(-0.67f, 0.67f, -0.2f, 1.82f, 0.75f, 1.82f)
            horizontalLineToRelative(1.87f)
            lineTo(10.5f, 22.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(13.5f, 6f)
            horizontalLineToRelative(1.87f)
            curveToRelative(0.95f, 0f, 1.42f, -1.15f, 0.75f, -1.82f)
            close()
            moveTo(22.92f, 8f)
            horizontalLineToRelative(-4.84f)
            curveToRelative(-0.96f, 0f, -1.45f, 1.16f, -0.76f, 1.84f)
            lineToRelative(1.36f, 1.36f)
            lineToRelative(-0.77f, 0.77f)
            curveToRelative(-1.23f, 1.23f, -1.9f, 2.86f, -1.9f, 4.6f)
            verticalLineToRelative(5.93f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5.93f)
            curveToRelative(0f, -0.94f, 0.36f, -1.81f, 1.02f, -2.48f)
            lineToRelative(0.77f, -0.77f)
            lineToRelative(1.36f, 1.36f)
            curveToRelative(0.68f, 0.68f, 1.84f, 0.2f, 1.84f, -0.76f)
            verticalLineToRelative(-4.84f)
            curveToRelative(0f, -0.6f, -0.48f, -1.08f, -1.08f, -1.08f)
            close()
        }
    }.also { _ThreeDirection = it }
