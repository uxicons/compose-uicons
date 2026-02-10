package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RouteHighway: ImageVector? = null

val Icons.Ss.RouteHighway: ImageVector
    get() = _RouteHighway ?: UXIcon(name = "RouteHighway") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.52f, 6.74f)
                lineToRelative(-0.45f, -0.41f)
                lineTo(3.53f, 0.99f)
                lineToRelative(1.04f, 0.43f)
                curveToRelative(0.97f, 0.4f, 2.18f, 0.6f, 3.4f, 0.58f)
                curveToRelative(1.55f, -0.03f, 2.08f, -0.4f, 3.38f, -1.49f)
                lineTo(12f, -0.02f)
                lineToRelative(0.64f, 0.54f)
                curveToRelative(1.29f, 1.08f, 1.81f, 1.46f, 3.38f, 1.48f)
                curveToRelative(1.3f, 0f, 2.48f, -0.2f, 3.4f, -0.58f)
                lineToRelative(1.04f, -0.43f)
                lineToRelative(1.46f, 5.33f)
                lineToRelative(-0.45f, 0.41f)
                curveToRelative(-0.29f, 0.26f, -0.67f, 0.69f, -0.98f, 1.27f)
                lineToRelative(-17f, -0.0f)
                curveToRelative(-0.31f, -0.58f, -0.69f, -1.0f, -0.98f, -1.26f)
                close()
                moveTo(20f, 10.0f)
                lineToRelative(-16.0f, -0.0f)
                curveToRelative(0f, 0.76f, -0.43f, 1.63f, -0.89f, 2.55f)
                curveToRelative(-0.54f, 1.09f, -1.1f, 2.21f, -1.1f, 3.45f)
                curveToRelative(0f, 4.66f, 4.68f, 6.14f, 7.48f, 7.03f)
                curveToRelative(0.7f, 0.22f, 1.31f, 0.41f, 1.67f, 0.59f)
                lineToRelative(0.85f, 0.42f)
                lineToRelative(0.85f, -0.42f)
                curveToRelative(0.36f, -0.18f, 0.97f, -0.37f, 1.67f, -0.59f)
                curveToRelative(2.8f, -0.88f, 7.48f, -2.36f, 7.48f, -7.03f)
                curveToRelative(0f, -1.24f, -0.56f, -2.36f, -1.1f, -3.45f)
                curveToRelative(-0.46f, -0.92f, -0.89f, -1.78f, -0.89f, -2.55f)
                close()
            }
        }.also { _RouteHighway = it}
