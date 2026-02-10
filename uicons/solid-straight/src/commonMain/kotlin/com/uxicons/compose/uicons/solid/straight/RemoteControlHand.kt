package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoteControlHand: ImageVector? = null

val Icons.Ss.RemoteControlHand: ImageVector
    get() = _RemoteControlHand ?: UXIcon(name = "RemoteControlHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8.96f, 7f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(16f, 5.5f)
                verticalLineToRelative(6.17f)
                lineToRelative(3.13f, 2.8f)
                lineToRelative(-1.35f, 1.52f)
                lineToRelative(0.02f, -0.03f)
                lineToRelative(-4.88f, -4.37f)
                curveToRelative(-0.88f, -0.78f, -2.19f, -0.79f, -3.09f, -0.03f)
                curveToRelative(-0.99f, 0.84f, -1.11f, 2.33f, -0.27f, 3.32f)
                lineToRelative(4.44f, 6.4f)
                verticalLineToRelative(2.72f)
                horizontalLineToRelative(10f)
                lineTo(24.0f, 12.5f)
                lineToRelative(-8f, -7f)
                close()
                moveTo(7.96f, 16.09f)
                curveToRelative(-0.7f, -0.87f, -1.04f, -1.97f, -0.95f, -3.09f)
                curveToRelative(0.06f, -0.76f, 0.33f, -1.47f, 0.75f, -2.08f)
                curveToRelative(-0.26f, 0.05f, -0.53f, 0.08f, -0.8f, 0.08f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveTo(4.76f, 3f, 6.96f, 3f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 0.79f, -0.24f, 1.52f, -0.63f, 2.14f)
                curveToRelative(0.33f, -0.08f, 0.68f, -0.14f, 1.02f, -0.14f)
                curveToRelative(0.96f, 0f, 1.88f, 0.33f, 2.64f, 0.92f)
                verticalLineToRelative(-2.92f)
                curveTo(14f, 3.14f, 10.86f, 0f, 7f, 0f)
                reflectiveCurveTo(0f, 3.14f, 0f, 7f)
                verticalLineToRelative(13f)
                lineTo(10.68f, 20f)
                lineToRelative(-2.71f, -3.91f)
                close()
            }
        }.also { _RemoteControlHand = it}
