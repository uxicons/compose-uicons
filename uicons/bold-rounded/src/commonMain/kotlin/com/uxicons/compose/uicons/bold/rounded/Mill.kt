package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Mill: ImageVector? = null

val Icons.Br.Mill: ImageVector
    get() = _Mill ?: UXIcon(name = "Mill") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.95f, 10.5f)
            lineToRelative(2.28f, -2.28f)
            lineToRelative(0.65f, 5.21f)
            lineToRelative(-2.93f, -2.93f)
            close()
            moveTo(4.12f, 13.43f)
            lineToRelative(2.93f, -2.93f)
            lineToRelative(-2.28f, -2.28f)
            lineToRelative(-0.65f, 5.21f)
            close()
            moveTo(21.06f, 17.44f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            curveToRelative(-0.1f, 0.1f, -0.22f, 0.15f, -0.33f, 0.22f)
            curveToRelative(-0.05f, 2.3f, -2.1f, 4.27f, -4.41f, 4.22f)
            lineTo(7.68f, 24.0f)
            curveToRelative(-2.3f, 0.05f, -4.36f, -1.92f, -4.41f, -4.22f)
            curveToRelative(-0.12f, -0.07f, -0.23f, -0.12f, -0.33f, -0.22f)
            curveToRelative(-0.59f, -0.59f, -0.59f, -1.53f, 0f, -2.12f)
            lineToRelative(6.94f, -6.94f)
            lineTo(2.94f, 3.56f)
            curveToRelative(-0.59f, -0.58f, -0.59f, -1.54f, 0f, -2.12f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            lineToRelative(1.53f, 1.53f)
            lineToRelative(2.24f, -1.83f)
            curveToRelative(1.84f, -1.5f, 4.5f, -1.5f, 6.34f, 0f)
            lineToRelative(2.24f, 1.83f)
            lineToRelative(1.53f, -1.53f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(-6.94f, 6.94f)
            lineToRelative(6.94f, 6.94f)
            close()
            moveTo(12f, 8.38f)
            lineToRelative(3.28f, -3.28f)
            lineToRelative(-2.01f, -1.64f)
            curveToRelative(-0.74f, -0.6f, -1.81f, -0.6f, -2.54f, 0f)
            lineToRelative(-2.01f, 1.64f)
            lineToRelative(3.28f, 3.28f)
            close()
            moveTo(17.74f, 19.39f)
            lineToRelative(-0.15f, -1.19f)
            lineToRelative(-5.59f, -5.59f)
            lineToRelative(-5.59f, 5.59f)
            lineToRelative(-0.15f, 1.19f)
            curveToRelative(-0.13f, 0.83f, 0.58f, 1.63f, 1.41f, 1.6f)
            horizontalLineToRelative(2.32f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(2.32f)
            curveToRelative(0.83f, 0.02f, 1.54f, -0.78f, 1.42f, -1.6f)
            close()
        }
    }.also { _Mill = it }
