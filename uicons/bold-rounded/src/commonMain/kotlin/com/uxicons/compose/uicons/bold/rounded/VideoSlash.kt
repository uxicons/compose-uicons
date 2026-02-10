package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VideoSlash: ImageVector? = null

val Icons.Br.VideoSlash: ImageVector
    get() = _VideoSlash ?: UXIcon(name = "VideoSlash") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 19.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(19f, 15.5f)
            curveToRelative(0f, 0.42f, -0.06f, 0.82f, -0.15f, 1.23f)
            lineToRelative(4.71f, 4.71f)
            curveToRelative(0.59f, 0.58f, 0.59f, 1.54f, 0f, 2.12f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineTo(0.44f, 2.56f)
            curveTo(-0.15f, 1.98f, -0.15f, 1.02f, 0.44f, 0.44f)
            curveTo(1.02f, -0.15f, 1.98f, -0.15f, 2.56f, 0.44f)
            lineToRelative(2.58f, 2.58f)
            curveToRelative(0.12f, -0.01f, 0.24f, -0.02f, 0.36f, -0.02f)
            lineTo(13.5f, 3f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            verticalLineToRelative(0.72f)
            lineToRelative(1.89f, -1.83f)
            curveToRelative(0.59f, -0.45f, 1.37f, -0.52f, 2.04f, -0.18f)
            curveToRelative(0.66f, 0.33f, 1.07f, 1.0f, 1.07f, 1.74f)
            verticalLineToRelative(5.97f)
            curveToRelative(0f, 0.73f, -0.34f, 1.45f, -0.97f, 1.82f)
            curveToRelative(-0.31f, 0.18f, -0.64f, 0.27f, -0.98f, 0.27f)
            curveToRelative(-0.41f, 0f, -0.82f, -0.13f, -1.17f, -0.39f)
            lineToRelative(-1.89f, -1.79f)
            verticalLineToRelative(0.68f)
            close()
            moveTo(16f, 13.88f)
            verticalLineToRelative(-5.38f)
            curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
            horizontalLineToRelative(-5.38f)
            lineToRelative(7.88f, 7.88f)
            close()
        }
    }.also { _VideoSlash = it }
