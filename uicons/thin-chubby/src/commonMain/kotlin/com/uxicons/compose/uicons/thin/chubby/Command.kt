package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Command: ImageVector? = null

val Icons.Tc.Command: ImageVector
    get() = _Command ?: UXIcon(name = "Command") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 16f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(2.42f, 0f, 3.5f, -1.08f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.08f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.08f, -3.5f, 3.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -2.42f, -1.08f, -3.5f, -3.5f, -3.5f)
                reflectiveCurveToRelative(-3.5f, 1.08f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.08f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-2.42f, 0f, -3.5f, 1.08f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.08f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.08f, 3.5f, -3.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 2.42f, 1.08f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.08f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.08f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(17f, 4.5f)
                curveToRelative(0f, -1.87f, 0.63f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 0.63f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-0.63f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-2.5f)
                close()
                moveTo(4.5f, 7f)
                curveToRelative(-1.87f, 0f, -2.5f, -0.63f, -2.5f, -2.5f)
                reflectiveCurveToRelative(0.63f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 0.63f, 2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                close()
                moveTo(7f, 19.5f)
                curveToRelative(0f, 1.87f, -0.63f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -0.63f, -2.5f, -2.5f)
                reflectiveCurveToRelative(0.63f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(2.5f)
                close()
                moveTo(8f, 8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-8f)
                close()
                moveTo(19.5f, 22f)
                curveToRelative(-1.87f, 0f, -2.5f, -0.63f, -2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.87f, 0f, 2.5f, 0.63f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-0.63f, 2.5f, -2.5f, 2.5f)
                close()
            }
        }.also { _Command = it}
