package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoCameraAlt: ImageVector? = null

val Icons.Br.VideoCameraAlt: ImageVector
    get() = _VideoCameraAlt ?: UXIcon(name = "VideoCameraAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.93f, 5.7f)
            curveToRelative(-0.66f, -0.33f, -1.44f, -0.26f, -2.04f, 0.18f)
            lineToRelative(-1.94f, 1.88f)
            curveToRelative(-0.36f, -2.68f, -2.66f, -4.76f, -5.44f, -4.76f)
            lineTo(5.5f, 3f)
            curveTo(2.47f, 3f, 0f, 5.47f, 0f, 8.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            lineTo(13.5f, 21f)
            curveToRelative(2.77f, 0f, 5.07f, -2.06f, 5.44f, -4.74f)
            lineToRelative(1.95f, 1.85f)
            curveToRelative(0.35f, 0.26f, 0.75f, 0.39f, 1.17f, 0.39f)
            curveToRelative(0.34f, 0f, 0.67f, -0.09f, 0.98f, -0.27f)
            curveToRelative(0.63f, -0.36f, 0.97f, -1.09f, 0.97f, -1.82f)
            lineTo(24f, 7.43f)
            curveToRelative(0f, -0.74f, -0.41f, -1.41f, -1.07f, -1.74f)
            close()
            moveTo(16f, 15.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 18f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            lineTo(13.5f, 6f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(7f)
            close()
        }
    }.also { _VideoCameraAlt = it }
