package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Neuter: ImageVector? = null

val Icons.Rc.Neuter: ImageVector
    get() = _Neuter ?: UXIcon(name = "Neuter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 8f)
                curveToRelative(0f, -4.84f, -2.16f, -7f, -7f, -7f)
                reflectiveCurveToRelative(-7f, 2.16f, -7f, 7f)
                curveToRelative(0f, 4.49f, 1.86f, 6.67f, 6f, 6.96f)
                verticalLineToRelative(7.04f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7.04f)
                curveToRelative(4.14f, -0.29f, 6f, -2.47f, 6f, -6.96f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-3.74f, 0f, -5f, -1.26f, -5f, -5f)
                reflectiveCurveToRelative(1.26f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.26f, 5f, 5f)
                reflectiveCurveToRelative(-1.26f, 5f, -5f, 5f)
                close()
            }
        }.also { _Neuter = it}
