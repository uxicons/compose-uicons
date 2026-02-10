package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ToggleOff: ImageVector? = null

val Icons.Sc.ToggleOff: ImageVector
    get() = _ToggleOff ?: UXIcon(name = "ToggleOff") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 12f)
                curveToRelative(0f, 1.59f, -0.41f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.41f, -2f, -2f)
                reflectiveCurveToRelative(0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 5.53f, -2.47f, 8f, -8f, 8f)
                horizontalLineToRelative(-6f)
                curveToRelative(-5.53f, 0f, -8f, -2.47f, -8f, -8f)
                reflectiveCurveToRelative(2.47f, -8f, 8f, -8f)
                horizontalLineToRelative(6f)
                curveToRelative(5.53f, 0f, 8f, 2.47f, 8f, 8f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, -2.69f, -1.31f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.31f, 4f, -4f)
                close()
            }
        }.also { _ToggleOff = it}
