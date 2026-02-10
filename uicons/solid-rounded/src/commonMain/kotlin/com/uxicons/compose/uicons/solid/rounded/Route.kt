package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Route: ImageVector? = null

val Icons.Sr.Route: ImageVector
    get() = _Route ?: UXIcon(name = "Route") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.54f, 14.46f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.03f, 7.1f)
                lineToRelative(1.99f, 1.85f)
                curveToRelative(0.43f, 0.4f, 0.98f, 0.6f, 1.52f, 0.6f)
                reflectiveCurveToRelative(1.1f, -0.2f, 1.53f, -0.6f)
                lineToRelative(2.0f, -1.87f)
                curveToRelative(0.94f, -0.94f, 1.47f, -2.2f, 1.47f, -3.54f)
                reflectiveCurveToRelative(-0.52f, -2.59f, -1.47f, -3.54f)
                close()
                moveTo(17.48f, 10.41f)
                curveToRelative(0.43f, 0.4f, 0.98f, 0.6f, 1.52f, 0.6f)
                reflectiveCurveToRelative(1.1f, -0.2f, 1.53f, -0.6f)
                lineToRelative(2.0f, -1.87f)
                curveToRelative(1.95f, -1.95f, 1.95f, -5.12f, 0f, -7.07f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.94f, -0.94f, -2.2f, -1.46f, -3.54f, -1.46f)
                reflectiveCurveToRelative(-2.59f, 0.52f, -3.54f, 1.46f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.03f, 7.1f)
                lineToRelative(1.99f, 1.85f)
                close()
                moveTo(24f, 20.0f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(11f, 24.0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.69f, 1.07f, -3.21f, 2.67f, -3.77f)
                curveToRelative(0.52f, -0.18f, 1.09f, 0.09f, 1.28f, 0.61f)
                curveToRelative(0.18f, 0.52f, -0.09f, 1.09f, -0.61f, 1.28f)
                curveToRelative(-0.8f, 0.28f, -1.33f, 1.04f, -1.33f, 1.89f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(5f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
            }
        }.also { _Route = it}
