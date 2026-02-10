package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopWallpaper: ImageVector? = null

val Icons.Br.DesktopWallpaper: ImageVector
    get() = _DesktopWallpaper ?: UXIcon(name = "DesktopWallpaper") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 6.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(24f, 5.5f)
            lineTo(24f, 13.5f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(7.5f, 24f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-2f)
            lineTo(5.5f, 19f)
            curveToRelative(-3.03f, 0f, -5.5f, -2.47f, -5.5f, -5.5f)
            lineTo(0f, 5.5f)
            curveTo(0f, 2.47f, 2.47f, 0f, 5.5f, 0f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
            close()
            moveTo(3f, 13.5f)
            curveToRelative(0f, 0.4f, 0.1f, 0.78f, 0.26f, 1.12f)
            lineToRelative(4.99f, -4.99f)
            curveToRelative(1.51f, -1.51f, 3.97f, -1.51f, 5.49f, 0f)
            lineToRelative(0.63f, 0.64f)
            curveToRelative(0.34f, 0.34f, 0.9f, 0.34f, 1.24f, 0f)
            lineToRelative(5.31f, -5.31f)
            curveToRelative(-0.25f, -1.11f, -1.25f, -1.94f, -2.44f, -1.94f)
            lineTo(5.5f, 3.02f)
            curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
            lineTo(3f, 13.5f)
            close()
            moveTo(21f, 13.5f)
            verticalLineToRelative(-4.38f)
            lineToRelative(-3.26f, 3.26f)
            curveToRelative(-1.51f, 1.51f, -3.97f, 1.51f, -5.49f, 0f)
            lineToRelative(-0.63f, -0.64f)
            curveToRelative(-0.34f, -0.34f, -0.9f, -0.34f, -1.24f, 0f)
            lineToRelative(-4.26f, 4.26f)
            horizontalLineToRelative(12.38f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            close()
        }
    }.also { _DesktopWallpaper = it }
