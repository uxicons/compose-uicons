package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScreenRecorder: ImageVector? = null

val Icons.Br.ScreenRecorder: ImageVector
    get() = _ScreenRecorder ?: UXIcon(name = "ScreenRecorder") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 11.5f)
            verticalLineToRelative(2f)
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
            verticalLineToRelative(-8f)
            curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(20f, 8f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            close()
            moveTo(13.38f, 8.23f)
            lineTo(11.88f, 9.35f)
            curveToRelative(-0.27f, -0.78f, -1.01f, -1.35f, -1.88f, -1.35f)
            horizontalLineToRelative(-3f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.87f, 0f, 1.6f, -0.56f, 1.88f, -1.33f)
            lineToRelative(1.5f, 1.12f)
            curveToRelative(0.67f, 0.5f, 1.62f, 0.03f, 1.62f, -0.81f)
            verticalLineToRelative(-3.94f)
            curveToRelative(0f, -0.84f, -0.96f, -1.31f, -1.62f, -0.81f)
            close()
        }
    }.also { _ScreenRecorder = it }
