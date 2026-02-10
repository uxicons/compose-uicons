package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RocketHand: ImageVector? = null

val Icons.Bs.RocketHand: ImageVector
    get() = _RocketHand ?: UXIcon(name = "RocketHand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.58f, 13.79f)
                lineToRelative(-5.04f, 3.66f)
                lineToRelative(6.46f, 6.55f)
                horizontalLineTo(13f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.99f)
                lineToRelative(-5.55f, -5.45f)
                curveToRelative(-0.64f, -0.64f, -0.59f, -1.72f, 0.18f, -2.28f)
                curveToRelative(0.61f, -0.44f, 1.48f, -0.33f, 2.0f, 0.2f)
                lineToRelative(2.81f, 2.85f)
                lineToRelative(7.66f, -5.26f)
                lineToRelative(1.9f, 1.9f)
                verticalLineToRelative(4.24f)
                lineToRelative(-2.42f, -2.42f)
                close()
                moveTo(17.36f, 0.64f)
                curveTo(16.72f, 0.01f, 15.78f, -0.17f, 14.94f, 0.17f)
                curveToRelative(-3.23f, 1.17f, -5.91f, 2.23f, -8.32f, 4.24f)
                curveToRelative(-2.3f, 0.33f, -4.8f, 1.8f, -6.62f, 4.01f)
                verticalLineToRelative(2.58f)
                horizontalLineTo(3.38f)
                lineToRelative(0.75f, 0.75f)
                lineToRelative(-2.19f, 2.19f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(2.97f, -2.97f)
                curveToRelative(0.08f, -0.7f, 0.36f, -1.34f, 0.81f, -1.87f)
                lineToRelative(-2.08f, -2.08f)
                curveToRelative(1.32f, -1.34f, 2.62f, -2.3f, 2.69f, -2.36f)
                curveToRelative(1.75f, -1.45f, 3.71f, -2.36f, 6.0f, -3.23f)
                curveToRelative(-0.81f, 2.24f, -1.67f, 4.34f, -3.19f, 6.18f)
                curveToRelative(-0.0f, 0.0f, -0.1f, 0.13f, -0.24f, 0.32f)
                curveToRelative(0.74f, 0.11f, 1.46f, 0.44f, 2.02f, 1.0f)
                lineToRelative(0.56f, 0.57f)
                curveToRelative(2.22f, -2.72f, 3.29f, -5.82f, 4.31f, -8.92f)
                curveToRelative(0.18f, -0.74f, -0.01f, -1.51f, -0.56f, -2.06f)
                close()
            }
        }.also { _RocketHand = it}
