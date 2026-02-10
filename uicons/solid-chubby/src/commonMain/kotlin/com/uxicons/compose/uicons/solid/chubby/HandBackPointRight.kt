package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointRight: ImageVector? = null

val Icons.Sc.HandBackPointRight: ImageVector
    get() = _HandBackPointRight ?: UXIcon(name = "HandBackPointRight") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.92f, 8.45f)
                curveToRelative(-0.3f, -1.06f, -1.41f, -1.68f, -2.47f, -1.38f)
                curveToRelative(-0.03f, 0.01f, -2.8f, 0.8f, -6.45f, 0.92f)
                curveToRelative(-1.22f, 0.01f, -2.1f, 0.01f, -4f, 0.01f)
                curveToRelative(-0.55f, 0f, -1.0f, -0.45f, -1f, -1.0f)
                curveToRelative(0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                curveToRelative(1.0f, 0f, 2.45f, -0.0f, 2.9f, -0.0f)
                curveToRelative(-0.18f, -0.69f, -0.48f, -1.7f, -0.86f, -2.41f)
                curveToRelative(-0.71f, -1.35f, -2.4f, -2.02f, -3.63f, -1.5f)
                curveToRelative(-0.14f, 0.05f, -3.59f, 1.26f, -6.7f, 5.3f)
                curveToRelative(-0.09f, 0.12f, -0.16f, 0.26f, -0.19f, 0.41f)
                curveToRelative(-0.02f, 0.11f, -0.52f, 2.63f, -0.52f, 5.7f)
                reflectiveCurveToRelative(0.44f, 5.13f, 0.46f, 5.21f)
                curveToRelative(0.06f, 0.27f, 0.23f, 0.51f, 0.47f, 0.65f)
                curveToRelative(3.16f, 1.85f, 6.32f, 2.64f, 10.56f, 2.64f)
                curveToRelative(0.38f, 0f, 0.73f, -0.21f, 0.9f, -0.55f)
                curveToRelative(1.41f, -2.82f, 2.23f, -5.94f, 2.51f, -9.49f)
                curveToRelative(3.05f, -0.3f, 5.53f, -1.02f, 5.65f, -1.05f)
                curveToRelative(1.06f, -0.3f, 1.68f, -1.41f, 1.37f, -2.47f)
                close()
            }
        }.also { _HandBackPointRight = it}
