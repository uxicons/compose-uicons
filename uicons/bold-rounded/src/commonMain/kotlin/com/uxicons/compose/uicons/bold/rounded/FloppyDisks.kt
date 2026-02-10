package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FloppyDisks: ImageVector? = null

val Icons.Br.FloppyDisks: ImageVector
    get() = _FloppyDisks ?: UXIcon(name = "FloppyDisks") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 11f)
            curveToRelative(0f, 1.66f, -1.34f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
            reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            close()
            moveTo(24f, 6.61f)
            verticalLineToRelative(6.89f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-8f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(5f, 5.5f)
            curveTo(5f, 2.47f, 7.47f, 0f, 10.5f, 0f)
            horizontalLineToRelative(6.89f)
            curveToRelative(0.94f, 0f, 1.81f, 0.36f, 2.48f, 1.02f)
            lineToRelative(3.1f, 3.11f)
            curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.48f)
            close()
            moveTo(21f, 6.61f)
            curveToRelative(0f, -0.13f, -0.05f, -0.26f, -0.15f, -0.35f)
            lineToRelative(-2.85f, -2.85f)
            verticalLineToRelative(1.1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.45f)
            curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(8f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-6.89f)
            close()
            moveTo(16.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 7.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(11f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _FloppyDisks = it }
