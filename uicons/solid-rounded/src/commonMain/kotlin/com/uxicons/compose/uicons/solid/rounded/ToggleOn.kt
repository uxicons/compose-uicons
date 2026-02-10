package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToggleOn: ImageVector? = null

val Icons.Sr.ToggleOn: ImageVector
    get() = _ToggleOn ?: UXIcon(name = "ToggleOn") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 4f)
                horizontalLineToRelative(-8f)
                curveTo(3.59f, 4f, 0f, 7.59f, 0f, 12f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(8f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                reflectiveCurveToRelative(-3.59f, -8f, -8f, -8f)
                close()
                moveTo(16f, 17f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _ToggleOn = it}
