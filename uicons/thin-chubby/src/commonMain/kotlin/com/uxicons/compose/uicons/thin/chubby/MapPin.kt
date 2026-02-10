package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapPin: ImageVector? = null

val Icons.Tc.MapPin: ImageVector
    get() = _MapPin ?: UXIcon(name = "MapPin") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 7f)
                curveToRelative(0f, -5.32f, -3.21f, -6f, -6f, -6f)
                curveToRelative(-4.04f, 0f, -6f, 1.96f, -6f, 6f)
                curveToRelative(0f, 3.98f, 1.7f, 5.84f, 5.5f, 5.99f)
                verticalLineToRelative(9.51f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-9.51f)
                curveToRelative(2.66f, -0.09f, 5.5f, -0.99f, 5.5f, -5.99f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-3.55f, 0f, -5f, -1.45f, -5f, -5f)
                curveToRelative(0f, -3.5f, 1.5f, -5f, 5f, -5f)
                curveToRelative(3.0f, 0f, 5f, 0.85f, 5f, 5f)
                reflectiveCurveToRelative(-2.0f, 5f, -5f, 5f)
                close()
            }
        }.also { _MapPin = it}
