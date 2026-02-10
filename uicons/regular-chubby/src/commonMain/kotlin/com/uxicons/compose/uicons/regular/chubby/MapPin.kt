package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPin: ImageVector? = null

val Icons.Rc.MapPin: ImageVector
    get() = _MapPin ?: UXIcon(name = "MapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7f)
                curveToRelative(0f, -4.04f, -1.96f, -6f, -6f, -6f)
                curveToRelative(-3.98f, 0f, -6f, 2.02f, -6f, 6f)
                curveToRelative(0f, 3.69f, 1.64f, 5.64f, 5f, 5.96f)
                verticalLineToRelative(9.04f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-9.04f)
                curveToRelative(3.36f, -0.31f, 5f, -2.27f, 5f, -5.96f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-2.53f, 0f, -4f, -0.65f, -4f, -4f)
                curveToRelative(0f, -2.88f, 1.12f, -4f, 4f, -4f)
                curveToRelative(2.53f, 0f, 4f, 0.65f, 4f, 4f)
                reflectiveCurveToRelative(-1.47f, 4f, -4f, 4f)
                close()
            }
        }.also { _MapPin = it}
