package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopArrowDown: ImageVector? = null

val Icons.Ss.DesktopArrowDown: ImageVector
    get() = _DesktopArrowDown ?: UXIcon(name = "DesktopArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineTo(0f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-11f)
                close()
                moveTo(21f, 1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(7f)
                lineToRelative(2.29f, -2.29f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.41f, -0.58f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                verticalLineTo(1f)
                horizontalLineTo(3f)
                curveTo(1.34f, 1f, 0f, 2.34f, 0f, 4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(24f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
            }
        }.also { _DesktopArrowDown = it}
