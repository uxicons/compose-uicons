package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenShield: ImageVector? = null

val Icons.Br.ScreenShield: ImageVector
    get() = _ScreenShield ?: UXIcon(name = "ScreenShield") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 6.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-5f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.68f, 0.75f, -3.24f, 2.06f, -4.29f)
            curveToRelative(0.65f, -0.52f, 1.59f, -0.41f, 2.11f, 0.23f)
            curveToRelative(0.52f, 0.65f, 0.41f, 1.59f, -0.23f, 2.11f)
            curveToRelative(-0.6f, 0.48f, -0.94f, 1.19f, -0.94f, 1.95f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.17f, 0.02f, 0.34f, 0.05f, 0.5f)
            horizontalLineToRelative(17.9f)
            curveToRelative(0.03f, -0.16f, 0.05f, -0.33f, 0.05f, -0.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.76f, -0.34f, -1.47f, -0.94f, -1.95f)
            curveToRelative(-0.65f, -0.52f, -0.75f, -1.46f, -0.23f, -2.11f)
            reflectiveCurveToRelative(1.46f, -0.75f, 2.11f, -0.23f)
            curveToRelative(1.31f, 1.05f, 2.06f, 2.62f, 2.06f, 4.29f)
            close()
            moveTo(6.47f, 6.68f)
            lineTo(6.5f, 3.45f)
            curveToRelative(0f, -1.02f, 0.66f, -1.93f, 1.63f, -2.25f)
            lineToRelative(3.4f, -1.13f)
            curveToRelative(0.31f, -0.1f, 0.64f, -0.1f, 0.94f, 0f)
            lineToRelative(3.39f, 1.12f)
            curveToRelative(0.98f, 0.33f, 1.64f, 1.24f, 1.64f, 2.27f)
            lineToRelative(-0.03f, 3.19f)
            curveToRelative(-0.03f, 1.95f, -0.91f, 4.59f, -4.9f, 6.23f)
            curveToRelative(-0.38f, 0.15f, -0.81f, 0.15f, -1.18f, -0.02f)
            curveToRelative(-1.13f, -0.5f, -4.82f, -2.44f, -4.92f, -6.19f)
            close()
            moveTo(9.47f, 6.66f)
            curveToRelative(0.04f, 1.56f, 1.63f, 2.67f, 2.56f, 3.19f)
            curveToRelative(1.62f, -0.8f, 2.42f, -1.86f, 2.44f, -3.23f)
            lineToRelative(0.02f, -2.71f)
            lineToRelative(-2.5f, -0.83f)
            lineToRelative(-2.5f, 0.83f)
            lineToRelative(-0.02f, 2.75f)
            close()
        }
    }.also { _ScreenShield = it }
