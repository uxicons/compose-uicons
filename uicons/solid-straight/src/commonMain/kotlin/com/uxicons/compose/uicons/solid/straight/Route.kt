package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Route: ImageVector? = null

val Icons.Ss.Route: ImageVector
    get() = _Route ?: UXIcon(name = "Route") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 20f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                lineTo(7.85f, 24f)
                lineToRelative(2.04f, -2f)
                horizontalLineToRelative(10.1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-5f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -1.93f, 1.37f, -3.54f, 3.19f, -3.92f)
                lineToRelative(1.96f, 1.92f)
                horizontalLineToRelative(-1.15f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(5f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                close()
                moveTo(22.54f, 8.54f)
                lineToRelative(-3.54f, 3.46f)
                lineToRelative(-3.53f, -3.45f)
                curveToRelative(-1.96f, -1.96f, -1.96f, -5.13f, -0.01f, -7.08f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.46f)
                curveToRelative(1.95f, 1.95f, 1.95f, 5.12f, 0f, 7.07f)
                close()
                moveTo(8.54f, 13.46f)
                curveToRelative(1.95f, 1.95f, 1.95f, 5.12f, 0f, 7.07f)
                lineToRelative(-3.54f, 3.46f)
                lineToRelative(-3.53f, -3.45f)
                curveToRelative(-1.96f, -1.96f, -1.96f, -5.13f, -0.01f, -7.08f)
                curveToRelative(0.94f, -0.94f, 2.2f, -1.46f, 3.54f, -1.46f)
                reflectiveCurveToRelative(2.59f, 0.52f, 3.54f, 1.46f)
                close()
            }
        }.also { _Route = it}
