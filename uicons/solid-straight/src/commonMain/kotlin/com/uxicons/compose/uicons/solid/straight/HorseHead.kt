package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HorseHead: ImageVector? = null

val Icons.Ss.HorseHead: ImageVector
    get() = _HorseHead ?: UXIcon(name = "HorseHead") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.98f, 17.18f)
                curveToRelative(-0.1f, -1.13f, -0.68f, -2.19f, -1.59f, -2.91f)
                curveToRelative(-2.75f, -2.16f, -3.85f, -4.38f, -4.92f, -6.53f)
                curveToRelative(-0.71f, -1.43f, -1.38f, -2.78f, -2.46f, -3.97f)
                lineTo(15f, 0f)
                curveToRelative(-1.91f, 0f, -3.5f, 1.33f, -3.9f, 3.12f)
                curveTo(4.2f, 3.92f, 0f, 8.89f, 0f, 16.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(15.07f)
                lineToRelative(-0.08f, -0.15f)
                curveToRelative(-1.33f, -2.41f, -2.11f, -4.49f, -2.15f, -4.6f)
                lineToRelative(-0.84f, -2.25f)
                lineToRelative(9.85f, 4.55f)
                curveToRelative(0.25f, -0.28f, 0.62f, -0.7f, 1.12f, -1.26f)
                curveToRelative(0.75f, -0.84f, 1.12f, -1.98f, 1.02f, -3.1f)
                close()
                moveTo(14.5f, 13f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _HorseHead = it}
