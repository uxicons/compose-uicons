package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToggleOn: ImageVector? = null

val Icons.Tc.ToggleOn: ImageVector
    get() = _ToggleOn ?: UXIcon(name = "ToggleOn") {
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
                moveTo(19f, 12f)
                curveToRelative(0f, 2.77f, -1.23f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.23f, -4f, -4f)
                reflectiveCurveToRelative(1.23f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.23f, 4f, 4f)
                close()
            }
        }.also { _ToggleOn = it}
