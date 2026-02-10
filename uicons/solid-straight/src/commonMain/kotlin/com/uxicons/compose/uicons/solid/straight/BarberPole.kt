package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarberPole: ImageVector? = null

val Icons.Ss.BarberPole: ImageVector
    get() = _BarberPole ?: UXIcon(name = "BarberPole") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.84f, 6.01f)
                lineToRelative(-2.84f, -0.01f)
                lineToRelative(5f, 5f)
                verticalLineToRelative(2.85f)
                lineToRelative(-7.86f, -7.86f)
                horizontalLineToRelative(-2.83f)
                lineToRelative(10.68f, 10.68f)
                verticalLineToRelative(1.32f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.35f)
                curveToRelative(-0.83f, 2.33f, -3.04f, 4f, -5.65f, 4f)
                reflectiveCurveToRelative(-4.82f, -1.67f, -5.65f, -4f)
                horizontalLineToRelative(-1.35f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.17f)
                lineToRelative(2.16f, 2.16f)
                lineToRelative(2.84f, 0.01f)
                lineToRelative(-5f, -5f)
                verticalLineToRelative(-2.79f)
                lineToRelative(7.79f, 7.79f)
                horizontalLineToRelative(2.83f)
                lineTo(6f, 7.38f)
                verticalLineToRelative(-1.39f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.35f)
                curveTo(7.18f, 1.67f, 9.39f, 0f, 12f, 0f)
                reflectiveCurveToRelative(4.82f, 1.67f, 5.65f, 4f)
                horizontalLineToRelative(1.35f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.17f)
                lineToRelative(-2.16f, -2.16f)
                close()
            }
        }.also { _BarberPole = it}
