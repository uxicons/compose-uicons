package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerMouse: ImageVector? = null

val Icons.Rs.ComputerMouse: ImageVector
    get() = _ComputerMouse ?: UXIcon(name = "ComputerMouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 3f)
                horizontalLineToRelative(-2.5f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                lineTo(20f, 7.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(15.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(8.5f, 5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _ComputerMouse = it}
