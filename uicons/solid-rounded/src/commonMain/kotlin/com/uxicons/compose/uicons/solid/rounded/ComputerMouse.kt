package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ComputerMouse: ImageVector? = null

val Icons.Sr.ComputerMouse: ImageVector
    get() = _ComputerMouse ?: UXIcon(name = "ComputerMouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 10f)
                horizontalLineToRelative(-7f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                verticalLineToRelative(7f)
                close()
                moveTo(4f, 16f)
                curveToRelative(0f, 4.41f, 3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                verticalLineToRelative(-4f)
                lineTo(4f, 12f)
                verticalLineToRelative(4f)
                close()
                moveTo(20f, 10f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                close()
                moveTo(13f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineTo(13f, 1f)
                close()
            }
        }.also { _ComputerMouse = it}
