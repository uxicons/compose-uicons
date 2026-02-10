package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToggleOn: ImageVector? = null

val Icons.Sc.ToggleOn: ImageVector
    get() = _ToggleOn ?: UXIcon(name = "ToggleOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 4f)
                horizontalLineToRelative(-6f)
                curveToRelative(-5.53f, 0f, -8f, 2.47f, -8f, 8f)
                reflectiveCurveToRelative(2.47f, 8f, 8f, 8f)
                horizontalLineToRelative(6f)
                curveToRelative(5.53f, 0f, 8f, -2.47f, 8f, -8f)
                reflectiveCurveToRelative(-2.47f, -8f, -8f, -8f)
                close()
                moveTo(15f, 16f)
                curveToRelative(-2.65f, 0f, -4f, -1.35f, -4f, -4f)
                reflectiveCurveToRelative(1.35f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.35f, 4f, 4f)
                reflectiveCurveToRelative(-1.35f, 4f, -4f, 4f)
                close()
            }
        }.also { _ToggleOn = it}
