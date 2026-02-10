package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RemoteControlHand: ImageVector? = null

val Icons.Sr.RemoteControlHand: ImageVector
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
                lineToRelative(2.38f, 2.13f)
                curveToRelative(0.42f, 0.37f, 0.45f, 1.01f, 0.08f, 1.43f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.37f, 0.42f, -1.02f, 0.46f, -1.44f, 0.08f)
                lineToRelative(-4.11f, -3.71f)
                curveToRelative(-0.88f, -0.78f, -2.19f, -0.79f, -3.09f, -0.03f)
                curveToRelative(-0.99f, 0.84f, -1.11f, 2.33f, -0.27f, 3.32f)
                lineToRelative(3.73f, 5.37f)
                curveToRelative(0.47f, 0.67f, 0.71f, 1.47f, 0.71f, 2.28f)
                verticalLineToRelative(0.47f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-5.96f)
                curveToRelative(0f, -2.88f, -1.25f, -5.63f, -3.42f, -7.53f)
                lineToRelative(-4.58f, -4.01f)
                close()
                moveTo(7.96f, 16.09f)
                curveToRelative(-0.7f, -0.87f, -1.04f, -1.97f, -0.95f, -3.09f)
                curveToRelative(0.06f, -0.76f, 0.33f, -1.47f, 0.75f, -2.08f)
                curveToRelative(-0.59f, 0.12f, -1.23f, 0.11f, -1.89f, -0.07f)
                curveToRelative(-1.35f, -0.36f, -2.44f, -1.46f, -2.79f, -2.82f)
                curveToRelative(-0.76f, -3.0f, 1.9f, -5.66f, 4.91f, -4.9f)
                curveToRelative(1.33f, 0.34f, 2.41f, 1.39f, 2.79f, 2.71f)
                curveToRelative(0.36f, 1.23f, 0.12f, 2.38f, -0.46f, 3.3f)
                curveToRelative(0.33f, -0.08f, 0.68f, -0.14f, 1.02f, -0.14f)
                curveToRelative(0.96f, 0f, 1.88f, 0.33f, 2.64f, 0.92f)
                verticalLineToRelative(-2.67f)
                curveToRelative(0f, -3.56f, -2.55f, -6.73f, -6.08f, -7.18f)
                curveTo(3.65f, -0.49f, 0f, 2.84f, 0f, 7f)
                lineTo(0f, 15f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(5.68f)
                lineToRelative(-2.71f, -3.91f)
                close()
            }
        }.also { _RemoteControlHand = it}
