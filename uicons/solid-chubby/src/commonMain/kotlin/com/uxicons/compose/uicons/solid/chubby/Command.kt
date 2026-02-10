package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Command: ImageVector? = null

val Icons.Sc.Command: ImageVector
    get() = _Command ?: UXIcon(name = "Command") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.5f, 14f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1.5f)
                curveToRelative(2.99f, 0f, 4.5f, -1.51f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-1.51f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 1.51f, -4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.99f, -1.51f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 1.51f, -4.5f, 4.5f)
                reflectiveCurveToRelative(1.51f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-2.99f, 0f, -4.5f, 1.51f, -4.5f, 4.5f)
                reflectiveCurveToRelative(1.51f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -1.51f, 4.5f, -4.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 2.99f, 1.51f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -1.51f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-1.51f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(17f, 5.5f)
                curveToRelative(0f, -1.32f, 0.18f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.18f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.18f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(5.5f, 7f)
                curveToRelative(-1.32f, 0f, -1.5f, -0.18f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.18f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.18f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(7f, 18.5f)
                curveToRelative(0f, 1.32f, -0.18f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.18f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.18f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                close()
                moveTo(10f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                close()
                moveTo(18.5f, 20f)
                curveToRelative(-1.32f, 0f, -1.5f, -0.18f, -1.5f, -1.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.32f, 0f, 1.5f, 0.18f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.18f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Command = it}
