package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CV: ImageVector? = null

val Icons.Br.CV: ImageVector
    get() = _CV ?: UXIcon(name = "CV") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.76f, 10.47f)
            lineToRelative(-1.07f, -5.25f)
            curveToRelative(-0.1f, -0.5f, 0.28f, -0.96f, 0.78f, -0.96f)
            curveToRelative(0.38f, 0f, 0.71f, 0.27f, 0.78f, 0.64f)
            lineToRelative(1.07f, 5.25f)
            curveToRelative(0.01f, 0.07f, 0.03f, 0.12f, 0.05f, 0.16f)
            curveToRelative(0.02f, -0.05f, 0.04f, -0.11f, 0.06f, -0.19f)
            lineToRelative(1.05f, -5.22f)
            curveToRelative(0.07f, -0.37f, 0.4f, -0.64f, 0.78f, -0.64f)
            curveToRelative(0.51f, 0f, 0.88f, 0.46f, 0.78f, 0.96f)
            lineToRelative(-1.05f, 5.21f)
            curveToRelative(-0.13f, 0.65f, -0.51f, 1.57f, -1.63f, 1.57f)
            reflectiveCurveToRelative(-1.51f, -0.97f, -1.62f, -1.53f)
            close()
            moveTo(8.5f, 5.6f)
            curveToRelative(0.41f, 0f, 0.75f, 0.27f, 0.86f, 0.65f)
            curveToRelative(0.02f, 0.08f, 0.03f, 0.76f, 0.83f, 0.76f)
            reflectiveCurveToRelative(0.81f, -0.7f, 0.8f, -0.8f)
            curveToRelative(-0.15f, -1.24f, -1.22f, -2.2f, -2.5f, -2.2f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            curveToRelative(1.28f, 0f, 2.35f, -0.96f, 2.5f, -2.2f)
            curveToRelative(0.01f, -0.1f, -0.03f, -0.8f, -0.8f, -0.8f)
            reflectiveCurveToRelative(-0.81f, 0.67f, -0.83f, 0.75f)
            curveToRelative(-0.11f, 0.38f, -0.46f, 0.65f, -0.87f, 0.65f)
            curveToRelative(-0.5f, 0f, -0.9f, -0.4f, -0.9f, -0.9f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.5f, 0.4f, -0.9f, 0.9f, -0.9f)
            close()
            moveTo(22f, 5.5f)
            verticalLineToRelative(10.34f)
            curveToRelative(0f, 1.47f, -0.57f, 2.85f, -1.61f, 3.89f)
            lineToRelative(-2.66f, 2.66f)
            curveToRelative(-1.04f, 1.04f, -2.42f, 1.61f, -3.89f, 1.61f)
            horizontalLineToRelative(-6.34f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(2f, 5.5f)
            curveTo(2f, 2.47f, 4.47f, 0f, 7.5f, 0f)
            horizontalLineToRelative(9f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(7.5f, 21f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            lineTo(19f, 5.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(7.5f, 3f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            close()
        }
    }.also { _CV = it }
