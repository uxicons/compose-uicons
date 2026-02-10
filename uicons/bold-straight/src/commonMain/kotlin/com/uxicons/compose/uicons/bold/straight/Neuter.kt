package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Neuter: ImageVector? = null

val Icons.Bs.Neuter: ImageVector
    get() = _Neuter ?: UXIcon(name = "Neuter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                reflectiveCurveTo(4f, 3.59f, 4f, 8f)
                curveToRelative(0f, 3.9f, 2.8f, 7.15f, 6.5f, 7.86f)
                verticalLineToRelative(8.14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8.14f)
                curveToRelative(3.7f, -0.7f, 6.5f, -3.96f, 6.5f, -7.86f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _Neuter = it}
