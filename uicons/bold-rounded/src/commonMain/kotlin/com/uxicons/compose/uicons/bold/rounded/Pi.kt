package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pi: ImageVector? = null

val Icons.Br.Pi: ImageVector
    get() = _Pi ?: UXIcon(name = "Pi") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 19.5f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
            verticalLineTo(3f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(12.11f)
            curveToRelative(0f, 5.2f, -3.34f, 8.36f, -3.48f, 8.49f)
            curveToRelative(-0.29f, 0.27f, -0.66f, 0.4f, -1.02f, 0.4f)
            curveToRelative(-0.4f, 0f, -0.8f, -0.16f, -1.1f, -0.48f)
            curveToRelative(-0.56f, -0.61f, -0.53f, -1.56f, 0.08f, -2.12f)
            curveToRelative(0.02f, -0.02f, 2.52f, -2.44f, 2.52f, -6.29f)
            verticalLineTo(3f)
            curveToRelative(-3.79f, 0f, -4.0f, 2.91f, -4f, 3.5f)
            curveToRelative(-0.01f, 0.82f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.0f)
            curveToRelative(-0.82f, 0f, -1.49f, -0.65f, -1.5f, -1.48f)
            curveToRelative(-0.0f, -0.28f, 0.02f, -2.75f, 1.87f, -4.61f)
            curveTo(3.12f, 0.64f, 4.84f, 0f, 7f, 0f)
            horizontalLineToRelative(15.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-4.5f)
            verticalLineToRelative(16.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
        }
    }.also { _Pi = it }
