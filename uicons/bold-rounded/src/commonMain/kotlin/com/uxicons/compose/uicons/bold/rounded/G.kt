package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _G: ImageVector? = null

val Icons.Br.G: ImageVector
    get() = _G ?: UXIcon(name = "G") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.05f, 24f)
            curveToRelative(-2.73f, 0f, -5.24f, -1.04f, -7.12f, -2.92f)
            curveToRelative(-1.89f, -1.89f, -2.92f, -4.39f, -2.92f, -7.06f)
            verticalLineToRelative(-3.72f)
            curveToRelative(0f, -2.81f, 1.16f, -5.54f, 3.19f, -7.5f)
            curveTo(7.15f, 0.9f, 9.69f, -0.08f, 12.34f, 0.01f)
            curveToRelative(3.71f, 0.13f, 7.03f, 2.27f, 8.69f, 5.6f)
            curveToRelative(0.37f, 0.74f, 0.07f, 1.64f, -0.68f, 2.01f)
            curveToRelative(-0.74f, 0.37f, -1.64f, 0.07f, -2.01f, -0.68f)
            curveToRelative(-1.16f, -2.34f, -3.5f, -3.85f, -6.1f, -3.94f)
            curveToRelative(-1.82f, -0.06f, -3.59f, 0.63f, -4.96f, 1.95f)
            curveToRelative(-1.45f, 1.4f, -2.28f, 3.34f, -2.28f, 5.34f)
            verticalLineToRelative(3.72f)
            curveToRelative(-0.06f, 7.64f, 10.8f, 9.48f, 13.85f, 3.12f)
            curveToRelative(0.32f, -0.66f, 0.05f, -1.21f, -0.08f, -1.42f)
            curveToRelative(-0.14f, -0.21f, -0.53f, -0.71f, -1.28f, -0.71f)
            horizontalLineToRelative(-3.98f)
            curveToRelative(-1.97f, -0.03f, -1.97f, -2.97f, 0f, -3f)
            horizontalLineToRelative(3.98f)
            curveToRelative(1.56f, 0f, 3.0f, 0.79f, 3.83f, 2.12f)
            curveToRelative(0.82f, 1.32f, 0.91f, 2.93f, 0.24f, 4.32f)
            curveToRelative(-1.71f, 3.53f, -5.18f, 5.56f, -9.5f, 5.55f)
            close()
        }
    }.also { _G = it }
