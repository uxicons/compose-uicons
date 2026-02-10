package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopWallpaper: ImageVector? = null

val Icons.Tr.DesktopWallpaper: ImageVector
    get() = _DesktopWallpaper ?: UXIcon(name = "DesktopWallpaper") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(24f, 5.5f)
                lineTo(24f, 14.5f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                lineTo(7f, 23f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4.5f)
                verticalLineToRelative(-3f)
                lineTo(4.5f, 19f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                lineTo(0f, 5.5f)
                curveTo(0f, 3.02f, 2.02f, 1f, 4.5f, 1f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(1f, 14.5f)
                curveToRelative(0f, 0.74f, 0.23f, 1.43f, 0.63f, 2f)
                lineToRelative(6.67f, -6.67f)
                curveToRelative(1.09f, -1.09f, 2.98f, -1.09f, 4.07f, 0f)
                lineToRelative(0.63f, 0.63f)
                curveToRelative(0.71f, 0.71f, 1.95f, 0.71f, 2.66f, 0f)
                lineToRelative(6.81f, -6.81f)
                curveToRelative(-0.62f, -0.99f, -1.72f, -1.66f, -2.97f, -1.66f)
                lineTo(4.5f, 1.99f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(1f, 14.5f)
                close()
                moveTo(23f, 5.5f)
                curveToRelative(0f, -0.29f, -0.04f, -0.58f, -0.1f, -0.85f)
                lineToRelative(-6.52f, 6.52f)
                curveToRelative(-1.09f, 1.09f, -2.98f, 1.09f, -4.07f, 0f)
                lineToRelative(-0.63f, -0.63f)
                curveToRelative(-0.71f, -0.71f, -1.95f, -0.71f, -2.66f, 0f)
                lineToRelative(-6.69f, 6.69f)
                curveToRelative(0.6f, 0.48f, 1.36f, 0.77f, 2.19f, 0.77f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
                lineTo(23.02f, 5.5f)
                close()
            }
        }.also { _DesktopWallpaper = it}
