package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopWallpaper: ImageVector? = null

val Icons.Rr.DesktopWallpaper: ImageVector
    get() = _DesktopWallpaper ?: UXIcon(name = "DesktopWallpaper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(24f, 6f)
                lineTo(24f, 14f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                lineTo(7f, 23f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                lineTo(5f, 19f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 6f)
                curveTo(0f, 3.24f, 2.24f, 1f, 5f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                close()
                moveTo(2f, 14f)
                curveToRelative(0f, 0.72f, 0.26f, 1.38f, 0.68f, 1.9f)
                lineToRelative(5.93f, -5.93f)
                curveToRelative(1.32f, -1.32f, 3.46f, -1.32f, 4.78f, 0f)
                lineToRelative(0.63f, 0.64f)
                curveToRelative(0.54f, 0.54f, 1.41f, 0.54f, 1.95f, 0f)
                lineToRelative(5.78f, -5.78f)
                curveToRelative(-0.46f, -1.07f, -1.52f, -1.83f, -2.76f, -1.83f)
                lineTo(5f, 3f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 14f)
                close()
                moveTo(22f, 14f)
                lineTo(22f, 7.41f)
                lineToRelative(-4.61f, 4.61f)
                curveToRelative(-1.32f, 1.32f, -3.46f, 1.32f, -4.78f, 0f)
                lineToRelative(-0.63f, -0.64f)
                curveToRelative(-0.54f, -0.54f, -1.41f, -0.54f, -1.95f, 0f)
                lineToRelative(-5.56f, 5.56f)
                curveToRelative(0.17f, 0.03f, 0.35f, 0.05f, 0.54f, 0.05f)
                horizontalLineToRelative(14f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _DesktopWallpaper = it}
