package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RouteHighway: ImageVector? = null

val Icons.Sc.RouteHighway: ImageVector
    get() = _RouteHighway ?: UXIcon(name = "RouteHighway") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.74f, 8.86f)
                curveToRelative(1.74f, -0.55f, 4.8f, -1.36f, 8.26f, -1.36f)
                curveToRelative(3.37f, 0f, 6.47f, 0.82f, 8.25f, 1.38f)
                curveToRelative(0.09f, -0.18f, 0.17f, -0.35f, 0.25f, -0.49f)
                curveToRelative(0.29f, -0.55f, 0.5f, -0.95f, 0.5f, -1.38f)
                curveToRelative(0f, -2.48f, -2.33f, -4f, -4f, -4f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-1.06f, -0.92f, -2.39f, -2f, -4.39f, -2f)
                reflectiveCurveToRelative(-3.33f, 1.08f, -4.39f, 2f)
                horizontalLineToRelative(-0.61f)
                curveToRelative(-1.67f, 0f, -4f, 1.52f, -4f, 4f)
                curveToRelative(0f, 0.43f, 0.21f, 0.83f, 0.5f, 1.38f)
                curveToRelative(0.07f, 0.14f, 0.16f, 0.31f, 0.24f, 0.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 9.5f)
                curveToRelative(-3.46f, 0f, -6.53f, 0.9f, -8.06f, 1.4f)
                curveToRelative(-0.61f, 1.3f, -0.94f, 2.57f, -0.94f, 3.6f)
                curveToRelative(0f, 6.21f, 8.4f, 8.38f, 8.76f, 8.47f)
                curveToRelative(0.08f, 0.02f, 0.16f, 0.03f, 0.24f, 0.03f)
                reflectiveCurveToRelative(0.16f, -0.01f, 0.24f, -0.03f)
                curveToRelative(0.36f, -0.09f, 8.76f, -2.26f, 8.76f, -8.47f)
                curveToRelative(0f, -1.02f, -0.33f, -2.29f, -0.93f, -3.58f)
                curveToRelative(-1.64f, -0.53f, -4.68f, -1.42f, -8.07f, -1.42f)
                close()
            }
        }.also { _RouteHighway = it}
