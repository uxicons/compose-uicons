package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopArrowDown: ImageVector? = null

val Icons.Bs.DesktopArrowDown: ImageVector
    get() = _DesktopArrowDown ?: UXIcon(name = "DesktopArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 7f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(3f)
                lineToRelative(-3.79f, 3.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-3.79f, -3.71f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 19f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10f)
                lineTo(3f, 13f)
                lineTo(3f, 3f)
                horizontalLineToRelative(5f)
                lineTo(8f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(10.5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(10.5f)
                close()
            }
        }.also { _DesktopArrowDown = it}
