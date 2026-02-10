package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerMouse: ImageVector? = null

val Icons.Ss.ComputerMouse: ImageVector
    get() = _ComputerMouse ?: UXIcon(name = "ComputerMouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.04f, 10f)
                lineTo(13.04f, 2.94f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(2.56f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(4.04f, 12f)
                verticalLineToRelative(3.94f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-3.94f)
                lineTo(4.04f, 12f)
                close()
                moveTo(11.04f, 10f)
                lineTo(11.04f, 3f)
                lineToRelative(2f, -0.06f)
                lineTo(13.04f, -0.06f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(2.56f)
                horizontalLineToRelative(7f)
                close()
            }
        }.also { _ComputerMouse = it}
