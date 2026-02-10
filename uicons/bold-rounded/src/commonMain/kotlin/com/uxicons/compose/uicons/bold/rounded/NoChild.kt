package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoChild: ImageVector? = null

val Icons.Br.NoChild: ImageVector
    get() = _NoChild ?: UXIcon(name = "NoChild") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 0f)
            curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
            reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
            reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
            reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
            close()
            moveTo(21f, 12f)
            curveToRelative(0f, 1.94f, -0.62f, 3.73f, -1.67f, 5.21f)
            lineToRelative(-2.16f, -2.16f)
            curveToRelative(0.2f, -0.34f, 0.37f, -0.7f, 0.5f, -1.08f)
            curveToRelative(0.11f, 0.02f, 0.22f, 0.03f, 0.34f, 0.03f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            curveToRelative(-0.12f, 0f, -0.23f, 0.01f, -0.34f, 0.03f)
            curveToRelative(-0.82f, -2.33f, -3.05f, -4.01f, -5.66f, -4.03f)
            curveToRelative(0f, 0.81f, 0.43f, 1.09f, 0.48f, 1.12f)
            curveToRelative(0.46f, 0.28f, 0.64f, 0.88f, 0.38f, 1.35f)
            curveToRelative(-0.26f, 0.48f, -0.83f, 0.66f, -1.31f, 0.42f)
            curveToRelative(-0.54f, -0.27f, -1.41f, -1.1f, -1.53f, -2.56f)
            curveToRelative(-0.37f, 0.11f, -0.73f, 0.29f, -1.07f, 0.5f)
            lineToRelative(-2.16f, -2.16f)
            curveToRelative(1.47f, -1.05f, 3.27f, -1.67f, 5.21f, -1.67f)
            curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
            close()
            moveTo(15.12f, 12.99f)
            lineTo(13.01f, 10.88f)
            curveToRelative(0.27f, -0.24f, 0.61f, -0.39f, 0.99f, -0.39f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            curveToRelative(0f, 0.38f, -0.15f, 0.73f, -0.39f, 0.99f)
            close()
            moveTo(3f, 12f)
            curveToRelative(0f, -1.94f, 0.62f, -3.73f, 1.67f, -5.21f)
            lineToRelative(12.53f, 12.53f)
            curveToRelative(-1.47f, 1.05f, -3.27f, 1.67f, -5.21f, 1.67f)
            curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
            close()
            moveTo(12.92f, 17.92f)
            curveToRelative(-0.3f, 0.05f, -0.61f, 0.08f, -0.92f, 0.08f)
            curveToRelative(-2.62f, 0f, -4.85f, -1.69f, -5.66f, -4.03f)
            curveToRelative(-0.11f, 0.02f, -0.22f, 0.03f, -0.34f, 0.03f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            curveToRelative(0f, -0.81f, 0.48f, -1.51f, 1.18f, -1.82f)
            close()
        }
    }.also { _NoChild = it }
