package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DesktopArrowDown: ImageVector? = null

val Icons.Ts.DesktopArrowDown: ImageVector
    get() = _DesktopArrowDown ?: UXIcon(name = "DesktopArrowDown") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.35f, 6.56f)
                lineToRelative(3.15f, 3.15f)
                lineTo(11.5f, 0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9.71f)
                lineToRelative(3.15f, -3.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(0.71f, -0.71f)
                close()
                moveTo(12.5f, 19f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(1f)
                lineTo(6f, 23f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(-3f)
                lineTo(0f, 19f)
                lineTo(0f, 3.5f)
                curveTo(0f, 2.12f, 1.12f, 1f, 2.5f, 1f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(1f)
                lineTo(2.5f, 2f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(15.5f)
                horizontalLineToRelative(-11.5f)
                close()
                moveTo(23f, 18f)
                verticalLineToRelative(-3f)
                lineTo(1f, 15f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(22f)
                close()
            }
        }.also { _DesktopArrowDown = it}
