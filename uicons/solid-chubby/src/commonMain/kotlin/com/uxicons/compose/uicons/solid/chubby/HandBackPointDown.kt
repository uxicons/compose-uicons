package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackPointDown: ImageVector? = null

val Icons.Sc.HandBackPointDown: ImageVector
    get() = _HandBackPointDown ?: UXIcon(name = "HandBackPointDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.36f, 1.93f)
                curveToRelative(-0.14f, -0.24f, -0.38f, -0.41f, -0.65f, -0.47f)
                curveToRelative(-0.09f, -0.02f, -2.14f, -0.46f, -5.21f, -0.46f)
                reflectiveCurveToRelative(-5.59f, 0.5f, -5.7f, 0.52f)
                curveToRelative(-0.15f, 0.03f, -0.29f, 0.09f, -0.41f, 0.19f)
                curveToRelative(-4.04f, 3.11f, -5.25f, 6.55f, -5.3f, 6.7f)
                curveToRelative(-0.52f, 1.23f, 0.15f, 2.93f, 1.5f, 3.63f)
                curveToRelative(0.71f, 0.37f, 1.72f, 0.67f, 2.41f, 0.86f)
                curveToRelative(0f, -0.45f, 0.0f, -1.9f, 0.0f, -2.9f)
                curveToRelative(0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                curveToRelative(0.55f, 0f, 1.0f, 0.45f, 1.0f, 1f)
                curveToRelative(0.01f, 1.9f, 0.01f, 2.79f, -0.01f, 4f)
                curveToRelative(-0.13f, 3.65f, -0.92f, 6.42f, -0.92f, 6.45f)
                curveToRelative(-0.3f, 1.06f, 0.32f, 2.17f, 1.38f, 2.47f)
                curveToRelative(1.06f, 0.3f, 2.17f, -0.31f, 2.47f, -1.37f)
                curveToRelative(0.03f, -0.12f, 0.69f, -2.65f, 0.99f, -5.64f)
                curveToRelative(3.57f, -0.28f, 6.71f, -1.1f, 9.54f, -2.52f)
                curveToRelative(0.34f, -0.17f, 0.55f, -0.52f, 0.55f, -0.9f)
                curveToRelative(0f, -4.24f, -0.79f, -7.4f, -2.64f, -10.56f)
                close()
            }
        }.also { _HandBackPointDown = it}
