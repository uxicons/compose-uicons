package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToggleOff: ImageVector? = null

val Icons.Tc.ToggleOff: ImageVector
    get() = _ToggleOff ?: UXIcon(name = "ToggleOff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-5.61f, 0f, -8f, 2.39f, -8f, 8f)
                reflectiveCurveToRelative(2.39f, 8f, 8f, 8f)
                horizontalLineToRelative(6f)
                curveToRelative(5.61f, 0f, 8f, -2.39f, 8f, -8f)
                reflectiveCurveToRelative(-2.39f, -8f, -8f, -8f)
                close()
                moveTo(15f, 19f)
                horizontalLineToRelative(-6f)
                curveToRelative(-5.1f, 0f, -7f, -1.9f, -7f, -7f)
                reflectiveCurveToRelative(1.9f, -7f, 7f, -7f)
                horizontalLineToRelative(6f)
                curveToRelative(5.1f, 0f, 7f, 1.9f, 7f, 7f)
                reflectiveCurveToRelative(-1.9f, 7f, -7f, 7f)
                close()
                moveTo(9f, 8f)
                curveToRelative(-2.77f, 0f, -4f, 1.23f, -4f, 4f)
                reflectiveCurveToRelative(1.23f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.23f, 4f, -4f)
                reflectiveCurveToRelative(-1.23f, -4f, -4f, -4f)
                close()
                moveTo(9f, 15f)
                curveToRelative(-2.21f, 0f, -3f, -0.79f, -3f, -3f)
                reflectiveCurveToRelative(0.79f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.79f, 3f, 3f)
                reflectiveCurveToRelative(-0.79f, 3f, -3f, 3f)
                close()
            }
        }.also { _ToggleOff = it}
