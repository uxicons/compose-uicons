package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GolfHole: ImageVector? = null

val Icons.Br.GolfHole: ImageVector
    get() = _GolfHole ?: UXIcon(name = "GolfHole") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 16.5f)
            lineTo(10.5f, 2.0f)
            curveTo(10.5f, 0.0f, 12.25f, -0.26f, 13.12f, 0.18f)
            lineToRelative(6.16f, 4.15f)
            curveToRelative(1.04f, 0.77f, 0.92f, 2.37f, -0.23f, 2.97f)
            lineToRelative(-5.56f, 2.73f)
            verticalLineToRelative(6.47f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(17.96f, 10.89f)
            curveToRelative(-0.79f, -0.26f, -1.63f, 0.18f, -1.89f, 0.97f)
            curveToRelative(-0.25f, 0.79f, 0.18f, 1.63f, 0.97f, 1.89f)
            curveToRelative(2.41f, 0.78f, 3.96f, 2.06f, 3.96f, 3.26f)
            curveToRelative(0f, 1.89f, -3.85f, 4f, -9f, 4f)
            reflectiveCurveToRelative(-9f, -2.11f, -9f, -4f)
            curveToRelative(0f, -1.2f, 1.55f, -2.48f, 3.96f, -3.26f)
            curveToRelative(0.79f, -0.26f, 1.22f, -1.1f, 0.97f, -1.89f)
            curveToRelative(-0.26f, -0.79f, -1.1f, -1.22f, -1.89f, -0.97f)
            curveToRelative(-3.78f, 1.22f, -6.04f, 3.51f, -6.04f, 6.11f)
            curveToRelative(0f, 3.99f, 5.16f, 7f, 12f, 7f)
            reflectiveCurveToRelative(12f, -3.01f, 12f, -7f)
            curveToRelative(0f, -2.61f, -2.26f, -4.89f, -6.04f, -6.11f)
            close()
        }
    }.also { _GolfHole = it }
