package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBackFist: ImageVector? = null

val Icons.Br.HandBackFist: ImageVector
    get() = _HandBackFist ?: UXIcon(name = "HandBackFist") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 24f)
            horizontalLineToRelative(-6f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            verticalLineToRelative(-1.4f)
            lineToRelative(-3.81f, -3.96f)
            curveToRelative(-1.6f, -1.66f, -1.57f, -4.33f, 0.07f, -5.96f)
            lineToRelative(3.74f, -3.71f)
            verticalLineToRelative(-0.22f)
            curveToRelative(0f, -1.3f, 0.58f, -2.51f, 1.6f, -3.32f)
            curveTo(8.63f, 0.13f, 9.94f, -0.17f, 11.21f, 0.13f)
            lineToRelative(7.55f, 1.77f)
            curveToRelative(2.5f, 0.59f, 4.24f, 2.79f, 4.24f, 5.36f)
            verticalLineToRelative(2.89f)
            curveToRelative(0f, 1.09f, -0.2f, 2.15f, -0.61f, 3.16f)
            lineToRelative(-1.39f, 3.48f)
            verticalLineToRelative(2.71f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            close()
            moveTo(6f, 8.7f)
            lineToRelative(-1.63f, 1.62f)
            curveToRelative(-0.48f, 0.48f, -0.49f, 1.26f, -0.02f, 1.75f)
            lineToRelative(4.23f, 4.39f)
            curveToRelative(0.27f, 0.28f, 0.42f, 0.65f, 0.42f, 1.04f)
            verticalLineToRelative(2.0f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.19f, 0.04f, -0.38f, 0.11f, -0.56f)
            lineToRelative(1.5f, -3.75f)
            curveToRelative(0.26f, -0.65f, 0.39f, -1.34f, 0.39f, -2.04f)
            verticalLineToRelative(-2.89f)
            curveToRelative(0f, -1.17f, -0.79f, -2.17f, -1.93f, -2.43f)
            lineToRelative(-7.55f, -1.77f)
            curveToRelative(-0.37f, -0.09f, -0.75f, -0.0f, -1.05f, 0.23f)
            curveToRelative(-0.3f, 0.24f, -0.47f, 0.59f, -0.47f, 0.97f)
            verticalLineToRelative(6.24f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.8f)
            close()
        }
    }.also { _HandBackFist = it }
