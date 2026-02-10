package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerMouse: ImageVector? = null

val Icons.Ts.ComputerMouse: ImageVector
    get() = _ComputerMouse ?: UXIcon(name = "ComputerMouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 3f)
                horizontalLineToRelative(-3f)
                lineTo(12.5f, 0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                lineTo(20f, 7.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(15.5f, 4f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(3.5f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(3f)
                close()
                moveTo(8.5f, 4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                close()
            }
        }.also { _ComputerMouse = it}
