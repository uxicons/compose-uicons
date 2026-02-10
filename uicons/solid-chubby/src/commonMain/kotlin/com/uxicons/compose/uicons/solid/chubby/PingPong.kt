package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PingPong: ImageVector? = null

val Icons.Sc.PingPong: ImageVector
    get() = _PingPong ?: UXIcon(name = "PingPong") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.26f, 10.75f)
                curveToRelative(1.43f, 0f, 3.83f, -0.5f, 3.83f, -3.85f)
                reflectiveCurveToRelative(-2.4f, -3.85f, -3.83f, -3.85f)
                reflectiveCurveToRelative(-3.83f, 0.5f, -3.83f, 3.85f)
                reflectiveCurveToRelative(2.4f, 3.85f, 3.83f, 3.85f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.81f, 4.16f)
                curveToRelative(-2.25f, -2.27f, -5.64f, -4.74f, -10.05f, -1.82f)
                curveToRelative(1.31f, 0.92f, 2.02f, 2.48f, 2.02f, 4.57f)
                curveToRelative(0f, 1.32f, -0.28f, 2.42f, -0.82f, 3.29f)
                lineToRelative(7.44f, 7.5f)
                curveToRelative(0.47f, -0.37f, 0.94f, -0.79f, 1.41f, -1.27f)
                curveToRelative(5.47f, -5.5f, 2.62f, -9.65f, 0f, -12.28f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.26f, 12.44f)
                curveToRelative(-0.53f, 0f, -1.03f, -0.05f, -1.49f, -0.14f)
                curveToRelative(0.17f, 0.52f, 0.42f, 1.04f, 0.73f, 1.56f)
                lineToRelative(-2.15f, 1.12f)
                curveToRelative(-1.21f, 0.63f, -2.02f, 1.76f, -2.23f, 3.11f)
                curveToRelative(-0.21f, 1.35f, 0.21f, 2.7f, 1.18f, 3.66f)
                curveToRelative(1.54f, 1.53f, 3.41f, 1.23f, 3.63f, 1.2f)
                curveToRelative(1.35f, -0.21f, 2.48f, -1.03f, 3.11f, -2.25f)
                lineToRelative(1.11f, -2.17f)
                curveToRelative(2.17f, 1.3f, 4.32f, 1.4f, 6.52f, 0.28f)
                lineToRelative(-7.14f, -7.2f)
                curveToRelative(-0.87f, 0.54f, -1.97f, 0.82f, -3.28f, 0.82f)
                close()
            }
        }.also { _PingPong = it}
