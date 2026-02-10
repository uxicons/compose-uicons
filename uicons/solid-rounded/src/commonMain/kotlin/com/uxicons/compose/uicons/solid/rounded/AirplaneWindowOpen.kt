package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AirplaneWindowOpen: ImageVector? = null

val Icons.Sr.AirplaneWindowOpen: ImageVector
    get() = _AirplaneWindowOpen ?: UXIcon(name = "AirplaneWindowOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.52f, 6f)
                curveTo(4.76f, 2.51f, 8.09f, 0f, 12f, 0f)
                reflectiveCurveToRelative(7.24f, 2.51f, 8.47f, 6f)
                lineTo(3.52f, 6f)
                close()
                moveTo(16.08f, 15.12f)
                curveToRelative(-0.58f, -0.24f, -1.01f, -0.75f, -1.14f, -1.35f)
                curveToRelative(-0.23f, -1.06f, -1.14f, -1.77f, -2.19f, -1.77f)
                curveToRelative(-0.12f, 0f, -0.24f, 0.01f, -0.37f, 0.03f)
                curveToRelative(-0.59f, 0.09f, -1.16f, 0.48f, -1.51f, 1.05f)
                curveToRelative(-0.33f, 0.52f, -0.43f, 1.01f, -0.34f, 1.53f)
                curveToRelative(0.14f, 0.77f, -0.28f, 1.51f, -1.02f, 1.81f)
                curveToRelative(-0.3f, 0.12f, -0.58f, 0.46f, -0.5f, 0.92f)
                curveToRelative(0.07f, 0.38f, 0.45f, 0.66f, 0.9f, 0.66f)
                horizontalLineToRelative(5.0f)
                curveToRelative(1.14f, 0f, 1.93f, -0.47f, 2.06f, -1.23f)
                curveToRelative(0.12f, -0.7f, -0.25f, -1.38f, -0.9f, -1.65f)
                close()
                moveTo(20.94f, 8f)
                curveToRelative(0.04f, 0.33f, 0.06f, 0.66f, 0.06f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 19.96f, 3f, 15f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -0.34f, 0.02f, -0.67f, 0.06f, -1f)
                lineTo(20.94f, 8f)
                close()
                moveTo(16.88f, 13.28f)
                curveToRelative(-0.5f, -2.16f, -2.6f, -3.57f, -4.8f, -3.23f)
                curveToRelative(-1.16f, 0.18f, -2.24f, 0.92f, -2.9f, 1.97f)
                curveToRelative(-0.53f, 0.85f, -0.75f, 1.74f, -0.65f, 2.65f)
                curveToRelative(-1.1f, 0.57f, -1.7f, 1.77f, -1.48f, 3.02f)
                curveToRelative(0.24f, 1.34f, 1.45f, 2.31f, 2.86f, 2.31f)
                horizontalLineToRelative(5.0f)
                curveToRelative(2.15f, 0f, 3.74f, -1.14f, 4.03f, -2.9f)
                curveToRelative(0.27f, -1.61f, -0.58f, -3.18f, -2.08f, -3.82f)
                close()
            }
        }.also { _AirplaneWindowOpen = it}
