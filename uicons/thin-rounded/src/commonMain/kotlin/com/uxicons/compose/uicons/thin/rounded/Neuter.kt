package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Neuter: ImageVector? = null

val Icons.Tr.Neuter: ImageVector
    get() = _Neuter ?: UXIcon(name = "Neuter") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                reflectiveCurveTo(4f, 3.59f, 4f, 8f)
                curveToRelative(0f, 4.24f, 3.32f, 7.71f, 7.5f, 7.97f)
                verticalLineToRelative(7.53f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-7.53f)
                curveToRelative(4.18f, -0.26f, 7.5f, -3.73f, 7.5f, -7.97f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveTo(8.14f, 1f, 12f, 1f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
            }
        }.also { _Neuter = it}
