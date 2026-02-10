package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPin: ImageVector? = null

val Icons.Sc.MapPin: ImageVector
    get() = _MapPin ?: UXIcon(name = "MapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7f)
                curveToRelative(0f, -4.04f, -1.96f, -6f, -6f, -6f)
                curveToRelative(-3.98f, 0f, -6f, 2.02f, -6f, 6f)
                curveToRelative(0f, 3.5f, 1.48f, 5.44f, 4.5f, 5.89f)
                verticalLineToRelative(8.61f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-8.61f)
                curveToRelative(3.02f, -0.45f, 4.5f, -2.39f, 4.5f, -5.89f)
                close()
            }
        }.also { _MapPin = it}
