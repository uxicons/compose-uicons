package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bitcoin: ImageVector? = null

val Icons.Brand.Bitcoin: ImageVector
    get() = _Bitcoin ?: UXIcon(name = "Bitcoin") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.28f, 14.51f)
            curveToRelative(-0.41f, 1.64f, -3.16f, 0.75f, -4.05f, 0.53f)
            lineToRelative(0.72f, -2.9f)
            curveTo(11.84f, 12.36f, 14.71f, 12.8f, 14.28f, 14.51f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.69f, 10.27f)
            curveToRelative(-0.37f, 1.49f, -2.66f, 0.73f, -3.41f, 0.55f)
            lineToRelative(0.66f, -2.63f)
            curveTo(12.68f, 8.37f, 15.07f, 8.71f, 14.69f, 10.27f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.9f, 0.36f)
            curveToRelative(-6.43f, -1.6f, -12.94f, 2.31f, -14.54f, 8.74f)
            curveToRelative(-1.6f, 6.43f, 2.31f, 12.94f, 8.73f, 14.54f)
            curveToRelative(6.43f, 1.6f, 12.94f, -2.31f, 14.54f, -8.74f)
            curveTo(25.24f, 8.47f, 21.33f, 1.96f, 14.9f, 0.36f)
            close()
            moveTo(9.53f, 8.1f)
            curveToRelative(0.02f, -0.28f, -0.08f, -0.63f, -0.61f, -0.77f)
            curveToRelative(0.02f, -0.01f, -0.96f, -0.24f, -0.96f, -0.24f)
            lineToRelative(0.35f, -1.41f)
            lineToRelative(1.82f, 0.45f)
            lineToRelative(-0.0f, 0.01f)
            curveToRelative(0.27f, 0.07f, 0.55f, 0.13f, 0.84f, 0.2f)
            lineToRelative(0.54f, -2.16f)
            lineToRelative(1.32f, 0.33f)
            lineToRelative(-0.53f, 2.12f)
            curveToRelative(0.35f, 0.08f, 0.71f, 0.16f, 1.05f, 0.25f)
            lineToRelative(0.53f, -2.11f)
            lineToRelative(1.32f, 0.33f)
            lineToRelative(-0.54f, 2.16f)
            curveToRelative(1.66f, 0.57f, 2.88f, 1.43f, 2.64f, 3.03f)
            curveToRelative(-0.17f, 1.17f, -0.82f, 1.74f, -1.68f, 1.93f)
            curveToRelative(1.18f, 0.61f, 1.78f, 1.56f, 1.21f, 3.19f)
            curveToRelative(-0.71f, 2.03f, -2.4f, 2.2f, -4.64f, 1.78f)
            lineToRelative(-0.55f, 2.18f)
            lineToRelative(-1.32f, -0.33f)
            lineToRelative(0.54f, -2.15f)
            curveToRelative(-0.34f, -0.09f, -0.69f, -0.17f, -1.05f, -0.27f)
            lineToRelative(-0.54f, 2.16f)
            lineToRelative(-1.32f, -0.33f)
            lineToRelative(0.55f, -2.19f)
            curveToRelative(-0.31f, -0.08f, -0.62f, -0.16f, -0.94f, -0.24f)
            lineToRelative(-1.71f, -0.43f)
            lineToRelative(0.65f, -1.51f)
            curveToRelative(0f, 0f, 0.97f, 0.26f, 0.96f, 0.24f)
            curveToRelative(0.37f, 0.09f, 0.54f, -0.15f, 0.6f, -0.31f)
            lineTo(9.53f, 8.1f)
            close()
        }
    }.also { _Bitcoin = it }
