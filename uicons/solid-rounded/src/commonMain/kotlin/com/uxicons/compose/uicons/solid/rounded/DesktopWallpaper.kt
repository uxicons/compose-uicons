package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopWallpaper: ImageVector? = null

val Icons.Sr.DesktopWallpaper: ImageVector
    get() = _DesktopWallpaper ?: UXIcon(name = "DesktopWallpaper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.39f, 9.98f)
                lineToRelative(0.63f, 0.64f)
                curveToRelative(0.54f, 0.54f, 1.41f, 0.54f, 1.95f, 0f)
                lineToRelative(7.26f, -7.26f)
                curveToRelative(-0.89f, -1.41f, -2.45f, -2.35f, -4.24f, -2.35f)
                lineTo(5f, 1.01f)
                curveTo(2.24f, 1f, 0f, 3.24f, 0f, 6f)
                lineTo(0f, 14f)
                curveToRelative(0f, 1.27f, 0.48f, 2.44f, 1.27f, 3.32f)
                lineToRelative(7.34f, -7.34f)
                curveToRelative(1.32f, -1.32f, 3.46f, -1.32f, 4.78f, 0f)
                close()
                moveTo(5.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
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
                curveToRelative(-0.76f, 0f, -1.47f, -0.17f, -2.12f, -0.47f)
                lineToRelative(7.14f, -7.14f)
                curveToRelative(0.54f, -0.54f, 1.41f, -0.54f, 1.95f, 0f)
                lineToRelative(0.63f, 0.64f)
                curveToRelative(1.32f, 1.32f, 3.46f, 1.32f, 4.78f, 0f)
                lineToRelative(6.58f, -6.58f)
                curveToRelative(0.02f, 0.18f, 0.03f, 0.37f, 0.03f, 0.55f)
                close()
            }
        }.also { _DesktopWallpaper = it}
