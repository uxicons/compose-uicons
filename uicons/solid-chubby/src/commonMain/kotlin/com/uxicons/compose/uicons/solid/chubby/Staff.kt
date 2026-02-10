package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Staff: ImageVector? = null

val Icons.Sc.Staff: ImageVector
    get() = _Staff ?: UXIcon(name = "Staff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.39f, 2.65f)
                curveToRelative(-0.14f, -0.52f, -0.55f, -0.91f, -1.07f, -1.05f)
                curveToRelative(-0.1f, -0.02f, -2.35f, -0.6f, -4.82f, -0.6f)
                curveToRelative(-2.49f, 0f, -4.46f, 0.6f, -4.54f, 0.62f)
                curveToRelative(-0.48f, 0.15f, -0.85f, 0.52f, -1.0f, 1f)
                curveToRelative(-0.03f, 0.08f, -0.62f, 2.08f, -0.62f, 4.71f)
                curveToRelative(0f, 0.84f, 0.06f, 1.71f, 0.18f, 2.56f)
                curveToRelative(0.11f, 0.82f, -0.16f, 1.63f, -0.75f, 2.22f)
                lineToRelative(-8.32f, 8.32f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(8.32f, -8.32f)
                curveToRelative(1.25f, -1.25f, 1.85f, -3.02f, 1.6f, -4.76f)
                curveToRelative(-0.1f, -0.72f, -0.15f, -1.44f, -0.15f, -2.15f)
                curveToRelative(0f, -1.25f, 0.16f, -2.34f, 0.3f, -3.03f)
                curveToRelative(0.67f, -0.14f, 1.7f, -0.3f, 2.86f, -0.3f)
                curveToRelative(1.23f, 0f, 2.42f, 0.18f, 3.19f, 0.32f)
                curveToRelative(0.14f, 0.74f, 0.31f, 1.89f, 0.31f, 3.18f)
                curveToRelative(0f, 1.16f, -0.14f, 2.13f, -0.27f, 2.77f)
                curveToRelative(-0.79f, 0.1f, -1.99f, 0.23f, -3.23f, 0.23f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                curveToRelative(2.41f, 0f, 4.62f, -0.4f, 4.72f, -0.42f)
                curveToRelative(0.54f, -0.1f, 0.98f, -0.48f, 1.15f, -1.0f)
                curveToRelative(0.03f, -0.08f, 0.63f, -1.93f, 0.63f, -4.58f)
                curveToRelative(0f, -2.63f, -0.59f, -4.76f, -0.61f, -4.85f)
                close()
            }
        }.also { _Staff = it}
