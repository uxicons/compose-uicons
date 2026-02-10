package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hose: ImageVector? = null

val Icons.Br.Hose: ImageVector
    get() = _Hose ?: UXIcon(name = "Hose") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 22.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(1.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(22.5f, 16f)
            lineTo(1.5f, 16f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(21f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(6f, 5f)
            horizontalLineToRelative(9.04f)
            curveToRelative(0.2f, 0.98f, 1.16f, 1.66f, 2.18f, 1.47f)
            lineToRelative(5.99f, -1.3f)
            curveToRelative(0.46f, -0.1f, 0.79f, -0.51f, 0.79f, -0.98f)
            verticalLineToRelative(-1.39f)
            curveToRelative(0f, -0.47f, -0.33f, -0.88f, -0.79f, -0.98f)
            lineToRelative(-6.0f, -1.3f)
            curveToRelative(-1.02f, -0.18f, -1.97f, 0.49f, -2.17f, 1.47f)
            lineTo(6f, 2f)
            curveTo(2.69f, 2f, 0f, 4.69f, 0f, 8f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            horizontalLineToRelative(16.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(6f, 11f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
        }
    }.also { _Hose = it }
