package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Joint: ImageVector? = null

val Icons.Br.Joint: ImageVector
    get() = _Joint ?: UXIcon(name = "Joint") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.5f, 16f)
            horizontalLineToRelative(-12.54f)
            curveToRelative(-4.11f, 0f, -8.12f, 2.64f, -8.29f, 2.75f)
            curveTo(0.25f, 19.03f, 0f, 19.5f, 0f, 20.0f)
            curveToRelative(0f, 0.5f, 0.25f, 0.97f, 0.67f, 1.25f)
            curveToRelative(0.17f, 0.11f, 4.21f, 2.75f, 8.29f, 2.75f)
            horizontalLineToRelative(12.54f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            close()
            moveTo(4.74f, 20.0f)
            curveToRelative(1.26f, -0.53f, 2.8f, -1.0f, 4.23f, -1.0f)
            horizontalLineToRelative(1.92f)
            lineToRelative(2f, 2f)
            horizontalLineToRelative(-3.92f)
            curveToRelative(-1.48f, 0f, -3.01f, -0.48f, -4.23f, -1.0f)
            close()
            moveTo(21f, 21f)
            horizontalLineToRelative(-3.88f)
            lineToRelative(-2f, -2f)
            horizontalLineToRelative(5.88f)
            verticalLineToRelative(2f)
            close()
            moveTo(11f, 4.86f)
            verticalLineToRelative(-1.36f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(1.36f)
            curveToRelative(0f, 0.87f, 0.47f, 1.7f, 1.21f, 2.14f)
            lineToRelative(1.6f, 0.96f)
            curveToRelative(1.35f, 0.81f, 2.19f, 2.29f, 2.19f, 3.86f)
            verticalLineToRelative(0.68f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.68f)
            curveToRelative(0f, -0.52f, -0.28f, -1.02f, -0.73f, -1.29f)
            lineToRelative(-1.6f, -0.96f)
            curveToRelative(-1.65f, -0.99f, -2.67f, -2.8f, -2.67f, -4.72f)
            close()
            moveTo(24f, 10.26f)
            verticalLineToRelative(0.23f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.23f)
            curveToRelative(0f, -0.87f, -0.47f, -1.69f, -1.21f, -2.14f)
            lineToRelative(-2.09f, -1.25f)
            curveToRelative(-1.05f, -0.63f, -1.7f, -1.78f, -1.7f, -3.0f)
            lineTo(16f, 1.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.37f)
            curveToRelative(0f, 0.17f, 0.09f, 0.34f, 0.24f, 0.43f)
            lineToRelative(2.09f, 1.25f)
            curveToRelative(1.65f, 0.99f, 2.67f, 2.79f, 2.67f, 4.72f)
            close()
        }
    }.also { _Joint = it }
