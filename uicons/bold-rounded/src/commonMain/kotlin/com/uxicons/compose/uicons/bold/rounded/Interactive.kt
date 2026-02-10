package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Interactive: ImageVector? = null

val Icons.Br.Interactive: ImageVector
    get() = _Interactive ?: UXIcon(name = "Interactive", viewportWidth = 512f, viewportHeight = 512f) {
        path(fill = SolidColor(Color.Black)) {
            moveTo(64f, 213.33f)
            curveToRelative(0.58f, -82.47f, 67.92f, -148.86f, 150.39f, -148.27f)
            curveToRelative(72.92f, 0.52f, 134.8f, 53.62f, 146.38f, 125.61f)
            lineToRelative(65.9f, 23.94f)
            curveToRelative(0f, -0.43f, 0f, -0.85f, 0f, -1.28f)
            curveTo(426.67f, 95.51f, 331.15f, 0f, 213.33f, 0f)
            reflectiveCurveTo(0f, 95.51f, 0f, 213.33f)
            reflectiveCurveToRelative(95.51f, 213.33f, 213.33f, 213.33f)
            curveToRelative(0.45f, 0f, 0.85f, 0f, 1.3f, 0f)
            lineToRelative(-23.94f, -65.9f)
            curveTo(117.88f, 349.6f, 64.09f, 287f, 64f, 213.33f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(289.43f, 172.27f)
            curveToRelative(3.65f, 0f, 7.25f, 0.62f, 10.88f, 0.96f)
            curveToRelative(-22.05f, -48.13f, -78.93f, -69.27f, -127.06f, -47.23f)
            reflectiveCurveToRelative(-69.27f, 78.93f, -47.23f, 127.06f)
            curveToRelative(9.52f, 20.78f, 26.16f, 37.48f, 46.91f, 47.08f)
            curveToRelative(-5.82f, -64.54f, 41.78f, -121.58f, 106.32f, -127.4f)
            curveTo(282.63f, 172.43f, 286.03f, 172.28f, 289.43f, 172.27f)
            lineTo(289.43f, 172.27f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(502.57f, 457.32f)
            lineToRelative(-56.43f, -56.43f)
            lineToRelative(35.54f, -35.54f)
            curveToRelative(22.01f, -22f, 22.01f, -57.67f, 0.02f, -79.68f)
            curveToRelative(-5.82f, -5.83f, -12.86f, -10.31f, -20.6f, -13.12f)
            lineTo(315.22f, 219.52f)
            curveToRelative(-38.76f, -14.09f, -81.6f, 5.9f, -95.69f, 44.66f)
            curveToRelative(-5.99f, 16.49f, -5.99f, 34.56f, 0.01f, 51.04f)
            lineToRelative(53.03f, 145.88f)
            curveToRelative(6.54f, 18.13f, 21.92f, 31.63f, 40.75f, 35.76f)
            curveToRelative(4.05f, 0.9f, 8.18f, 1.36f, 12.33f, 1.37f)
            curveToRelative(14.91f, -0.01f, 29.19f, -5.96f, 39.7f, -16.53f)
            lineToRelative(35.54f, -35.54f)
            lineToRelative(56.43f, 56.43f)
            curveToRelative(12.28f, 12.71f, 32.54f, 13.06f, 45.25f, 0.79f)
            curveToRelative(12.71f, -12.28f, 13.06f, -32.54f, 0.79f, -45.25f)
            curveTo(503.1f, 457.84f, 502.84f, 457.58f, 502.57f, 457.32f)
            close()
            moveTo(328.53f, 427.95f)
            lineTo(279.68f, 293.36f)
            curveToRelative(-1.54f, -3.88f, -0.55f, -8.32f, 2.5f, -11.18f)
            curveToRelative(2.83f, -3.09f, 7.3f, -4.09f, 11.18f, -2.5f)
            lineToRelative(134.59f, 48.85f)
            lineTo(328.53f, 427.95f)
            close()
        }
    }.also { _Interactive = it }
