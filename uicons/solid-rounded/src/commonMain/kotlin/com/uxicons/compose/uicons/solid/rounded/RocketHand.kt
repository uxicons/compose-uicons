package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RocketHand: ImageVector? = null

val Icons.Sr.RocketHand: ImageVector
    get() = _RocketHand ?: UXIcon(name = "RocketHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 24f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.11f, 0f, -2.0f, -0.9f, -2.0f, -2.0f)
                horizontalLineToRelative(0f)
                curveToRelative(0f, -1.1f, 0.89f, -2f, 2.0f, -2.0f)
                lineToRelative(2.66f, 0.01f)
                lineToRelative(-7.06f, -6.6f)
                curveToRelative(-0.86f, -0.86f, -0.77f, -2.31f, 0.26f, -3.05f)
                curveToRelative(0.81f, -0.58f, 1.94f, -0.41f, 2.65f, 0.29f)
                lineToRelative(3.94f, 3.47f)
                lineToRelative(4.76f, -2.81f)
                curveToRelative(0.69f, -0.3f, 1.45f, -0.35f, 2.14f, -0.16f)
                curveToRelative(0.39f, 0.11f, 0.65f, 0.48f, 0.65f, 0.89f)
                verticalLineToRelative(9.98f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                close()
                moveTo(17.95f, 3.09f)
                curveToRelative(-0.98f, 2.74f, -1.9f, 4.85f, -3.27f, 6.81f)
                lineToRelative(-0.81f, -0.72f)
                curveToRelative(-1.42f, -1.37f, -3.63f, -1.56f, -5.18f, -0.45f)
                curveToRelative(-0.96f, 0.69f, -1.57f, 1.76f, -1.66f, 2.93f)
                curveToRelative(-0.09f, 1.17f, 0.33f, 2.32f, 1.21f, 3.2f)
                lineToRelative(2.27f, 2.14f)
                curveToRelative(-0.52f, 0.52f, -1.38f, 1.03f, -2.12f, 1f)
                curveToRelative(-1.41f, 0f, -2.38f, -1.14f, -2.38f, -2.55f)
                lineToRelative(-1.04f, -0.99f)
                lineToRelative(-0.83f, 0.83f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                reflectiveCurveToRelative(-0.39f, -1.02f, 0f, -1.41f)
                lineToRelative(0.79f, -0.79f)
                lineToRelative(-1.14f, -1.08f)
                curveToRelative(-1.28f, 0.07f, -2.37f, -0.95f, -2.37f, -2.23f)
                curveToRelative(0.27f, -2.62f, 4.3f, -4.36f, 6.05f, -4.72f)
                curveTo(8.63f, 2.61f, 10.95f, 1.49f, 14.62f, 0.17f)
                curveToRelative(1.0f, -0.36f, 2.01f, -0.19f, 2.7f, 0.45f)
                curveToRelative(0.65f, 0.61f, 0.89f, 1.53f, 0.62f, 2.46f)
                close()
                moveTo(14.5f, 5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
            }
        }.also { _RocketHand = it}
