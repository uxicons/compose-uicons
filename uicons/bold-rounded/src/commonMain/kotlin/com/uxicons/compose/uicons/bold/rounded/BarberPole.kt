package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarberPole: ImageVector? = null

val Icons.Br.BarberPole: ImageVector
    get() = _BarberPole ?: UXIcon(name = "BarberPole") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 18f)
            horizontalLineToRelative(-0.5f)
            lineTo(18f, 6f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.31f)
            curveToRelative(-1.04f, -1.79f, -2.97f, -3f, -5.19f, -3f)
            reflectiveCurveToRelative(-4.15f, 1.21f, -5.19f, 3f)
            horizontalLineToRelative(-1.31f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(12f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1.31f)
            curveToRelative(1.04f, 1.79f, 2.97f, 3f, 5.19f, 3f)
            reflectiveCurveToRelative(4.15f, -1.21f, 5.19f, -3f)
            horizontalLineToRelative(1.31f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(9f, 7.62f)
            lineToRelative(6f, 6f)
            verticalLineToRelative(2.76f)
            lineToRelative(-6f, -6f)
            verticalLineToRelative(-2.76f)
            close()
            moveTo(15f, 9.38f)
            lineToRelative(-3.38f, -3.38f)
            horizontalLineToRelative(3.38f)
            verticalLineToRelative(3.38f)
            close()
            moveTo(9f, 14.62f)
            lineToRelative(3.38f, 3.38f)
            horizontalLineToRelative(-3.38f)
            verticalLineToRelative(-3.38f)
            close()
        }
    }.also { _BarberPole = it }
