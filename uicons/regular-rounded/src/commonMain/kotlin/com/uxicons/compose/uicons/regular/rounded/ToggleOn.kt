package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToggleOn: ImageVector? = null

val Icons.Rr.ToggleOn: ImageVector
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
                moveTo(16f, 18f)
                horizontalLineToRelative(-8f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                horizontalLineToRelative(8f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
            }
        }.also { _ToggleOn = it}
