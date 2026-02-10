package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPin: ImageVector? = null

val Icons.Ts.MapPin: ImageVector
    get() = _MapPin ?: UXIcon(name = "MapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 6f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                reflectiveCurveTo(6f, 2.69f, 6f, 6f)
                curveToRelative(0f, 3.14f, 2.42f, 5.72f, 5.5f, 5.98f)
                verticalLineToRelative(12.02f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 11.98f)
                curveToRelative(3.08f, -0.26f, 5.5f, -2.84f, 5.5f, -5.98f)
                close()
                moveTo(12f, 11f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveTo(9.24f, 1f, 12f, 1f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _MapPin = it}
