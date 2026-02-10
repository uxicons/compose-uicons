package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Neuter: ImageVector? = null

val Icons.Tc.Neuter: ImageVector
    get() = _Neuter ?: UXIcon(name = "Neuter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 8f)
                curveToRelative(0f, -4.91f, -2.09f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 2.09f, -7f, 7f)
                curveToRelative(0f, 4.73f, 1.96f, 6.84f, 6.5f, 6.99f)
                verticalLineToRelative(7.51f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-7.51f)
                curveToRelative(4.54f, -0.14f, 6.5f, -2.25f, 6.5f, -6.99f)
                close()
                moveTo(12f, 14f)
                curveToRelative(-4.37f, 0f, -6f, -1.63f, -6f, -6f)
                reflectiveCurveToRelative(1.63f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 1.63f, 6f, 6f)
                reflectiveCurveToRelative(-1.63f, 6f, -6f, 6f)
                close()
            }
        }.also { _Neuter = it}
