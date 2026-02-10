package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Neuter: ImageVector? = null

val Icons.Sc.Neuter: ImageVector
    get() = _Neuter ?: UXIcon(name = "Neuter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 8f)
                curveToRelative(0f, -4.78f, -2.23f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 2.22f, -7f, 7f)
                curveToRelative(0f, 4.24f, 1.76f, 6.47f, 5.5f, 6.91f)
                verticalLineToRelative(6.59f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-6.59f)
                curveToRelative(3.74f, -0.45f, 5.5f, -2.67f, 5.5f, -6.91f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-3.1f, 0f, -4f, -0.9f, -4f, -4f)
                reflectiveCurveToRelative(0.9f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 0.9f, 4f, 4f)
                reflectiveCurveToRelative(-0.9f, 4f, -4f, 4f)
                close()
            }
        }.also { _Neuter = it}
