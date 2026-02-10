package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopWallpaper: ImageVector? = null

val Icons.Rs.DesktopWallpaper: ImageVector
    get() = _DesktopWallpaper ?: UXIcon(name = "DesktopWallpaper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 6.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(13f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                lineTo(6f, 23f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                lineTo(0f, 19f)
                lineTo(0f, 4f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                lineTo(21f, 1f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(15f)
                lineTo(13f, 19f)
                close()
                moveTo(22f, 17f)
                lineTo(22f, 7.41f)
                lineToRelative(-7f, 7f)
                lineToRelative(-4f, -4f)
                lineToRelative(-6.59f, 6.59f)
                lineTo(22f, 17f)
                close()
                moveTo(2f, 4f)
                verticalLineToRelative(12.59f)
                lineTo(11f, 7.59f)
                lineToRelative(4f, 4f)
                lineToRelative(7f, -7f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _DesktopWallpaper = it}
