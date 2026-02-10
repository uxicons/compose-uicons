package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle2: ImageVector? = null

val Icons.Ss.Circle2: ImageVector
    get() = _Circle2 ?: UXIcon(name = "Circle2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(16f, 16f)
                horizontalLineToRelative(-5.46f)
                curveToRelative(0.38f, -0.34f, 0.94f, -0.67f, 1.63f, -1.07f)
                curveToRelative(1.7f, -0.98f, 3.82f, -2.21f, 3.82f, -4.93f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 1.46f, -1.07f, 2.18f, -2.82f, 3.2f)
                curveToRelative(-1.49f, 0.86f, -3.18f, 1.83f, -3.18f, 3.8f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _Circle2 = it}
