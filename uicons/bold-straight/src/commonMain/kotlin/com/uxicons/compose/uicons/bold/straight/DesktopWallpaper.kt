package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopWallpaper: ImageVector? = null

val Icons.Bs.DesktopWallpaper: ImageVector
    get() = _DesktopWallpaper ?: UXIcon(name = "DesktopWallpaper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(13.5f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(3f)
                lineTo(6f, 24f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15.5f)
                lineTo(13.5f, 19f)
                close()
                moveTo(21f, 16f)
                verticalLineToRelative(-6.88f)
                lineToRelative(-6f, 6f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4.88f, 4.88f)
                horizontalLineToRelative(14.88f)
                close()
                moveTo(3f, 3.5f)
                lineTo(3f, 14.88f)
                lineTo(11f, 6.88f)
                lineToRelative(4f, 4f)
                lineToRelative(6f, -6f)
                verticalLineToRelative(-1.38f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                close()
            }
        }.also { _DesktopWallpaper = it}
