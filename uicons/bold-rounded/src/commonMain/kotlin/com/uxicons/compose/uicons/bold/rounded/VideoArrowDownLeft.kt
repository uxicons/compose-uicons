package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoArrowDownLeft: ImageVector? = null

val Icons.Br.VideoArrowDownLeft: ImageVector
    get() = _VideoArrowDownLeft ?: UXIcon(name = "VideoArrowDownLeft") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.56f, 8.44f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            lineToRelative(-2.91f, 2.91f)
            lineToRelative(1.11f, 1.11f)
            curveToRelative(0.53f, 0.53f, 0.15f, 1.42f, -0.59f, 1.42f)
            horizontalLineToRelative(-3.97f)
            curveToRelative(-0.66f, 0f, -1.2f, -0.54f, -1.2f, -1.2f)
            verticalLineToRelative(-3.97f)
            curveToRelative(0f, -0.74f, 0.9f, -1.11f, 1.42f, -0.59f)
            lineToRelative(1.11f, 1.11f)
            lineToRelative(2.91f, -2.91f)
            curveToRelative(0.59f, -0.59f, 1.53f, -0.59f, 2.12f, 0f)
            close()
            moveTo(24f, 7.43f)
            verticalLineToRelative(8.98f)
            curveToRelative(0f, 0.73f, -0.34f, 1.45f, -0.97f, 1.82f)
            curveToRelative(-0.31f, 0.18f, -0.64f, 0.27f, -0.98f, 0.27f)
            curveToRelative(-0.41f, 0f, -0.82f, -0.13f, -1.17f, -0.39f)
            lineToRelative(-1.95f, -1.85f)
            curveToRelative(-0.37f, 2.67f, -2.67f, 4.74f, -5.44f, 4.74f)
            lineTo(5.5f, 21.0f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveTo(0f, 5.47f, 2.47f, 3f, 5.5f, 3f)
            lineTo(13.5f, 3f)
            curveToRelative(2.78f, 0f, 5.08f, 2.08f, 5.44f, 4.76f)
            lineToRelative(1.94f, -1.88f)
            curveToRelative(0.59f, -0.45f, 1.37f, -0.52f, 2.04f, -0.18f)
            curveToRelative(0.66f, 0.33f, 1.07f, 1.0f, 1.07f, 1.74f)
            close()
            moveTo(16f, 8.5f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            lineTo(5.5f, 6.0f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            lineTo(13.5f, 18.0f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            close()
        }
    }.also { _VideoArrowDownLeft = it }
