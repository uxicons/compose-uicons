package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToggleOff: ImageVector? = null

val Icons.Rc.ToggleOff: ImageVector
    get() = _ToggleOff ?: UXIcon(name = "ToggleOff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-5.53f, 0f, -8f, 2.47f, -8f, 8f)
                reflectiveCurveToRelative(2.47f, 8f, 8f, 8f)
                horizontalLineToRelative(6f)
                curveToRelative(5.53f, 0f, 8f, -2.47f, 8f, -8f)
                reflectiveCurveToRelative(-2.47f, -8f, -8f, -8f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-6f)
                curveToRelative(-4.43f, 0f, -6f, -1.57f, -6f, -6f)
                reflectiveCurveToRelative(1.57f, -6f, 6f, -6f)
                horizontalLineToRelative(6f)
                curveToRelative(4.43f, 0f, 6f, 1.57f, 6f, 6f)
                reflectiveCurveToRelative(-1.57f, 6f, -6f, 6f)
                close()
                moveTo(9f, 8f)
                curveToRelative(-2.69f, 0f, -4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.31f, 4f, -4f)
                reflectiveCurveToRelative(-1.31f, -4f, -4f, -4f)
                close()
                moveTo(9f, 14f)
                curveToRelative(-1.59f, 0f, -2f, -0.41f, -2f, -2f)
                reflectiveCurveToRelative(0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                reflectiveCurveToRelative(-0.41f, 2f, -2f, 2f)
                close()
            }
        }.also { _ToggleOff = it}
